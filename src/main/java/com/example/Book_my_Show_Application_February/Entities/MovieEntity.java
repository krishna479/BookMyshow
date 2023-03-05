package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genres.Genre;
import com.example.Book_my_Show_Application_February.Genres.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class MovieEntity {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

  @Column(unique = true, nullable = false)
    private String movieName;

  private double rating;

  private int duration;

  @Enumerated(EnumType.STRING)
  private Language language;
  @Enumerated(EnumType.STRING)
  private Genre genre;

  @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList = new ArrayList<>();

}
