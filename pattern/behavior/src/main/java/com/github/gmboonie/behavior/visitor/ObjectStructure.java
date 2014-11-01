
package com.github.gmboonie.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: ObjectStructure 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:09:19 
 *  
 */
public class ObjectStructure {
	private List<Node> nodes;
	
	public ObjectStructure(){
		this.nodes = new ArrayList<Node>();
	}
	
	public void action(Visitor visitor){
		for(Node node : nodes){
			node.accept(visitor);
		}
	}
	
	public void add(Node node){
		this.nodes.add(node);
	}
	
}
