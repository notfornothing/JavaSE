## Git版本回退

参考[廖雪峰的git教程](https://www.liaoxuefeng.com/wiki/896043488029600/897013573512192)

- `HEAD`指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令`git reset --hard commit_id`。
- 穿梭前，用`git log`可以查看提交历史，以便确定要回退到哪个版本。
- 要重返未来，用`git reflog`查看命令历史，以便确定要回到未来的哪个版本。

如果已经有A -> B -> C，想回到B：

方法一：reset到B，丢失C：

A -> B

方法二：再提交一个revert反向修改，变成B：

A -> B -> C -> B

C还在，但是两个B是重复的

看你的需求，也许C就是瞎提交错了（比如把密码提交上去了），必须reset

如果C就是修改，现在又要改回来，将来可能再改成C，那你就revert.



### //问题 可不可以 git reflog 查看C的分支的信息啊?!!!!!!

----

## remote

## 删除远程分支:

git push origin --delete <branch>

---

## 同步unStage的文件到本地:

git checkout ./

??????????????????????????????????????????????????????????????????????????





---

## git push 省略参数  

> 具体在 git config --local -l

再来说说git push -u和git branch --set-upstream-to=指令之间的区别。
举个例子：我要把本地分支master与远程仓库origin里的分支gaga建立关联。
（如果使用下列途径1的话，首先，你要切换到master分支上（git checkout master））
两个途径：1. git push -u origin gaga 2. git branch --set-upstream-to=origin/gaga master
这两种方式都可以达到目的。但是1方法更通用，因为你的远程库有可能并没有gaga分支，这种情况下你用2方法就不可行，连目标分支都不存在，怎么进行关联呢？所以可以总结一下：git push -u origin gaga 相当于 git push origin gaga + git branch --set-upstream-to=origin/gaga master