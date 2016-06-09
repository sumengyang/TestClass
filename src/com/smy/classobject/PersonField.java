package com.smy.classobject;

//���۱��������Ķ���������������һ��������ִ��ǰִ�У��������췽����
//�����췽����һ��������ִ�еķ���������Ҫ��ʾ�Ľ��е��á�
//ͬʱ�����۱������Ķ��ֲ���ֻҪ�ڷ����ⲿ����һ�����ڷ�����ʼ����
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