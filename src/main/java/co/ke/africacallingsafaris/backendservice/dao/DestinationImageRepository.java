package co.ke.africacallingsafaris.backendservice.dao;

import co.ke.africacallingsafaris.backendservice.entity.DestinationImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="destination_images")
public interface DestinationImageRepository extends JpaRepository<DestinationImage, Integer> {

}
