package day1602_�ļ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//f2�ļ���21�ֽ�
		//���鳤����6�����������һ���Ų���
		FileInputStream in = new FileInputStream("d:/abc/f2");
		byte[]buff = new byte[6];
		int n;//��������ÿһ��������
		
		while((n=in.read(buff))!=-1) {
			System.out.println(n+"����"+Arrays.toString(buff));
		}
		in.close();
	}

}
