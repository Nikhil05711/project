/package com.trainingbasket.test;

import java.util.Iterator;

import com.trainingbasket.ems.utils.ReadUtil;

public class Runner {

	public static void main(String[] args) {
		String msg = "1. Add Employee\n2. Show All Employees ";
		ReadUtil readUtil = new ReadUtil(); // Preaparing Reading Operation
		
		// String names[] =new String[10];
		int empSize = readUtil.readInt("Hoew Many Employees You do have", "Please Check Input");
		Employee employees[] = new Employee[empSize];
		int empCtr = 0;
		while (true) {
			switch (readUtil.readInt(msg + "\nPlease make an entry from above ", "Error")) {
			case 1:
				employees[empCtr] =new Employee();
				employees[empCtr].setAge(readUtil.readInt("Please ENter The Age", "Error Please check Your Input"));
				employees[empCtr].setContactNumber(readUtil.readString("Please Enter The Contact Number", "Error "));
				employees[empCtr].setName(readUtil.readString("Please Enter The Name", "Error"));
				empCtr++;
				break;

			case 2:
				for (int i = 0; i < empCtr; i++) {
					System.out.println(employees[i]);
				}
				break;

			default:
				break;
			}
		}
	}
}
