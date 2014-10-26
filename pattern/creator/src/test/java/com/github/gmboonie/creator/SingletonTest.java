
package com.github.gmboonie.creator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.gmboonie.creator.singleton.HungrySingleton;
import com.github.gmboonie.creator.singleton.LazySingleton;

/** 
 * @ClassName: SingletonTest 
 * @Description: 测试Singleton
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午3:53:51 
 *  
 */
public class SingletonTest {

	@Test
	public void testLazySingleton() {
		LazySingleton lazySingleton = LazySingleton.newInstance();
		assertTrue(lazySingleton == LazySingleton.newInstance());
	}
	
	@Test
	public void testHungrySingleton(){
		HungrySingleton hungrySingleton = HungrySingleton.newInstance();
		assertTrue(hungrySingleton == HungrySingleton.newInstance());
	}

}
