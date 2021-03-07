# 循环分支

---

* ## break跳出一个循环,

* ## continue结束本次循环并且马上进入下一个循环

* >  for循环会执行后面i++
  >
  >  ```java 
  >  for(int i=0;i<5;i++){
  >  	if(i==2){
  >           i--;
  >  		continue;
  >  	}
  >  	System.out.print(i);
  >  }
  >  //0134
  >  ```