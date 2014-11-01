
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: VistitorA 
 * @Description: 具体的访问方式
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:56:37 
 *  
 */
public class VistitorA  implements Visitor{

	/* (非 Javadoc) 
	* <p>Title: visitA</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.behavior.visitor.Visitor#visitA() 
	*/
	@Override
	public void visit(NodeA nodeA) {
		System.out.println(nodeA.operationA());
	}
	
	/* (非 Javadoc) 
	* <p>Title: visitB</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.behavior.visitor.Visitor#visitB() 
	*/
	@Override
	public void visit(NodeB nodeB) {
		System.out.println(nodeB.operationB());
	}
}
