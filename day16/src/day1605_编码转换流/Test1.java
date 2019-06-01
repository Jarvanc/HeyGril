package day1605_编码转换流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * "abc中文"
		 * Unicode 编码：00 61 00 62 00 63 4e 2d 65 87
		 * 转成GBK 输出到f4 
		 * 转成UTF-8 输出到f5
		 * */
		f("d:/abc/f4","abc中文冯令华","GBK");
		f("d:/abc/f5","abc中文冯令华","UTF-8");
		
	}

	private static void f(String path, String s, String charset) throws Exception {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		out.write(s);
		out.close();
		
		
	}

}
