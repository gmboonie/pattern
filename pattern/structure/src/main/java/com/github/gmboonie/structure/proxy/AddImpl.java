
package com.github.gmboonie.structure.proxy;

/** 
 * @ClassName: AddImpl 
 * @Description: 具体的实现类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午8:07:33 
 *  
 */
public class AddImpl implements Add {

	/* 
	 * <p>Title: add</p> 
	 * <p>Description: </p> 
	 * @param a
	 * @param b
	 * @return 
	 * @see com.github.gmboonie.structure.proxy.Add#add(int, int) 
	 */
	@Override
	public int add(int a, int b) {
		return  a + b;
	}

}
