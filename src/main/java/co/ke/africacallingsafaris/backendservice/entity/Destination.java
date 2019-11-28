package co.ke.africacallingsafaris.backendservice.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name = "destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="destination")
    private String destination;

    @Column(name="destination_details")
    private String destinationDetails;

    @Column(name="status")
    private String status;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="country_id")
    private Country country;

    @OneToMany(mappedBy="destination",
            cascade= CascadeType.ALL)
    private List<DestinationImage> destinationImages;


}
