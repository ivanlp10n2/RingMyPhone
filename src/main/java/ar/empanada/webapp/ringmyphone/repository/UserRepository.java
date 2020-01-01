package ar.empanada.webapp.ringmyphone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.empanada.webapp.ringmyphone.io.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
