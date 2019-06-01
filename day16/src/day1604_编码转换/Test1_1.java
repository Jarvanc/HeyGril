package day1604_编码转换;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		String s = "abc中文";
		System.out.println(s);
		f(s,null);
		f(s,"GBK");
		f(s,"UTF-8");
		
	}

	private static void f(String s, String charset) throws Exception {
		byte[]a;
		if(charset==null) {
			//操作吸引的默认值
			a = s.getBytes();
		}else {
			//转成指定编码
			a = s.getBytes(charset);
		}
		System.out.println(charset+"\t"+Arrays.toString(a));
		
		String str;
		if(charset==null) {
			//从默认编码转回Unicode
			str = new String(a);
		}else {
			//从指定的编码转回Unicode
			str = new String(a,charset);
		}
		System.out.println("\t"+str);
	}
}
