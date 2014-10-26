
package com.github.gmboonie.creator.abstractFactory;

/** 
 * @ClassName: WinCreator 
 * @Description: 具体的工厂
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午12:18:31 
 *  
 */
public class WinCreator implements Creator {
	
	/*
	* <p>Title: button</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.github.gmboonie.creator.abstractFactory.Creator#button() 
	*/
	public Button button() {
		return new WinButton();
	}

	/*
	* <p>Title: text</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.github.gmboonie.creator.abstractFactory.Creator#text() 
	*/
	public Text text() {
		return  new WinText();
	}
}
