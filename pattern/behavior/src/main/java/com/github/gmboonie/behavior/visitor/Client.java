
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: Client 
 * @Description: 客户端
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:53:53 
 *  
 */
public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new NodeA());
		objectStructure.add(new NodeB());
		
		objectStructure.action(new VistitorA());
	}

}
