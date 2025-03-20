package org.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passengerName;
    private String passengerEmail;
    private String busNumber;
    private int numberOfPassengers;
    private int numberOfDiscountedPassengers;

    @ManyToOne
    @JoinColumn(name = "user_id") // Foreign key to User
    private User user;

    @ManyToOne
    @JoinColumn(name = "bus_id") // Foreign key to Bus
    private Bus bus;
}