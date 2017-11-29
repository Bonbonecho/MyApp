package main.java.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import main.java.NewRoot;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestNewRoot {
	@Test
	@DisplayName("�������")
	void test() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();  
        System.setOut(new PrintStream(outContent));  //�����ж�ȡ�˿���̨��������ڶ��Բ���ֻ��Ҫ�жϿ���̨����������ǵ�Ԥ���Ƿ�һ�¼��ɡ�
        String[] testInt = {"16"};
		NewRoot.main(testInt);
		assertEquals("The square root of 16 is 4.0\n",outContent.toString());
	}
}