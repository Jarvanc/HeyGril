package day1605_����ת����;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		System.out.println("�����ļ�:");
		String s = new Scanner(System.in).nextLine();
		File f = new File(s);
		if(!f.isFile()) {
			System.out.println("��������ȷ�ļ���");
			return;
		}
		System.out.println("�����ַ����룺");
		String charset = new Scanner(System.in).nextLine();
		/*
		 * һ��һ�еĶ�ȡ
		 * BR-->ISR-->FIS--->f
		 * FileInputStream ֱ�Ӳ����ļ���
		 * InputStreamReader  �����ת����
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
