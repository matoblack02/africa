package co.ke.africacallingsafaris.backendservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name = "galleries")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="gallery_image")
    private String galleryImage;

    @Column(name="caption")
    private String caption;

    @Column(name="status")
    private String status;
}
