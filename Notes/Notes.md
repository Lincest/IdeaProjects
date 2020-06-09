# Java Learning Notes

> 用于记录java学习中的一些东西



## 基本知识

### Java EE, Java SE, Java ME

![](E:\IdeaProjects\Notes\image\version.png)

### Java应用程序的运行机制

![](E:\IdeaProjects\Notes\image\run.png)

### JDK, JVM, JRE

![](E:\IdeaProjects\Notes\image\JDKJVMJRE.png)

JDK的下载地址：[[ www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)](JDK下载)



### 关于浮点数

java浮点数不能用于比较，如果需要用浮点数进行比较，或进行不产生舍入误差的精确数字计算，需要引入java.math包中的BigDecimal类。

例子：

![](E:\IdeaProjects\Notes\image\BigDecimal.png)

关于BigDecimal：

> java.math包下面的两个有用的类：BigInteger和BigDecimal，这两个类可以处理任意长度的数值。BigInteger实现了任意精度的整数运算。BigDecimal实现了任意精度的浮点运算。



### 整型常量和long的表示形式

![](E:\IdeaProjects\Notes\image\Long.png)

### static关键字 this关键字

关于static：

>这个表示这个方法为静态方法! 在其它类中可以直接通过类名去调用这个方法!例如
>public static void main(String[] args){
>ClassName.prt("[abc](https://www.baidu.com/s?wd=abc&tn=SE_PcZhidaonwhc_ngpagmjz&rsv_dl=gh_pc_zhidao)");
>}
>如果不加static,则只有通过该类的对象去调用。
>例如
>public static void main(String[] args){
>ClassName name=new ClassName();
>name.prt("[abc](https://www.baidu.com/s?wd=abc&tn=SE_PcZhidaonwhc_ngpagmjz&rsv_dl=gh_pc_zhidao)");
>}

关于this：

>this的本质就是“创建好的对象的地址”
>
>example:
>
>```java
>public class User {
>    int id;        //id
>    String name;   //账户名
>    String pwd;   //密码
>        public User() {
>    }
>    public User(int id, String name) {
>        System.out.println("正在初始化已经创建好的对象："+this);
>        this.id = id;   //不写this，无法区分局部变量id和成员变量id
>        this.name = name;
>    }
>    public void login(){
>        System.out.println(this.name+",要登录！");  //不写this效果一样
>    }  
>    
>    public static void main(String[] args) {
>        User  u3 = new User(101,"高小七");
>        System.out.println("打印高小七对象："+u3);
>        u3.login();
>    }
>}
>```

### java中的常用包

| **Java中的常用包**       | **说明**|
|---------|-----------|
| java.lang                       | 包含一些Java语言的核心类，如String、Math、Integer、System和Thread，提供常用功能。 |
| java.awt                        | 包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。 |
| java.net                        | 包含执行与网络相关的操作的类。                               |
| java.io                         | 包含能提供多种输入/输出功能的类。                            |
| java.util                       | 包含一些实用工具类，如定义系统特性、使用与日期日历相关的函数。 |







## OOP

### 继承

extends关键字

e.x.

```java
public class Test{
    public static void main(String[] args) {
        Student s = new Student("高淇",172,"Java");
        s.rest();
        s.study();
    }
}
class Person {
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }  
}
class Student extends Person {
    String major; //专业
    public void study(){
        System.out.println("在尚学堂，学习Java");
    }  
    public Student(String name,int height,String major) {
        //天然拥有父类的属性
        this.name = name;
        this.height = height;
        this.major = major;
    }
}
```

**继承的使用要点**

- 父类也称作超类、基类、派生类等。
- java中只有单继承，没有像C++那样的多继承。多继承会引起混乱，使得继承链过于复杂，系统难于维护。
- Java中类没有多继承，接口有多继承。
- 子类继承父类，可以得到父类的全部属性和方法 (除了父类的构造方法)，但不见得可以直接访问(比如，父类私有的属性和方法)。
- 如果定义一个类时，没有调用extends，则它的父类是：java.lang.Object



### instanceof

```java
public class Test{
    public static void main(String[] args) {
        Student s = new Student("高淇",172,"Java");
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
    }
}

```

output: True True



### 封装与访问控制符

![1582817464601](C:\Users\47461\AppData\Roaming\Typora\typora-user-images\1582817464601.png)

