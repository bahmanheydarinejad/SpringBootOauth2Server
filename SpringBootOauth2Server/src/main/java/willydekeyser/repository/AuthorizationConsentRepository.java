package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import willydekeyser.entity.AuthorizationConsent;

import java.util.Optional;

public interface AuthorizationConsentRepository extends JpaRepository<AuthorizationConsent, AuthorizationConsent.AuthorizationConsentId> {

    Optional<AuthorizationConsent> findByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);

    void deleteByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
}
