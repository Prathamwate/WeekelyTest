package com.student.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Mapping.Dto.CourseDTO;
import com.student.Mapping.Model.Book;
import com.student.Mapping.Model.Course;
import com.student.Mapping.Service.CourseService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course){
	        Course course1 =  courseService.addCourse(course);
	        return course1;
	 }
	
	@GetMapping("/course")
	public List<Course> getCourse(@Nullable @RequestParam String courseId) {
	      return  courseService.getCourse(courseId);
	 }
	
    @PostMapping("/student")
    public Course addCourseToStudent(@RequestBody CourseDTO course){
        Course course1 =  courseService.addCourseToStudent(course);
        return course1;
    }
    
    @PostMapping("course/student/add")
    public String addStudentToCourse(@RequestParam(value = "studentId",required = true)String studentId,
                                     @RequestParam(value="courseId",required = true)String courseId)  {
           this.courseService.addStudentToCourse(studentId,courseId);
           return "student added to course";
    }

}
