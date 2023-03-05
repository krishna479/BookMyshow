package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genres.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name= "showseats")
@Data

@NoArgsConstructor
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int price;
    private boolean isBooked;
     private String seatNo;
     @Enumerated(EnumType.STRING)
     private SeatType seatType;
     private Date bookedAt;
     @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;


}
