package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "customer")
    private Customer customer;

    @Column(name="tariff")
    private Tariff tariff;

    @Column(name="device")
    private DeviceTypes deviceType;
}
