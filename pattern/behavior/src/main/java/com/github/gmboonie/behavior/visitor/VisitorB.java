
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: VisitorB 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:07:20 
 *  
 */
public class VisitorB implements Visitor {

	/* (非 Javadoc) 
	 * <p>Title: visit</p> 
	 * <p>Description: </p> 
	 * @param nodeA 
	 * @see com.github.gmboonie.behavior.visitor.Visitor#visit(com.github.gmboonie.behavior.visitor.NodeA) 
	 */
	@Override
	public void visit(NodeA nodeA) {
		System.out.println(nodeA.operationA());
	}

	/* (非 Javadoc) 
	 * <p>Title: visit</p> 
	 * <p>Description: </p> 
	 * @param nodeB 
	 * @see com.github.gmboonie.behavior.visitor.Visitor#visit(com.github.gmboonie.behavior.visitor.NodeB) 
	 */
	@Override
	public void visit(NodeB nodeB) {
		System.out.println(nodeB.operationB());
	}

}
