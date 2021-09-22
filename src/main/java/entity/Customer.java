package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import utils.CustomerUtils;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @Column(name = "sms")
    private int smsCount = CustomerUtils.smsCount(this);
    @Column(name = "calls")
    private int callsCount = CustomerUtils.callCount(this);
    @Column(name = "internate")
    private int internetCount = CustomerUtils.internetCount(this);
}
