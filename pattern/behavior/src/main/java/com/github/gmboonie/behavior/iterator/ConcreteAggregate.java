
package com.github.gmboonie.behavior.iterator;

/** 
 * @ClassName: ConcreteAggregate 
 * @Description: 具体的聚集对象
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:33:23 
 *  
 */
public class ConcreteAggregate implements Aggregate {
	
	private Object[] elements;
	
	public ConcreteAggregate(Object[] elements){
		this.elements = elements;
	}
	
	
	
	/* (非 Javadoc) 
	 * <p>Title: createIterator</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.behavior.iterator.Aggregate#createIterator() 
	 */
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int size(){
		return this.elements.length;
	}
	
	public Object get(int index){
		if(elements.length < index || null == elements[index]){
			return null;
		}
		return elements[index];
	}

}
