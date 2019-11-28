package co.ke.africacallingsafaris.backendservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name = "attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="attraction")
    private String attraction;

    @Column(name="attraction_details")
    private String attractionDetails;

    @Column(name="status")
    private String status;

    @OneToMany(mappedBy="attraction",
            cascade= CascadeType.ALL)
    private List<AttractionImage> attractionImages;
}
