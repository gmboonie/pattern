
package com.github.gmboonie.creator.simpleFactory;

/** 
 * @ClassName: FruitFactory 
 * @Description: 产品静态工厂类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午10:14:20 
 *  
 */
public class FruitFactory {
	
	public static Fruit getFruit(String fruit) throws NotFoundFruitException{
		if("grape".equals(fruit)){
			return new Grape();
		}else if("apple".equals(fruit)){
			return new Apple();
		}else{
			throw new NotFoundFruitException(fruit);
		}
	}

}
