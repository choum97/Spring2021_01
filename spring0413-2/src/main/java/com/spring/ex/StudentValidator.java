package com.spring.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Student.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student student = (Student) target;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {//스페이스 들어간거 다 자름
			System.out.println(" name  is null Empty");
			errors.rejectValue("name", "trouble");
		}
		
		int studentId = student.getId();
		if(studentId == 0) {
			System.out.println("st id = 0 ");
			errors.rejectValue("id", "trouble");
		}
		
	}
}
