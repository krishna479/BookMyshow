package com.example.Book_my_Show_Application_February.Controller;

import com.example.Book_my_Show_Application_February.EntryDtos.MovieEntryDto;
import com.example.Book_my_Show_Application_February.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(MovieEntryDto movieEntryDto) {
        try{
            String Response = movieService.addMovie(movieEntryDto);
            return new ResponseEntity<>(Response, HttpStatus.CREATED);
        }
        catch(Exception e){
            String Response = "failed ";
            return new ResponseEntity<>(Response,HttpStatus.FAILED_DEPENDENCY);

        }



    }
}
