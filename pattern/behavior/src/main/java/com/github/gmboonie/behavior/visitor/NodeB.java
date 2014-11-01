
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: NodeB 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:01:47 
 *  
 */
public class NodeB implements Node {
	/* (非 Javadoc) 
	* <p>Title: accept</p> 
	* <p>Description: </p> 
	* @param visitor 
	* @see com.github.gmboonie.behavior.visitor.Node#accept(com.github.gmboonie.behavior.visitor.Visitor) 
	*/
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String operationB(){
		return "operationB visited ----";
	}
}
