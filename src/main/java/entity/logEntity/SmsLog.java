package entity.logEntity;

import entity.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sms")
@Getter
@Setter
public class SmsLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "text")
    private String text;
    @ManyToOne
    @Column(name = "sender", nullable = false)
    private Customer sender;
    @ManyToOne
    @Column(name = "recipient", nullable = false)
    private Customer recipient;


}
