package com.example.Book_my_Show_Application_February.Convertors;

import com.example.Book_my_Show_Application_February.Entities.MovieEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.MovieEntryDto;
import com.example.Book_my_Show_Application_February.Genres.Genre;
import com.example.Book_my_Show_Application_February.Genres.Language;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class MovieConvertor {
    public static MovieEntity movieResponseDtotoMovie(MovieEntryDto movieEntryDto) {

        MovieEntity movieEntity = MovieEntity.builder().movieName(movieEntryDto.getMovieName()).rating(movieEntryDto.getRating()).duration(movieEntryDto.getDuration()).language(movieEntryDto.getLanguage()).genre(movieEntryDto.getGenre()).build();
        return movieEntity;



    }
}
