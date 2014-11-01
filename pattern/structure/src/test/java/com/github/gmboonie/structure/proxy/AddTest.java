
package com.github.gmboonie.structure.proxy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * @ClassName: AddTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午8:20:36 
 *  
 */
public class AddTest {
	@Test
	public void testAdd() {
		Add add = (Add)AddProxy.factory(new AddImpl());
		assertEquals(3,add.add(1, 2));
	}
	
}
