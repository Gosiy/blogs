package cn.gaosiy.utils;

import java.util.List;
import java.util.Map;

public class ObjectUtils {
	
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Object obj) {
		if(obj == null) {
			return true;
		}
		if(obj instanceof String) {
			return ((String)obj).replaceAll("\\s*", "").length() > 0;
		} else if(obj instanceof Integer) {
			return (Integer)obj > 0;
		} else if (obj instanceof List) {
			return ((List)obj).size() > 0;
		} else if (obj instanceof Map) {
			return ((Map)obj).isEmpty();
		}
		return true;
	}
	
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

}
