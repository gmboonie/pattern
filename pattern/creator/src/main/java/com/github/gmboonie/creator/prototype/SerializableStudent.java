
package com.github.gmboonie.creator.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
 * @ClassName: SerializableStudent 
 * @Description: 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午4:35:26 
 *  
 */
public class SerializableStudent  implements Serializable{

	private static final long serialVersionUID = -3589160370451477758L;
	private String name;
	private int age;
	private SerializableTeacher teacher;
	
	public SerializableStudent(String name, int age, SerializableTeacher serializableTeacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = serializableTeacher;
	}
	
	/* 
	* <p>Title: clone</p> 
	* <p>Description:  Student 浅复制</p> 
	* @return
	* @throws CloneNotSupportedException 
	* @see java.lang.Object#clone() 
	*/
	public Object deepClone() throws IOException, ClassNotFoundException  {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bo);
		oos.writeObject(this);
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bo.toByteArray()));
		return  ois.readObject();
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SerializableTeacher getTeacher() {
		return teacher;
	}

	public void setTeacher(SerializableTeacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
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
		SerializableStudent other = (SerializableStudent) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		return true;
	}
	
	
	
	

}
