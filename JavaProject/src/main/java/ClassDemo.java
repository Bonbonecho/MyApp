package main.java;
/**
 * 
 * �̳���������֮��Ĺ�ϵ����һ���ܼ򵥺�ֱ�۵ĸ������ʵ�����еļ̳У�������Ӽ̳и��ײƲ������ơ�
 * �̳п������Ϊһ�������һ�����ȡ���������ԵĹ��̡������B�̳�����A����ôB��ӵ��A�ķ��������ԡ�
 * �̳�ʹ�� extends �ؼ��֡�
 * 
 */
public class ClassDemo {
    /**
     *  �̳�����ά���Ϳɿ��Է����һ��ΰ������������ People ���н����޸ģ���ô Teacher ��ͻ��Զ��޸ģ�������Ҫ����Ա���κι��������˶������б��롣
     */
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "СҢ";
        t.age = 25;
        t.school = "�廪��ѧ";
        t.subject = "Java";
        t.seniority = 999;
        t.say();
        t.lecturing();
        
    }
	/**
	 * ���������Ѿ�������һ���� People
	 */
    public static class People{
        String name;
        int age;
        int height;
        People(){
        	System.out.println("���췽��������һ��");
        }
        void say(){
            System.out.println("�ҵ������� " + name + "�������� " + age + "������� " + height);
        }
    }
    /**
     *  Teacher �� People �����࣬People ��Teacher ��ĸ��ࡣ
     *  ������Ը��Ǹ���ķ�����
     *  ������Լ̳и����private��Ϊ�����еĳ�Ա��
     *  ���췽�����ܱ��̳С�
     */    
    public static class Teacher extends People{  // �ȼ̳� People ��ĳ�Ա���������Լ��ĳ�Ա����
         String school;  // ����ѧУ
         String subject;  // ѧ��
         int seniority;  // ����
         Teacher(){
        	 System.out.println("�������췽����������һ��");
         }
         /**
          * ���� People ���е� say() ����
          */
         void say(){
             System.out.println("�ҽ�" + name + "����" + school + "��" + subject + "����" + seniority + "�����");
         }
        
         void lecturing(){
             System.out.println("���Ѿ�" + age + "���ˣ���Ȼվ�ڽ�̨�Ͻ���");
         }
     }    
}
