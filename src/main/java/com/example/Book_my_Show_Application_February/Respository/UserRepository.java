package com.example.Book_my_Show_Application_February.Respository;

import com.example.Book_my_Show_Application_February.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
