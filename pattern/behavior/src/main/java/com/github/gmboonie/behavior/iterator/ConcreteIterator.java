
package com.github.gmboonie.behavior.iterator;

/** 
 * @ClassName: ConcreteIterator 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:37:20 
 *  
 */
public class ConcreteIterator implements Iterator {
	public ConcreteAggregate aggregate;
	private int size = 0;
	private int index = 0;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ConcreteIterator(ConcreteAggregate agg) {
		this.size = agg.size();
		this.aggregate = agg;
	}
	
	
	/* (非 Javadoc) 
	 * <p>Title: first</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.iterator.Iterator#first() 
	 */
	@Override
	public void first() {
		this.index = 0;
	}

	/* (非 Javadoc) 
	 * <p>Title: next</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.iterator.Iterator#next() 
	 */
	@Override
	public void next() {
		if(index < size){
			index++;
		}
	}

	/* (非 Javadoc) 
	 * <p>Title: hasNext</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.behavior.iterator.Iterator#hasNext() 
	 */
	@Override
	public boolean hasNext() {
		return index < size;
	}

	/* (非 Javadoc) 
	 * <p>Title: currentObject</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.behavior.iterator.Iterator#currentObject() 
	 */
	@Override
	public Object currentObject() {
		return aggregate.get(index);
	}

}
