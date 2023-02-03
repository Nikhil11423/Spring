package com.xworkz.student.service;

import java.util.List;

import com.xworkz.student.dto.StudentDTO;



public interface StudentService {

	boolean validateData(StudentDTO studentDTO);

	public boolean saveStudentDetails(StudentDTO studentDTO);

	boolean validationForSearchByName(String studentName);

	StudentDTO findStudentEntityByStudentName(String studentName);

	List<Object> getAllStudeInfo();

	boolean validateDeleteByStudentName(String studentName);

	boolean deleteByStudentName(String studentName);

	boolean updateStudentEntity(StudentDTO studentDTO);


}
