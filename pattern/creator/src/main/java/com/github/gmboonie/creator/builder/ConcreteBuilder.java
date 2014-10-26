
package com.github.gmboonie.creator.builder;

/** 
 * @ClassName: ConcreteBuilder 
 * @Description: 具体的建造者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午3:09:32 
 *  
 */
public class ConcreteBuilder implements Builder {
	private Product product;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ConcreteBuilder() {
		this.product = new Product();
	}
	
	/* 
	 * <p>Title: buildPart1</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.builder.Builder#buildPart1() 
	 */
	public void buildPart1() {
		System.out.println("product part1 build");
	}

	/* 
	 * <p>Title: buildPart2</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.builder.Builder#buildPart2() 
	 */
	public void buildPart2() {
		System.out.println("product part2 build");
	}
	
	/* 
	* <p>Title: retriverProduct</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.github.gmboonie.creator.builder.Builder#retriverProduct() 
	*/
	public Product retriverProduct() {
		return this.product;
	}

}
