
package com.github.gmboonie.creator.builder;

/** 
 * @ClassName: Director 
 * @Description: 具体的建造者导演者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午3:10:46 
 *  
 */
public class Director {
	
	private Builder builder;
		/** 
		 * <p>Title: </p> 
		 * <p>Description: </p>  
		 */
		public Director() {
			this.builder =  new ConcreteBuilder();
			builder.buildPart1();
			builder.buildPart2();
			builder.retriverProduct();
		}
}
