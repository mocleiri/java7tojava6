/**
 * 
 */
package org.kuali.student.javac;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ocleirig
 *
 */
public class Java7CompatibleCode {

	/**
	 * 
	 */
	public Java7CompatibleCode() {
		// TODO Auto-generated constructor stub
	}

		  
	 public static void main(String[] args) {  
		  try {  
		   Class string = Class.forName("java.lang.String");  
		   string.getMethod("length").invoke("test");  
		  } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {  
		   // do something, and only write it once!!!  
		  }  
		 } 
}
