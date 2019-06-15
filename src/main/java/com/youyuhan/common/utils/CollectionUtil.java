package com.youyuhan.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtil {
	public static void main(String[] args) {
		/*Map map=new HashMap();
		map.put("aa", "");
		System.out.println(notEmpty(map));*/
		/*List list=new ArrayList<>();
		list.add("");
		System.out.println(notEmpty(list));*/
	}
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(List list){
		if(list.size()>0) {
			for (Object object : list) {
				if(object!=null&&object!="") {
					return true;
				}
			}
		}
		return false;
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(Map map){
		if(map.size()>0) {
			Set keySet = map.keySet();
			Iterator iterator = keySet.iterator();
			while(iterator.hasNext()) {
				Object object = iterator.next();
				Object object2 = map.get(object);
				if(object2!=null&&object2!="") {
					return true;
				}
			}
		}
		return false;
	    //实现代码
	}
	
}
