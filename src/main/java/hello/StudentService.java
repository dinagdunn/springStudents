package hello;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	
	@Autowired
	private Student student;
	
	

	private ArrayList<String> sortedArr = new ArrayList<String>();
	private String[] studentsArr;
	private ArrayList<String> revArr = new ArrayList<String>();
	
	
	public ArrayList<String> sortStudents() {
	
		studentsArr = student.getStudentsArr();
		
		 for (int i = 0; i < studentsArr.length; i++) {
		        sortedArr.add(studentsArr[i]);
		    }

		    Collections.sort(sortedArr);
		    return sortedArr;	
		
	}
	
    
	public ArrayList<String> reverseStudents(ArrayList<String> sortedArr) {
		for (int j = sortedArr.size()-1; j >= 0; j--) {
			revArr.add(sortedArr.get(j));
			
		}
		return revArr;
	}

}
