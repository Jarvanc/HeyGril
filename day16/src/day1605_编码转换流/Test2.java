package day1605_����ת����;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * 
		 * Unicode ���������е������ַ�
		 * \u4e00 �� \u9fa5
		 * �� 20902
		 * 
		 * ת��GBK �����f6
		 * ת��UTF-8 �����f7
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
