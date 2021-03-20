# Set

---

## 概述

* 不包含重复元素的Collection

* Set集合中元素是无序的(因为Set集合没有坐标)

* Set集合不可重复,常用来给数据去重

## 特点

* 数据无序 且数据不允许重复
* HashSet:底层是哈希表,包装了HashMap,相当于HashSet中存入数据时,会把数据作为K,存入内部的HashMap.当然K仍然不许重复
* TreeSet:底层是TreeMap,也是红黑树的形式,便于查找数据





## Set的add()不能重复.HashSet源码

---

关于重写equals和hashCode方法 ,引起的变化.

先看源码.put那里.因为不能重复.put 有判断

* 原因:

* Set<Integer> students = new HashSet<>();

* ```java
  //HashSet无参构造:
  public HashSet() {
      map = new HashMap<>();
  }
  ```

  ```java
  //HashSet的add()方法
   public boolean add(E e) {
       return map.put(e, PRESENT)==null;//PRESENT 是new Object, 就是凑个数
  }
  //添加用的是map集合里的 put方法.里面有一个特点,就是Key值不能重复
  ```

  //为什么Key不能重复呢?

  看看HashMap 的源码:

  ```java
    public V put(K key, V value) {
          return putVal(hash(key), key, value, false, true);
      }
  
   final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                     boolean evict) {
          Node<K,V>[] tab; Node<K,V> p; int n, i;
          if ((tab = table) == null || (n = tab.length) == 0)
              n = (tab = resize()).length;
          if ((p = tab[i = (n - 1) & hash]) == null)
              tab[i] = newNode(hash, key, value, null);
          else {
              Node<K,V> e; K k;
              //主要看这里
              if (p.hash == hash &&
                  ((k = p.key) == key || (key != null && key.equals(k))))
                  e = p;
              //这里往上
             
              else if ......
  ```

  丫的,这也看不懂啊!.

  **大概是hash == 的问题还有.key equals的问题.大概能解释Set集合不能重复的问题.**



## Set集合存Null 可以吗?

---

可以,同样的Set集合不能存重复的数据,所以null也只能为一个,可以存null,



# Iterator 和 ListIterator 主要区别

---

* ListIterator有`add()`方法，可以向List中添加对象，而Iterator不能

- ListIterator和Iterator都有`hasNext()`和`next()`方法，可以实现顺序向后遍历，但是ListIterator有`hasPrevious()`和`previous()`方法，可以实现逆向（顺序向前）遍历。Iterator就不可以。
- ListIterator可以定位当前的索引位置，`nextIndex()`和`previousIndex()`可以实现。Iterator没有此功能。
- ListIterator 可以再迭代时对集合进行`add`、`set`、`remove`操作，而`Iterator`迭代器只能在迭代时对集合进行 remove 操作

