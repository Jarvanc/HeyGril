package day1603_���л�;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		Student1 s = new Student1(9527,"�Ʋ���","��",22);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f3"));
		out.writeObject(s);
		out.close();
	}

}
