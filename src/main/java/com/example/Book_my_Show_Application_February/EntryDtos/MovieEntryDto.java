package com.example.Book_my_Show_Application_February.EntryDtos;

import com.example.Book_my_Show_Application_February.Genres.Genre;
import com.example.Book_my_Show_Application_February.Genres.Language;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieEntryDto {
    private String movieName;

    private double rating;

    private int duration;


    private Language language;

    private Genre genre;

}
