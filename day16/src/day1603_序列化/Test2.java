package day1603_序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/abc/f3"));
		//读取序列化数据，反序列化恢复对象
		Student s = (Student) in.readObject();
		in.close();
		System.out.println(s);
	}
}
		