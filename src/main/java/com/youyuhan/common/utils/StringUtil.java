package com.youyuhan.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 尤钰涵
 *
 */
public class StringUtil {
	public static void main(String[] args) {
		//System.out.println(reverse("abc"));
		//System.out.println(isMobile("1506505733"));
		//System.out.println(hasText(" "));
		//System.out.println(hasLength(" "));
		//System.out.println(isEmail("72921@qq.co"));
	}
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		if(src==null||src.length()==0) {
			return false;
		}
		return true;
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		if(src==null||src.length()==0||src==" ") {
			return false;
		}
		return true;
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
		String reg="^[1]\\d{10}$";
		if(src.matches(reg)) {
			return true;
		}
		return false;
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
		String reg="^\\w+(@)\\w+(.com)$";
		if(src.matches(reg)){
			return true;
		}
		return false;
	    //实现代码
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
		String[] split = src.split("");
		String a="";
		for (int i = (split.length-1); i >=0; i--) {
			a+=split[i];
		}
	    return a;
	}
	
//	public static Date getDateInitMonth(Date src) {
//		SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Calendar c = Calendar.getInstance();
//		c.setTime(src);
//		c.set(Calendar.DAY_OF_MONTH,1);
//		c.set(Calendar.HOUR_OF_DAY,0);
//		c.set(Calendar.MINUTE,0);
//		c.set(Calendar.SECOND,0);
//		
//		return ;
//		
//	}
}
