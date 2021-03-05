<h1> <center>Java四种访问控制权限的总结</center></h1>

<p align ="right"><b>总结于<a src="https://blog.csdn.net/jiao_0509/article/details/79487282">这篇博客</b></a></p>

---

#### Java有四种访问控制权限:

> **private** ,**protected** ,**public** ,**default** ,

|                      | private | **default** | **protected** | public |
| :------------------: | :-----: | :---------: | :-----------: | :----: |
|       同一个类       |    Y    |      Y      |       Y       |   Y    |
|    只要是同一个包    |    N    |      Y      |       Y       |   Y    |
| 不同包但是是继承关系 |    N    |      N      |       Y       |   Y    |
|    不同包的野崽里    |    N    |      N      |       N       |   Y    |

