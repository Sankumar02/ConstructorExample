package com.constructor.org;

public class Student {
	String studentName;
	long studentRollno;
	int Maths;
	int financialAccounting;
	int businessEconomics;
	int marketingManagement;
	int managementTheory;
	

	public void studentMarkCalculation() {
		System.out.println("Student Info :"+"\n");
		System.out.println("Name :" + studentName);
		System.out.println("RollNo:" + studentRollno);
		System.out.println("");
		System.out.println("Mark Details :"+"\n");
		System.out.println("Mark-Maths :" + Maths);
		System.out.println("Mark-Financial Accounting :" + financialAccounting);
		System.out.println("Mark-Business Economics :" + businessEconomics);
		System.out.println("Mark-Marketing Management :" + marketingManagement);
		System.out.println("Mark-Managemnet Theory :" + managementTheory);
		System.out.println("Total Marks Obtained :"
				+ (Maths + financialAccounting + businessEconomics + marketingManagement + managementTheory));

	}

	public Student(String Name, long Rollno, int mathsMark, int FaMarks, int BeMarks, int MmMarks, int MtMarks) {
		studentName = Name;
		studentRollno = Rollno;
		Maths = mathsMark;
		financialAccounting = FaMarks;
		businessEconomics = BeMarks;
		marketingManagement = MmMarks;
		managementTheory = MtMarks;

	}

	public static void main(String[] args) {

		Student studentMark = new Student("Kumar", 801223, 1, 1, 1, 1, 1);
		studentMark.studentMarkCalculation();

	}

}
