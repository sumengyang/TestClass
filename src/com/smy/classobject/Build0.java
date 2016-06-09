package com.smy.classobject;

/*1����װ��.class�ļ�������Class���󣬶Ծ�̬���ݣ���static�����ģ����г�ʼ��������ֻ����һ�γ�ʼ����
2��new Build()�ڶ��Ͻ��пռ���䡣
3��ִ�зǾ�̬�顣
4��ִ�����з����ⶨ��ı����ĳ�ʼ����
5��ִ�й�������*/

class Person {
	
	public Person(int id) {
		System.out.println("person(" + id + ")");
	}
}

public class Build0 {
	
	/*��̬��*/
	static{
		System.out.println("this is static block!");
	}
	/*�Ǿ�̬��*/
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
