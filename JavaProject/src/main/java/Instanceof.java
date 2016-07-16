package main.java;

public class Instanceof {
	public static void main(String[] args) {
        // ���� People ���ʵ��
        People obj = new People();
        WhatInstanceOf(obj);
        // ���� Teacher ���ʵ��
        obj = new Teacher();
        WhatInstanceOf(obj);
        // ����Object ���ʾ��
        Integer i = null;
        WhatInstanceOf(i);
	}
    public static void WhatInstanceOf(Object obj) {
        if(obj instanceof Object){
            System.out.println("����һ������");
        }
        if(obj instanceof People){
            System.out.println("��������");
        }
        if(obj instanceof Teacher){
            System.out.println("����һ����ʦ");
        }
        if(obj instanceof President){
            System.out.println("����У��");
        }

        System.out.println("-----------");  

    }
}

class People{ }
class Teacher extends People{ }
class President extends Teacher{ }
