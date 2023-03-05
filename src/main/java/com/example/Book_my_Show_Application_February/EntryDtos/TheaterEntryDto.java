package com.example.Book_my_Show_Application_February.EntryDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterEntryDto {
    private String name;
    private String location;
    private int noOfClassicSeatCount ;
    private int noOfPremiumSeatCount;




}
