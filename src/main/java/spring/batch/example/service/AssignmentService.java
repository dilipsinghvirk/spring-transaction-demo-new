package spring.batch.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.batch.example.dao.AssignmentRepository;
import spring.batch.example.domain.Assignment;

@Service
public class AssignmentService {

	@Autowired
	AssignmentRepository assignmentRepository;
	
	public Assignment saveAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}
}
