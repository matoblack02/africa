package co.ke.africacallingsafaris.backendservice.dao;

import co.ke.africacallingsafaris.backendservice.entity.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestimonialRepository extends JpaRepository<Testimonial, Integer> {
}
