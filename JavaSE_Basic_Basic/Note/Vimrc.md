# Vim

---

学习vim就像学弹钢琴一样，一旦学会，受益无穷。



# 问题:

---




> 

# Get it

---

* **w	** 往下一个单词的第一个字母位置
* **W** 往下一个单词的第一个字母位置.但是连着,.(); 啥的也算一个单词
* **e** 往下一个单词的最后一个字母位置
* **E** 往下一个单词的最后一个字母位置.但是连着,.(); 啥的也算一个单词
* **0** 一行的顶部
* **0w** 一行的首部单词
* **cw** 修改一个单词,注意光标需要在第一个字母
* **bcw** 如果光标在单词内,就b上去再修改
* **ggvG** 全选
* **di(** 删除标点符号内的内容 只要在括号内就可以
* **vi(** 选中标点符号内的内容 只要在括号内就可以
* **cc** 删除一行并且进入插入模式
* **yypp** 复制一行到下一行
* **V** 可视化一整行

# Some Tricks

---

## vim自带的快速的增删改查

* 快速**删除**在normal模式下:

  > * **daw**（delete around word）这个会删除后面的空格
  > * **dw** 删除光标后的单词
  > * **diw** 删除光标所在的单词,不包括后面的空格
  > * **dt{char}** 光标删除到char之前的字符

* 快速**修改**在normal模式:

  > * **r	** (replace) 替换一个字符
  > * **cw** 删除光标后的单词,并进入插入模式
  > * **ciw** 删除光标所在的单词,不包括后面的空格并进入插入模式
  > * **caw** （delete around word）这个会删除后面的空格,并进入插入模式

* **1ciw,** **ci[, ci", ci(** 用这些命令改写文本

* **diw, di[, di", di(** 用这些命令删除文本

* **f{char}** 查找一个字符的时候,按一下没找到,那就可以按分号**;** 往前一个是 **/** 

* 在插入模式下:

  > **ctrl + h** 删除光标前面的字符
  > **ctrl + w** 删除光标前面的单词
  > **ctrl + u** 删除光标前面的该行所有内容
  >
  > **gi** 可以跳到编辑模式退出的位置,

* visual模式下按**o**可以反转

* **zz** 这个快捷键会将当前光标所在行居中

* 从windows复制的时候 用ctrl+shift+v粘贴

# Text-Object

---

* 在当前单词尾部加东西，就按**ea** （记为“End Append”)
* 在单词前面加东西，就按**bi** （记为 “Begin Insert”）
* 调换相邻两个字符，直接就记成**xp**
* 调换上下两行，直接就记成**ddp**







## IDEA 配置Vim

## IdeaVim配置注意:

在配置`action`时，可以把这个`action`直接在IDE内输入`:action {pattern}`看下效果。
 然后，配置`.ideavimrc/_ideavimrc`后，直接输入`:source ~/.ideavimrc`（`source C:\Users\<YourName>\_ideavimrc`）就可以直接看到效果。



## 技巧:

* i: 在光标前插入；一个小技巧：按8，再按i，进入插入模式，输入=， 按esc进入命令模式，就会出现8个=。 这在插入分割线时非常有用，如30i+<esc>就插入了36个+组成的分割线。

* 自动补全：ctrl + n
  \p<  插入一个include，并把光标置于<>中间
  \im  插入主函数
  \ip  插入printf，并自动添加\n，且把光标置于双引号中间
  vim快捷键补充（编辑模式）

  dw  删除一个单词（配合b：将光标置于所在单词的首部）
  yw  复制一个单词（配合p：粘贴）
  vim快捷键补充（插入与编辑模式通用）

  \rr  运行程序
  \rc  保存并编译程序（会生成二进制文件）

* ### 

  

* ### H/M/L

  这几个快捷键，可以帮你把光标移动到屏幕的上方/中间/下方，注意是要打开大写锁定或按住shift

  - H(high)：将光标移动到屏幕上方
  - M(middle)：将光标移动到屏幕中间
  - L(low)：将光标移动到屏幕下方

* `.` → (小数点) 可以重复上一次的命令

* `N<command>` → 重复某个命令N次



# .vimrc 配置参数

---

#### 解释:

* no recursive 是没有递归的意思
* map 是是映射的意思
* i 是insert 插入模式
* n 是normal 普通模式



#### 把方向键设置为空:

>imap <Up> <Nop>
>nmap <Up> <Nop>
>inoremap <Up> <Nop>
>nnoremap <Up> <Nop>

**inoremap**  --insert no recursive map
**nnoremap** --normal no recursive map

> **imap	** 可以设置
> **nmap	** 也可以设置
> 但是这样会调用递归,我的意思是原来调用的键失去了原来的效果.
> 所以用no recursive

#### <Leader>和mapleader变量

>  mapleader变量对所有map映射命令起效，它的作用是将参数<leader>替换成mapleader变量的值，比如：
>  :map <Leader>A oanother line<Esc>
>  如果mapleader变量没有设置，则用默认的反斜杠代替，因此这个映射等效于：
>  :map \A oanother line<Esc>
>  意思时输入\A键时，在下一行输入another line并返回到普通模式。
>  如果设置了mapleader变量，比如：
>  let mapleader = ","
>  那么就等效于：
>  :map ,A oanother line<Esc>


# vimrc

```vim
"没有递归禁用insert模式下方向键"
inoremap <Up> <Nop>
inoremap <Down> <Nop>
inoremap <Left> <Nop>
inoremap <Right> <Nop>

"没有递归禁用insert模式下方向键"
nnoremap <Up> <Nop>
nnoremap <Down> <Nop>
nnoremap <Left> <Nop>
nnoremap <Right> <Nop>


nnoremap j jzz
nnoremap k kzz


nnoremap L $
nnoremap H ^
set rnu
set nu
set ignorecase
```

