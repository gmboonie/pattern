
package com.github.gmboonie.creator.abstractFactory;

/** 
 * @ClassName: UnixCreator 
 * @Description: Creator具体实现类 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午12:22:34 
 *  
 */
public class UnixCreator implements Creator {

	/*  
	 * <p>Title: button</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.creator.abstractFactory.Creator#button() 
	 */
	public Button button() {
		return new UnixButton();
	}

	/* 
	 * <p>Title: text</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.creator.abstractFactory.Creator#text() 
	 */
	public Text text() {
		return new UnixText();
	}

}
