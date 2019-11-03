package com.bridgelabz.userinfo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.userinfo.model.UserInformation;

@Repository
public interface UserRepository extends JpaRepository<UserInformation,Long>{

	UserInformation saveAll(UserInformation userInformation);

	Optional<UserInformation> findByUserEmail(String email);

}
