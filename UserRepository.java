package jp.com.internous.ecsite.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.com.internous.ecsite.model.entity.User;




public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByUserNameAndPassword(String userNamem, String password);

}
