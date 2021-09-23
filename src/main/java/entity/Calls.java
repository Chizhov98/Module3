package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "calls")
public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "caller_id" )
    private Customer caller;

    @ManyToOne
    @JoinColumn(name = "companion_id")
    private Customer companion;

}
