
package com.github.gmboonie.creator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.gmboonie.creator.prototype.CloneDeepStudent;
import com.github.gmboonie.creator.prototype.SerializableStudent;
import com.github.gmboonie.creator.prototype.SerializableTeacher;
import com.github.gmboonie.creator.prototype.Student;
import com.github.gmboonie.creator.prototype.Teacher;

/** 
 * @ClassName: PrototypeTest 
 * @Description: 原型模式 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午4:46:49 
 *  
 */
public class PrototypeTest {
	Teacher teacher;
	Student student;
	CloneDeepStudent deepStudent;
	SerializableTeacher serializableTeacher;
	SerializableStudent serializableStudent;
	@Before
	public void init(){
		teacher = new Teacher("li");
		student = new Student("boonie", 18, teacher);
		deepStudent = new CloneDeepStudent("boonie", 18 , teacher);
		serializableTeacher = new SerializableTeacher("xu");
		serializableStudent = new SerializableStudent("boonie", 20, serializableTeacher);
	}
	/**
	 * 
	* @Title: test 
	* @Description: 浅复制测试
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	@Test
	public void testClone() {
		System.out.println("---------clone---------");
		try {
			Student testStudent = (Student)student.clone();
			Assert.assertTrue("boonie".equals(testStudent.getName()));
			Assert.assertTrue(teacher.getName().equals(testStudent.getTeacher().getName()));
			testStudent.getTeacher().setName("zhang");
			System.out.println(student.getTeacher() == testStudent.getTeacher());
			System.out.println(student.getTeacher().getName());
			Assert.assertTrue("zhang".equals(student.getTeacher().getName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	* @Title: test 
	* @Description: 深复制测试
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	@Test
	public void testDeepClone() {
		System.out.println("-----------deep clone-----------");
		try {
			CloneDeepStudent testStudent = (CloneDeepStudent)deepStudent.clone();
			Assert.assertTrue("boonie".equals(testStudent.getName()));
			Assert.assertTrue(teacher.getName().equals(testStudent.getTeacher().getName()));
			testStudent.getTeacher().setName("zhang");
			System.out.println(testStudent.getTeacher() == deepStudent.getTeacher());
			Assert.assertFalse(testStudent.getTeacher().getName().equals(deepStudent.getTeacher().getName()));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	/**
	 * 
	* @Title: test 
	* @Description: 深复制测试
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	@Test
	public void testSerializableDeepClone() {
		System.out.println("-----------serializable deep clone-----------");
		try {
			SerializableStudent testStudent = (SerializableStudent)serializableStudent.deepClone();
			Assert.assertTrue("boonie".equals(testStudent.getName()));
			Assert.assertTrue(serializableTeacher.getName().equals(testStudent.getTeacher().getName()));
			testStudent.getTeacher().setName("zhang");
			System.out.println(testStudent.getTeacher() == serializableStudent.getTeacher());
			Assert.assertFalse(testStudent.getTeacher().getName().equals(serializableStudent.getTeacher().getName()));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
