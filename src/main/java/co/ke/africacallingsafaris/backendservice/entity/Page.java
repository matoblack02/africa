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
@Table(name = "pages")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="page")
    private String page;

    @Column(name="page_details")
    private String pageDetails;

    @Column(name="page_image")
    private String pageImage;

}
