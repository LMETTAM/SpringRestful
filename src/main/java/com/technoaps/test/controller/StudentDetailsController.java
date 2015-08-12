package com.technoaps.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoaps.test.model.Student;

@RestController
public class StudentDetailsController {
	
	@RequestMapping(value = "/studentsList", produces="application/json")
	public @ResponseBody List<Student> getStudents(@RequestParam(value="classId", defaultValue="") String classId){
		List<Student> studentList = new ArrayList<Student>();
		if("1".equals(classId)){
		studentList.add(new Student("gopi", 1, "Suwanee", "30024"));
		studentList.add(new Student("sanvi", 2, "Suwanee", "30024"));
		} else {
			studentList.add(new Student("Krishna", 1, "Alpharetta", "30004"));
			studentList.add(new Student("lakshmi", 2, "Suwanee", "30024"));
		}
		return studentList;
	}
	
	@RequestMapping(value = "/studentsListXml", produces="application/xml")
	public @ResponseBody List<Student> getStudentsXml(@RequestParam(value="classId", defaultValue="") String classId){
		List<Student> studentList = new ArrayList<Student>();
		if("1".equals(classId)){
		studentList.add(new Student("gopi", 1, "Suwanee", "30024"));
		studentList.add(new Student("sanvi", 2, "Suwanee", "30024"));
		} else {
			studentList.add(new Student("Krishna", 1, "Alpharetta", "30004"));
			studentList.add(new Student("lakshmi", 2, "Suwanee", "30024"));
		}
		return studentList;
	}

}
