package day1604_����ת��;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		String s = "abc����";
		System.out.println(s);
		f(s,null);
		f(s,"GBK");
		f(s,"UTF-8");
		
	}

	private static void f(String s, String charset) throws Exception {
		byte[]a;
		if(charset==null) {
			//����������Ĭ��ֵ
			a = s.getBytes();
		}else {
			//ת��ָ������
			a = s.getBytes(charset);
		}
		System.out.println(charset+"\t"+Arrays.toString(a));
		
		String str;
		if(charset==null) {
			//��Ĭ�ϱ���ת��Unicode
			str = new String(a);
		}else {
			//��ָ���ı���ת��Unicode
			str = new String(a,charset);
		}
		System.out.println("\t"+str);
	}
}
