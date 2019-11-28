package co.ke.africacallingsafaris.backendservice.dao;

import co.ke.africacallingsafaris.backendservice.entity.AttractionImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="attraction_images")
public interface AttractionImageRepository extends JpaRepository<AttractionImage, Integer> {
}
