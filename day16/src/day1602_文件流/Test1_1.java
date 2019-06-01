package day1602_文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("d:/abc/f2");
		byte[]buff = new byte[6];
		int n;
		while((n=in.read(buff))!=-1) {
			System.out.println(n+"个："+Arrays.toString(buff));
		}
		in.close();
	}
}
