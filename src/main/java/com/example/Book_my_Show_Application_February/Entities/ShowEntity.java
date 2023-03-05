package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genres.ShowType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
@Data
@NoArgsConstructor

public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;
    private LocalTime showTime;
    @Enumerated(EnumType.STRING)
    private ShowType showType;
   @CreationTimestamp
    private Date createOn;
   @UpdateTimestamp
   private Date updatedOn;

   @ManyToOne
   @JoinColumn
   private MovieEntity movieEntity;


    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;
    // this is parent wrt to ticket
    @OneToMany(mappedBy = "showEntity" , cascade =  CascadeType.ALL)
    private List<TicketEntity> listOfBookedTickets= new ArrayList<>();

    @OneToMany(mappedBy ="showEntity",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfShowSeats = new ArrayList<>();



}
