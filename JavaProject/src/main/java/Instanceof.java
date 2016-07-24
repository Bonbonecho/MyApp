package main.java;
/**
 * �ڼ̳����У����ǽ���������ת����Ϊ������ת�͡���������������ת����Ϊ������ת�͡���
 * ע�⣺����ֱ�ӽ�����Ķ���ǿ��ת��Ϊ�������ͣ�ֻ�ܽ�����ת�ͺ����������ٴ�ת��Ϊ�������͡�Ҳ����˵����������������ת�ͺ󣬲���������ת�͡�
 */
public class Instanceof {
	public static void main(String[] args) {
        // ���� People ���ʵ��
        People superObj = new People();
        WhatInstanceOf(superObj);
        // ���� Teacher ���ʵ��
        President sonObj = new President();
        WhatInstanceOf(sonObj);
        // ����Object ���ʾ��
        Integer i = null;
        WhatInstanceOf(i);
        
        //����Ĵ�������ʱ���׳��쳣�����ܽ��������ֱ��ת��Ϊ��������
        //President sonObj2 = (SonClass)superObj;
        
        //��ȷ������������ת�ͣ�������ת��
        System.out.println("���ǽ���������ת����Ϊ������ת�͡���������������ת����Ϊ������ת�͡���");
        superObj=sonObj;
        Teacher sonObj2=(Teacher)superObj;
        WhatInstanceOf(sonObj2);
        
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
