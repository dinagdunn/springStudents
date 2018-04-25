package hello;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
    String[] studentsArr = {"Dina", "Christian", "Newsha", "Robert", "Josslyn", "Amber", "Toby", "Noelle", "Hunter", "Rosslyn", "Juho", "Dario", "Bryant", "Bob", "Donnel"};
    

	public String[] getStudentsArr() {
		return studentsArr;
	}

	public void setStudentsArr(String[] studentsArr) {
		this.studentsArr = studentsArr;
	}

}
