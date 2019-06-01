package day1602_文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//f2文件共21字节
		//数组长度用6，故意让最后一批放不满
		FileInputStream in = new FileInputStream("d:/abc/f2");
		byte[]buff = new byte[6];
		int n;//用来保存每一批的数量
		
		while((n=in.read(buff))!=-1) {
			System.out.println(n+"个："+Arrays.toString(buff));
		}
		in.close();
	}

}
