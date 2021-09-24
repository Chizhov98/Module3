package entity;

import lombok.*;

import javax.persistence.*;


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

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "caller_id")
    private Customer caller;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "companion_id")
    private Customer companion;

}
