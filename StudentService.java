package com.service;

import java.util.Scanner;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	
	public void Insertdata(Student s) {
		StudentDao sd = new StudentDao();
		sd.insertData();
	}
	public void UpdateData() {
		StudentDao sd = new StudentDao();
		sd.updateData();
	}
	
	public void DeleteData() {
		StudentDao sd = new StudentDao();
		sd.deletdata();
	}
	public void FatchData() {
		StudentDao sd = new StudentDao();
		sd.fatch();
	}
	
}
