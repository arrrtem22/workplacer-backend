package oliin.apps.workplacer.domain.feature.user.repository;

import oliin.apps.workplacer.domain.feature.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<List<User>> findAllByOfficeIdsContains(String officeId);
    Optional<User> findByEmail(String email);
}