package com.xbjtech.Exception;
/**
 * 
 * @author Ma Yucheng
 * @date 2019年3月31日 下午5:26:02
 * @version 1.0
 * @desc 本来想写个没找到球员异常 后来发现没用上。。。
 */
public class PlayerNotFoundException extends RuntimeException {
	public PlayerNotFoundException(String message) {
		super(message);
	}
}
