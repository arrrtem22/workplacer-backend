package oliin.apps.workplacer.sabre.domain.repo;

import oliin.apps.workplacer.auth.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    Optional<List<UserModel>> findAllByOfficesContains(String officeId);
    Optional<UserModel> findByEmail(String email);
}
