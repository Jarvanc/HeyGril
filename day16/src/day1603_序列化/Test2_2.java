package day1603_–Ú¡–ªØ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2_2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/abc/f3"));
		Student s = (Student) in.readObject();
		in.close();
		System.out.println(s);
		
	}

}
