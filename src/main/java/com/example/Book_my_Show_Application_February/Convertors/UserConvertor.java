package com.example.Book_my_Show_Application_February.Convertors;

import com.example.Book_my_Show_Application_February.Entities.UserEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.UserEntryDto;
import com.example.Book_my_Show_Application_February.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserConvertor {


    public static  UserEntity convertDtoToEntity(UserEntryDto userEntryDto) {

        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).address(userEntryDto.getAddress()).build();
      return userEntity;

    }
}
