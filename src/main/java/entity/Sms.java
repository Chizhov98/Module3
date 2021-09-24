package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "sms")
public class Sms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "writer_id" )
    private Customer writer_id;

    @ManyToOne
    @JoinColumn(name = "companion_id")
    private Customer companion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date created;

    @Column(name = "message")
    private String message;
}
