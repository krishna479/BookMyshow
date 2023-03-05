package com.example.Book_my_Show_Application_February.Services;

import com.example.Book_my_Show_Application_February.Convertors.TheaterConvertor;
import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import com.example.Book_my_Show_Application_February.Entities.TheaterSeatEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;
import com.example.Book_my_Show_Application_February.Genres.SeatType;
import com.example.Book_my_Show_Application_February.Respository.TheaterRepository;
import com.example.Book_my_Show_Application_February.Respository.TheaterSeatRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {
    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    TheaterSeatRespository theaterSeatRespository;
    public String addTheater(TheaterEntryDto theaterEntryDto) throws  Exception {
        if(theaterEntryDto.getLocation() == null || theaterEntryDto.getName() == null){
           throw new Exception("Cannot be added");
        }


        TheaterEntity theaterEntity1 = TheaterConvertor.changeTheaterEntrtDtotoTheaterEntity(theaterEntryDto);
        List<TheaterSeatEntity>theaterSeatEntityList = createSeat(theaterEntryDto, theaterEntity1);
        theaterEntity1.setTheaterSeatEntityList(theaterSeatEntityList);


        theaterRepository.save(theaterEntity1);
      return  "Successfully add";
    }

    private List<TheaterSeatEntity> createSeat( TheaterEntryDto theaterEntryDto,TheaterEntity theaterEntity){
        List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();
        int noOfclassicSeatCount = theaterEntryDto.getNoOfClassicSeatCount();
        int noOfpremiumSeatCount = theaterEntryDto.getNoOfPremiumSeatCount();

        for(int i=1;i<noOfclassicSeatCount;i++){
            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder().seatType(SeatType.CLASSIC).seatNo(i+"C").theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);

        }
        for(int i=1;i<noOfpremiumSeatCount;i++){
            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder().seatType(SeatType.PREMIUM).seatNo(i+"P").theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);

        }
        return theaterSeatEntityList;

    }
}
