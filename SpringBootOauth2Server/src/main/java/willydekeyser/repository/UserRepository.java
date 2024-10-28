package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import willydekeyser.entity.SecurityUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SecurityUser, Integer> {

    Optional<SecurityUser> findByUsername(String username);

    Boolean existsByUsername(String username);

}
