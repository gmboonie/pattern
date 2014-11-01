
package com.github.gmboonie.behavior.memento;

/** 
 * @ClassName: Memonto 
 * @Description: 备忘者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:09:33 
 *  
 */
public class Memento {
	private String status;
	
	public Memento(String status){
		this.status = status;
	}

	/** 
	* @Title: getStatus 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}

}
