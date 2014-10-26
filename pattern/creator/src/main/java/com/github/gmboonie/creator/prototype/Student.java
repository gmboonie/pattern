
package com.github.gmboonie.creator.prototype;

/** 
 * @ClassName: Student 
 * @Description: 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午4:35:26 
 *  
 */
public class Student  implements Cloneable{
	private String name;
	private int age;
	private Teacher teacher;
	
	public Student(String name, int age, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	
	/* 
	* <p>Title: clone</p> 
	* <p>Description:  Student 浅复制</p> 
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
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
		Student other = (Student) obj;
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
