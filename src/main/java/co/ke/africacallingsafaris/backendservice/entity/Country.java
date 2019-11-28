package co.ke.africacallingsafaris.backendservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name="countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="country")
    private String country;

    @Column(name="country_details")
    private String countryDetails;

    @Column(name="country_image")
    private String countryImage;

    @Column(name="status")
    private String status;

    @OneToMany(mappedBy="country",
            cascade= CascadeType.ALL)
    private List<Destination> destinations;


}
