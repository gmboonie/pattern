
package com.github.gmboonie.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: FlyweightFactory 
 * @Description: 享元工厂类，负责维护享元的各种对象
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午9:15:03 
 *  
 */
public class FlyweightFactory {
	//享元对象的内部维护状态
	private Map<String, Flyweight> files = new HashMap<String, Flyweight>();
	
	public Flyweight factory(String status){
		if(!files.containsKey(status)){
			files.put(status, new ConcreteFlyweight(status));
		}
		return files.get(status);
	}
	
	
	

}
