package day1605_编码转换流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * 
		 * Unicode 编码中所有的中文字符
		 * \u4e00 到 \u9fa5
		 * 共 20902
		 * 
		 * 转成GBK 输出到f6
		 * 转成UTF-8 输出到f7
		 * */
		f("d:/abc/f6","GBK");
		f("d:/abc/f7","UTF-8");

	}

	private static void f(String path,String charset ) throws Exception {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		int count = 0;
		for(char c ='\u4e00';c<='\u9fa5';c++) {
			out.write(c);
			count++;
			if(count==30) {
				out.write("\n");
				count=0;
			}
		}
		out.close();
	}

}
