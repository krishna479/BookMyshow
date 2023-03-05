package com.example.Book_my_Show_Application_February.Services;

import com.example.Book_my_Show_Application_February.Convertors.MovieConvertor;
import com.example.Book_my_Show_Application_February.Entities.MovieEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.MovieEntryDto;
import com.example.Book_my_Show_Application_February.Respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
@Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto) throws Exception {
      MovieEntity movie= MovieConvertor.movieResponseDtotoMovie(movieEntryDto);
      movieRepository.save(movie);
      return "Done successfully";
    }
}
