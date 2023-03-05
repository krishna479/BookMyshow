package com.example.Book_my_Show_Application_February.Controller;

import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;
import com.example.Book_my_Show_Application_February.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {
@Autowired
    TheaterService theaterService;
    @PostMapping("/addTheater")
    public ResponseEntity<String> addTheater(@RequestBody TheaterEntryDto theaterEntryDto){
        try{
            String response = theaterService.addTheater(theaterEntryDto);
            return new ResponseEntity<>(response,HttpStatus.CREATED);

        }

        catch(Exception e){

            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_GATEWAY);
        }


    }
}
