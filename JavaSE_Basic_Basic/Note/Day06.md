<h1> <center>Java四种访问控制权限的总结</center></h1>

**总结于[这篇博客](https://blog.csdn.net/jiao_0509/article/details/79487282)**

---

#### Java有四种访问控制权限:

> **private** ,**protected** ,**public** ,**default** ,

|                      | private | **default** | **protected** | public |
| :------------------: | :-----: | :---------: | :-----------: | :----: |
|       同一个类       |    Y    |      Y      |       Y       |   Y    |
|    只要是同一个包    |    N    |      Y      |       Y       |   Y    |
| 不同包但是是继承关系 |    N    |      N      |       Y       |   Y    |
|    不同包的野崽里    |    N    |      N      |       N       |   Y    |

> 具体的还要看代码实操,我这是实操了一遍,网上找例子实操去.记下来没必要

