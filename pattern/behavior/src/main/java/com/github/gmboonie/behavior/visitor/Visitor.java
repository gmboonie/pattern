
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: Visitor 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:54:19 
 *  
 */
public interface Visitor {
	public void visit(NodeA nodeA);
	
	public void visit(NodeB nodeB);
}
