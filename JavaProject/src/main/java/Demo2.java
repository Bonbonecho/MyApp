package main.java;
import java.util.*;

public class Demo2 {
private static Scanner sc;
	//����žų˷�������FORѭ��
	public static void main2(String[] args) {
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){System.out.printf("%d*%d=%2d  ", i, j, i*j);}System.out.print("\n"); 
		}
	}
    public static void main(String[] args){
        int intArray[] = new int[5];
        long total = 0;
        int len = intArray.length;
       
        // ������Ԫ�ظ�ֵ
        System.out.print("������" + len + "���������Կո�Ϊ�ָ���");
        sc = new Scanner(System.in);
        for(int i=0; i<len; i++){
            intArray[i] = sc.nextInt();
        }
       
        // ��������Ԫ�صĺ�
        for(int i=0; i<len; i++){
            total += intArray[i];
        }
       
        System.out.println("��������Ԫ�صĺ�Ϊ��" + total);
    }
}
