package com.mile1.service;

import com.mile1.bean.Student;


public class StudentService {
	public int findNumberOfNullMarks(Student[] data) {
		int count = 0;
		for(int i=0; i<data.length; i++) {
			if (data[i] == null) {
				count += 1;
			}
		}
		return count;
	}
	public int findNumberOfNullNames(Student[] names) {
		int count = 0;
		for(int i=0; i<names.length; i++) {
			if (names[i]== null) {
				count += 1;
			}
		}
		return count;
	}
	public int findNumberOfNullObjects(Student[] objects) {
		int count = 0;
		for(int i=0; i<objects.length; i++) {
			if (objects[i]== null) {
				count += 1;
			}
		}
		return count;
	}
}
