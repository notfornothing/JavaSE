# Git版本回退

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

如果C就是修改，现在又要改回来，将来可能再改成C，那你就revert

# remote



# 