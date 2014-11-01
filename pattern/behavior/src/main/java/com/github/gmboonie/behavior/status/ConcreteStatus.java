
package com.github.gmboonie.behavior.status;

/** 
 * @ClassName: ConcreteStatus 
 * @Description: 具体的状态
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:42:54 
 *  
 */
public class ConcreteStatus implements Status {

		/* (非 Javadoc) 
		* <p>Title: operation</p> 
		* <p>Description: </p>  
		* @see com.github.gmboonie.behavior.status.Status#operation() 
		*/
		@Override
		public void operation() {
			System.out.println("status operation");
		}
}
