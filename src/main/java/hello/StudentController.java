package hello;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService = new StudentService();
	
	
	
	@RequestMapping("/students")
	public ArrayList<String> sortStudents(){
		return studentService.sortStudents();
	}
	
	
	@RequestMapping("/revstudents")
	public ArrayList<String> reverseStudents(ArrayList<String> sortedArr){
		return studentService.reverseStudents(studentService.sortStudents());
	}
	

}
