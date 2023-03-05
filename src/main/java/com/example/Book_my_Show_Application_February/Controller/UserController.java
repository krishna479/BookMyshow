package com.example.Book_my_Show_Application_February.Controller;

import com.example.Book_my_Show_Application_February.EntryDtos.UserEntryDto;
import com.example.Book_my_Show_Application_February.Services.UserService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserEntryDto userEntryDto) {
        try {
          String  response=  userService.addUser(userEntryDto);
          return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
         catch (Exception e){
            String err = "Can't add";
            return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
         }
    }

}
