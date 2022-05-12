package spring.batch.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.batch.example.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
