package entity.logEntity;

import entity.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
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
    @JoinColumn(name = "sender", nullable = false)
    private Customer sender;
    @ManyToOne
    @JoinColumn(name = "recipient", nullable = false)
    private Customer recipient;


}
