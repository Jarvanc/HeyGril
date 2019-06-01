package day1605_±àÂë×ª»»Á÷;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f4","abcdÐ»ÑóÑó","GBK");
		f("d:/abc/f5","abcdÐ»ÑóÑó","UTF-8");
	}

	private static void f(String path, String s, String charset) throws Exception {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		out.write(s);
		out.close();
	}

}
