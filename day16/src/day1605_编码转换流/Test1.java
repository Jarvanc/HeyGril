package day1605_����ת����;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * "abc����"
		 * Unicode ���룺00 61 00 62 00 63 4e 2d 65 87
		 * ת��GBK �����f4 
		 * ת��UTF-8 �����f5
		 * */
		f("d:/abc/f4","abc���ķ��","GBK");
		f("d:/abc/f5","abc���ķ��","UTF-8");
		
	}

	private static void f(String path, String s, String charset) throws Exception {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		out.write(s);
		out.close();
		
		
	}

}
