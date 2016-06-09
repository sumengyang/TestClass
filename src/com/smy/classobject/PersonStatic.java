package com.smy.classobject;

/*����new���������󣬿��Ǿ�̬��ִֻ����һ�Σ����Ǿ�̬��ִ�����������Ҷ����ڵ��ù�����֮ǰ��
�����ƺ��ó���һЩ���ۣ���̬���������װ��ʱִ�еģ�װ��.class�ļ��󣩣���ִֻ��һ�Ρ�
���Ǿ�̬�����ڵ��ù��췽��֮ǰִ�еģ�ÿ����һ��ʵ�����󣬾ͻ����һ�ηǾ�̬�顣
�˴�����������һ������Ҫ��֪ʶ�㣺static�ؼ��֡�
һ����˵��������Ϊstatic�ı������߷���������ǰ��˵�Ŀ飬��������������෽�����������������Ϣ���ڷ����������ڴ棩��
�羲̬��һ���������ľ�̬����Ҳ��������ص㣺��ʼ��ֻ����װ�ص�ʱ��ִ��һ�Ρ�*/

public class PersonStatic {
	/*��̬��*/
	static{
		System.out.println("this is static block!");
	}
	/*�Ǿ�̬��*/
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