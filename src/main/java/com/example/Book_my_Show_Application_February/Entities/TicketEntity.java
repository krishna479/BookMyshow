package com.example.Book_my_Show_Application_February.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name="tickets")

@NoArgsConstructor
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;
    private LocalDate showdate;

    private LocalTime showTime;
    private int totalAmount;
    private String theaterName;
    private String ticketId = UUID.randomUUID().toString();

@ManyToOne
    @JoinColumn
    private UserEntity userEntity;
@ManyToOne
    @JoinColumn
    private ShowEntity showEntity;
}
