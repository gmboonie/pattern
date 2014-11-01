
package com.github.gmboonie.creator.simpleFactory;

/** 
 * @ClassName: NotFoundFruitException 
 * @Description: 产品异常
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午10:09:56 
 *  
 */
public class NotFoundFruitException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public NotFoundFruitException(String msg) {
		super(msg);
	}
}
