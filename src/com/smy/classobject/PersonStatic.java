package com.smy.classobject;

//fetch to eclipse

/*我们new了两个对象，可是静态块只执行了一次，而非静态块执行了两个，且都是在调用构造器之前。
我们似乎得出了一些结论：静态块是在类的装载时执行的（装入.class文件后），且只执行一次。
而非静态块是在调用构造方法之前执行的，每生成一个实例对象，就会调用一次非静态块。
此处，我想引入一个很重要的知识点：static关键字。
一般来说，被声明为static的变量或者方法，或者前面说的块，都属于类变量、类方法，属于类的属性信息（在方法区分配内存）。
如静态块一样，其它的静态数据也具有这个特点：初始化只在类装载的时候执行一次。*/

public class PersonStatic {
	/*静态块*/
	static{
		System.out.println("this is static block!");
	}
	/*非静态块*/
	{
		System.out.println("this is non-static block!");
	}
	public PersonStatic(int id) {
		System.out.println("person(" + id + ")");
	}
	public static void main(String[] args) {
		PersonStatic p1 = new PersonStatic(1);
		PersonStatic p2 = new PersonStatic(2);
	}
}

//output:
/*this is static block!
this is non-static block!
person(1)
this is non-static block!
person(2)*/
