package co.ke.africacallingsafaris.backendservice.dao;

import co.ke.africacallingsafaris.backendservice.entity.ActivityImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="activity_images")
public interface ActivityImageRepository extends JpaRepository<ActivityImage, Integer> {
}
