package day1605_编码转换流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test2_2 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f6","GBK");
		f("d:/abc/f7","UTF-8");

	}

	private static void f(String path, String charset) throws Exception{
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		int count = 0;
		for(char c ='\u4e00';c<='\u9fa5';c++) {
			out.write(c);
			count++;
			if(count==30) {
				out.write("\n");//到30个字符换行
				count=0;//计数重新清零
			}
		}
		out.close();
	}

}
