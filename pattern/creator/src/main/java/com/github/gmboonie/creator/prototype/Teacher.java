
package com.github.gmboonie.creator.prototype;

/** 
 * @ClassName: Teacher 
 * @Description: 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午4:35:42 
 *  
 */
public class Teacher  implements Cloneable{
	private String name;

	public Teacher(String name) {
		this.name = name;
	}
	
	/* (非 Javadoc) 
	* <p>Title: clone</p> 
	* <p>Description: </p> 
	* @return
	* @throws CloneNotSupportedException 
	* @see java.lang.Object#clone() 
	*/
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
