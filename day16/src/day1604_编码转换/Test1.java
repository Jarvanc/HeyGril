package day1604_����ת��;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc����";//Unicode
		System.out.println(s);
		f(s,null);
		f(s,"GBK");
		f(s,"UTF-8");
		
	}
	/*
	 *���� encoding
	 *�ַ��� charset
	 * 
	 * */

	private static void f(String s, String charset) throws Exception {
		//Unicode�ַ���s��ת�����������һ���ֽ�ֵ
		byte[]a;
		if(charset==null) {
			//����ϵͳ��Ĭ��ֵ
			a = s.getBytes();
		}else {
			//ת��ָ������
			a = s.getBytes(charset);
		}
		System.out.println(charset+"\t"+Arrays.toString(a));
		
		String str;
		if(charset==null) {
			//��Ĭ�ϱ���ת��	Unicode
			str = new String(a);
		}else {
			//��ָ���ı���ת��Unicode
			str = new String(a,charset);
		}
		System.out.println("\t"+str);
	}
}
