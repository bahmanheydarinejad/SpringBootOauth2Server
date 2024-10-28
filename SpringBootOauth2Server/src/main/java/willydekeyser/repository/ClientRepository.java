package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import willydekeyser.entity.Client;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, String> {

    Optional<Client> findByClientId(String clientId);
}
