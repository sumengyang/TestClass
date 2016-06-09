package com.smy.classobject;

/*1、先装载.class文件，创建Class对象，对静态数据（由static声明的）进行初始化，而且只进行一次初始化。
2、new Build()在堆上进行空间分配。
3、执行非静态块。
4、执行所有方法外定义的变量的初始化。
5、执行构造器。*/

class Person {
	
	public Person(int id) {
		System.out.println("person(" + id + ")");
	}
}

public class Build0 {
	
	/*静态块*/
	static{
		System.out.println("this is static block!");
	}
	/*非静态块*/
	{
		System.out.println("this is non-static block!");
	}
	Person p1 = new Person(1);//------------1-----------

	public Build0() {
		System.out.println("this is build's block!");
		Person p2 = new Person(2);
	}

	Person p3 = new Person(3);

	public static void main(String[] args) {
		Build0 b = new Build0();
	}
}

/*output:
 * this is static block!
this is non-static block!
person(1)
person(3)
this is build's block!
person(2)*/
