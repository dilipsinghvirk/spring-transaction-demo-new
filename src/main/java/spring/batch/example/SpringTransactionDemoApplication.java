package spring.batch.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring.batch.example.domain.Assignment;
import spring.batch.example.domain.User;
import spring.batch.example.service.UserAssignmentService;

@SpringBootApplication
public class SpringTransactionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTransactionDemoApplication.class, args);

		UserAssignmentService userAssignmentService = context.getBean(UserAssignmentService.class);

		User userDetail = new User();
		userDetail.setFirstName("Dilip");
		userDetail.setLastName("Virk");

		Assignment assignment = new Assignment();
		assignment.setAssignmentName("Java Training with Microservice");
		assignment.setUserDetail(userDetail);

		userAssignmentService.assignTrainingToUser(userDetail, null);
	}

}
