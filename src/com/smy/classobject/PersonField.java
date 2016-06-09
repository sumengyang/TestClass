package com.smy.classobject;

//不论变量放在哪儿，都会先于任意一个方法的执行前执行，包括构造方法，
//而构造方法是一个类必须会执行的方法，不需要显示的进行调用。
//同时，不论变量在哪儿分布，只要在方法外部，就一定先于方法初始化。
public class PersonField {

	public PersonField(int id) {
		System.out.println("person(" + id + ")");
	}

	public static void main(String[] args) {
		Build b = new Build();
	}
}

class Build {
	PersonField p1 = new PersonField(1);

	public Build() {
		System.out.println("this is build's block!");
		PersonField p2 = new PersonField(2);
	}

	PersonField p3 = new PersonField(3);

}

//output:
/*person(1)
person(3)
this is build's block!
person(2)*/