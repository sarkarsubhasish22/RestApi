package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(1, "Java Core Course", "This course contains basics of java."));
//		list.add(new Course(2, "Spring boot Course", "Creating Rest Api using Spring boot."));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

}
