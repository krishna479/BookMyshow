package com.example.Book_my_Show_Application_February.Respository;

import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
