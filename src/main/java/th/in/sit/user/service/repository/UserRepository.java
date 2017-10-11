package th.in.sit.user.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.in.sit.user.service.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	List<User> findAll();
}
