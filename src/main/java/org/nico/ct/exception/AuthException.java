package org.nico.ct.exception;

/** 
 * 逻辑错误异常
 * 
 * @author nico
 * @version createTime：2018年5月20日 下午11:05:56
 */

public class AuthException extends CtException{

	private static final long serialVersionUID = 2605773620557683242L;

	public AuthException(String message) {
		super(message);
	}
	
}
