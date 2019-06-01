package day1604_编码转换;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc中文";//Unicode
		System.out.println(s);
		f(s,null);
		f(s,"GBK");
		f(s,"UTF-8");
		
	}
	/*
	 *编码 encoding
	 *字符集 charset
	 * 
	 * */

	private static void f(String s, String charset) throws Exception {
		//Unicode字符串s，转成其他编码的一组字节值
		byte[]a;
		if(charset==null) {
			//操作系统的默认值
			a = s.getBytes();
		}else {
			//转成指定编码
			a = s.getBytes(charset);
		}
		System.out.println(charset+"\t"+Arrays.toString(a));
		
		String str;
		if(charset==null) {
			//从默认编码转回	Unicode
			str = new String(a);
		}else {
			//从指定的编码转回Unicode
			str = new String(a,charset);
		}
		System.out.println("\t"+str);
	}
}
