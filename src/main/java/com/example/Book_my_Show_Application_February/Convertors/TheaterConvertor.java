package com.example.Book_my_Show_Application_February.Convertors;

import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import com.example.Book_my_Show_Application_February.Entities.TheaterSeatEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;

public class TheaterConvertor {
  public static TheaterEntity changeTheaterEntrtDtotoTheaterEntity(TheaterEntryDto theaterEntryDto){
    return   TheaterEntity.builder().name(theaterEntryDto.getName()).location(theaterEntryDto.getLocation()).build();

  }
}
