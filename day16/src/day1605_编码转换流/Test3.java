package day1605_编码转换流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入文件:");
		String s = new Scanner(System.in).nextLine();
		File f = new File(s);
		if(!f.isFile()) {
			System.out.println("请输入正确文件！");
			return;
		}
		System.out.println("输入字符编码：");
		String charset = new Scanner(System.in).nextLine();
		/*
		 * 一行一行的读取
		 * BR-->ISR-->FIS--->f
		 * FileInputStream 直接插在文件上
		 * InputStreamReader  编码的转换流
		 * new BufferedReader  readline()
		 * */
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(f),charset));
		String line;
		while((line = in.readLine())!=null) {
			System.out.println(line);
		}
		in.close();
	}

}
