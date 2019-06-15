package com.youyuhan.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
@Controller
public class WebUtil {
	static HttpServletRequest request;
	public static void main(String[] args) {
		request.getRequestURI();
		String a="abc";
		String b="bcd";
		System.out.println(getString( request, a, b));
		System.out.println(request.getParameter(a));
	}
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public static boolean getString(HttpServletRequest request, String name, String defaultValue){
		String parameter = request.getParameter(name);
		if(parameter!=null) {
			return true;
		}else {
			request.setAttribute("defaultValue", defaultValue);
			return false;
		}
		
	    //实现代码
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public static int getInt(HttpServletRequest request, String name, int defaultValue){
		try {
			String parameter = request.getParameter(name);
			int parseInt = Integer.parseInt(parameter);
			return parseInt;
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
		
	    //实现代码
	}
	public static String cok(HttpServletRequest request,String c) {
		Cookie[] k=request.getCookies();
		Cookie cc=null;
		for (Cookie cookie : k) {
			cc=cookie;
			if(cc.getName()==c) {
				String value=cc.getValue();
				return value;
			}
		}
		return null;
		
	}
	
    	//
	
	
}
