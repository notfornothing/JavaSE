# IDEA 配置Vim折腾!!!

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

* ### zz

  这个快捷键会将当前光标所在行居中

* ### H/M/L

  这几个快捷键，可以帮你把光标移动到屏幕的上方/中间/下方，注意是要打开大写锁定或按住shift

  - H(high)：将光标移动到屏幕上方
  - M(middle)：将光标移动到屏幕中间
  - L(low)：将光标移动到屏幕下方

* `.` → (小数点) 可以重复上一次的命令
* `N<command>` → 重复某个命令N次



  

## vimrc

```vim
nnoremap H ^
nnoremap L $
```

