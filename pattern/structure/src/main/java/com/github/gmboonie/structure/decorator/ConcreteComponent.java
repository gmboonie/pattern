
package com.github.gmboonie.structure.decorator;

/** 
 * @ClassName: ConcreteComponent 
 * @Description: 具体的构建角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午7:32:38 
 *  
 */
public class ConcreteComponent implements Component {

	/* 
	 * <p>Title: sampleOpeartion</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.decorator.Component#sampleOpeartion() 
	 */
	@Override
	public void sampleOpeartion() {
		System.out.println("ConcreteComponent sampleOperation ---");
	}

}
