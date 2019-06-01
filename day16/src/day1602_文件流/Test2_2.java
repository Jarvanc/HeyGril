package day1602_文件流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		System.out.println("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(!from.isFile()) {
			System.out.println("请输入正确的文件！！");
			return;
		}
		System.out.println("目标文件：");
		String s2  = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(!to.isDirectory()) {
			System.out.println("请指定一个具体文件，不能是文件夹");
			return;
		}
		
		try {
			copy(from,to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void copy(File from, File to) throws Exception {
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		/*int b;
		while((b=in.read())!=-1) {
			out.write(b);
		}*/
		byte[]buff = new byte[8192];
		int n;
		while((n=in.read())!=-1) {
			out.write(buff, 0, n);
		}
		out.close();
		in.close();
	}
}
