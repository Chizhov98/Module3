package entity;

import javax.persistence.*;

@Entity
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "calls")
    private double minutesOfCalls;

    @Column(name = "internet")
    private double internetLimit;

    @Column(name = "sms")
    private int smsLimit;


}
