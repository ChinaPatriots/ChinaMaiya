package com.brotherarm.core.common.util;
/**
 * 
 *<p>
 *	Title: StringUtil.java
 *</p>
 *
 *<p>
 *	Description: 字符串常用工具类
 *</p>
 *
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * <p>
 * Company: 北京兄弟战舰科技发展有限公司
 * </p>
 *
 *@author liang_sky
 *@version 1.0
 *@created 2015-10-27 上午9:55:37
 */
public class StringUtil {
	/**
	 * 验证对象是否为空或NULL
	 * @param str	被验证对象
	 * @return	处理结果: 空/Null:true,否则:false
	 */
	public static boolean isEmptyOrNull(Object str) {
		if (null == str || "".equals(str)) {
            return true;
        }
        return false;
	}
	
	/**
	 * 验证对象不为空也不为NULL
	 * @param str	被验证对象
	 * @return	处理结果: 不为空&&不为Null:true,否则:false
	 */
	public static boolean isNotEmptyOrNull(Object str) {
		if (null != str && !"".equals(str)) {
            return true;
        }
        return false;
	}
}
