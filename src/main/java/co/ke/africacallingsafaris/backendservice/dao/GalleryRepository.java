package co.ke.africacallingsafaris.backendservice.dao;

import co.ke.africacallingsafaris.backendservice.entity.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="galleries")
public interface GalleryRepository extends JpaRepository<Gallery, Integer> {
}
