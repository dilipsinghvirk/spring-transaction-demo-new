package spring.batch.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.batch.example.domain.Assignment;
import spring.batch.example.domain.User;

@Service
public class UserAssignmentService {

	@Autowired
	UserService userService;

	@Autowired
	AssignmentService assignmentService;

	@Transactional
	public String assignTrainingToUser(User user, Assignment assignment) {

		// Save User
		User userDetail = userService.saveUser(user);                                  //Proxy

		//Training to User 
		
		Assignment assignmentDetails = new Assignment();                                 //Exception Occured ,  Rollback
		assignmentDetails.setAssignmentName(assignment.getAssignmentName());
		assignmentDetails.setUserDetail(userDetail);
		
		assignmentService.saveAssignment(assignmentDetails);
		
		return "Successfully inserted";
		
	}
}
