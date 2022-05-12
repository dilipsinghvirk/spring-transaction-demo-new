package spring.batch.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.batch.example.domain.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{

}
