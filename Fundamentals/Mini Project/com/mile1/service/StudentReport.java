package com.mile1.service;

import java.util.Arrays;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {
	public String findGrade(Student studentObject) {

		int[] marks = studentObject.getMarks();
		int sumOfMarks = 0;

		for(int i=0; i<marks.length; i++) {
			if(marks[i] < 35) {
				return "F";
			}else 	sumOfMarks += marks[i];
		}

		

			if (sumOfMarks <= 150) {
				return "D";
				
			}else if( sumOfMarks > 150 && sumOfMarks <= 200) {
				return "C";
				
			}else if( sumOfMarks > 200 && sumOfMarks <= 250) {
				return "B";
			
			}else if(sumOfMarks > 250 && sumOfMarks <= 300) {
				return "A";
				}
		
	return "";
	}	
	
	public String validate(Student studentObject) throws NullMarksArrayException, 
											NullNameException, NullStudentException{
	{
		
		
			if (studentObject == null) {
				throw new NullStudentException();
			}else {
				if (studentObject.getName() == null) {
					throw new NullNameException();
				}if (studentObject.getMarks() == null) {
					throw new NullMarksArrayException();
				}
				return findGrade(studentObject);
			}
		
	}
	}
}
