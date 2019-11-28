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
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="activity")
    private String activity;

    @Column(name="activity_details")
    private String activityDetails;

    @Column(name="status")
    private String status;

    @OneToMany(mappedBy="activity",
            cascade= CascadeType.ALL)
    private List<ActivityImage> activityImages;
}
