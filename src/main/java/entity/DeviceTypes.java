package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@Getter
@Entity
@Table(name = "order")
public enum DeviceTypes {
    PHONE("phone"),
    LAPTOP("laptop"),
    COMPUTER("computer"),
    TABLET("tablet")
    ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    DeviceTypes(String id){
        this.id=id;
    }

    DeviceTypes(){}
}
