package org.college;

public class Student {
	public void studentName() {
		System.out.println("student name=vanishankar");
	}
	public void studentId() {
		System.out.println("student id=2");
	}
public void studentDepartment() {
	System.out.println("department=commerce");
}
public static void main(String[]args) {
	Student rv= new Student();
	rv.studentName();
	rv.studentDepartment();
	rv.studentId();
	rv.studentDepartment();
}

}
