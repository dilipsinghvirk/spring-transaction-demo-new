package spring.batch.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String assignmentName;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userDetail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public Assignment(Long id, String assignmentName) {
		super();
		this.id = id;
		this.assignmentName = assignmentName;
	}

	public User getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(User userDetail) {
		this.userDetail = userDetail;
	}

	public Assignment() {
		super();
	}

}
