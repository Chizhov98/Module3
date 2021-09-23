package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Table(name = "tariff")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
        private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "calls")
    private double minutesOfCalls;

    @Column(name = "internet")
    private double internetLimit;

    @Column(name = "sms")
    private int smsLimit;
}
