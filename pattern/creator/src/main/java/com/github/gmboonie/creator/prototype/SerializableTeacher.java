
package com.github.gmboonie.creator.prototype;

import java.io.Serializable;

/** 
 * @ClassName: SerializableTeacher 
 * @Description: 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午4:35:42 
 *  
 */
public class SerializableTeacher  implements Serializable{
	 
	private static final long serialVersionUID = 6394261537962927969L;
	private String name;

	public SerializableTeacher(String name) {
		this.name = name;
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
		SerializableTeacher other = (SerializableTeacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
