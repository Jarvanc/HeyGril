package day1603_���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/abc/f3"));
		//��ȡ���л����ݣ������л��ָ�����
		Student s = (Student) in.readObject();
		in.close();
		System.out.println(s);
	}
}
		