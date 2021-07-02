package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;

public class StudentMain {
	static Student[] data  =new Student[4]; 
		static {
		for (int i = 0; i< data.length; i++) data[i] = new Student();
			data[0] = new Student ("Sekar", new int[]{35, 35, 35}); 
			data[1]= new Student(null, new int[]{11,22,33}); 
			data[2]=null; 
			data[3] = new Student ("Manoj", null); 
			
//				data [0] = new Student ("Al", new int []{72, 73, 74}); 
//				data[1] =  new Student ("B1", new int []{75, 76, 77}); 
//				data[2]= new Student ("Cl", new int[]{99, 99, 99}); 
//				data[3] = new Student ("c3", new int[] {100, 100, 99}); 
//				data[4] = new Student ("B2", new int[] {13, 88, 13}); 
//				data[5]= new Student ("C3", new int[] {14, 14, 99}); 
//				data[6] = new Student ("A2", new int[]{77, 55, 12});
//				data[7]= new Student ("AS", new int[] {13, 88, 13});
		
		}
	public static void main(String[] args) {
		
		StudentReport StudentRep = new StudentReport();
		StudentService StudentSer = new StudentService();
		String x = null;
		System.out.println("GradesCalculation: ");
		for(int i=0; i<data.length; i++) {
			try {x = StudentRep.validate(data[i]);}
			catch(NullMarksArrayException e) {
				System.out.println(e);
			}catch(NullNameException e) {
				System.out.println(e);
			}catch(NullStudentException e) {
				System.out.println(e);
			}
		System.out.println("GRADE="+x);
		}
		System.out.println("Number of Objects with Marks array as null="+StudentSer.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Marks array as null="+StudentSer.findNumberOfNullNames(data));
		System.out.println("Number of Objects with Marks array as null="+StudentSer.findNumberOfNullObjects(data));
		
	}

}
