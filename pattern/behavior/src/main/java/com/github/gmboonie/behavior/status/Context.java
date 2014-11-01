
package com.github.gmboonie.behavior.status;

/** 
 * @ClassName: Context 
 * @Description: 环境类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:41:26 
 *  
 */
public class Context {
	public Status status;
	
	public Context(){
		
	}
	
	public Context(Status status){
		this.status = status;
	}
	
	public void operation(){
		this.status.operation();
	}
	
	public void setStatus(Status status){
		this.status = status;
	}
	
	public Status getStatus(){
		return this.status;
	}
}
