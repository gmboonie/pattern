
package com.github.gmboonie.structure.composite;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: Composite 
 * @Description: 树枝构件
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午8:12:02 
 *  
 */
public class Composite implements Component {
	
	private List<Component> componentList = new ArrayList<Component>();
	/* 
	 * <p>Title: sampleOperation</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.composite.Component#sampleOperation() 
	 */
	@Override
	public void sampleOperation() {
		for(Component component : componentList){
			component.sampleOperation();
		}
		
	}

	/* 
	 * <p>Title: getComposite</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.structure.composite.Component#getComposite() 
	 */
	@Override
	public Composite getComposite() {
		return this;
	}
	
	public void addComponent(Component component){
		this.componentList.add(component);
	}
	
	public void removeComponent(Component component){
		this.componentList.remove(component);
	}
	
	public List<Component> components(){
		return this.componentList;
	}
}
