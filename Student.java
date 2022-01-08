package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student name is saranya");
	}
	public void studentDept()
	{
		System.out.println("Student dept is B.tech");
	}
	public void studentId()
	{
		System.out.println("Student id is 1900011");
	}
	
	public static void main(String[] args)
	{
		Student stud=new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	}
			
	}


