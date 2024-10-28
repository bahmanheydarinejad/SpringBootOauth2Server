package willydekeyser.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import willydekeyser.entity.SecurityUser;
import willydekeyser.repository.UserRepository;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JpaUserDetailsManager implements UserDetailsManager {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SecurityUser user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Access Denied"));
        return new User(
                user.getUsername(),
                user.getPassword(),
                user.getEnabled(),
                user.getAccountNonExpired(),
                user.getCredentialsNonExpired(),
                user.getAccountNonLocked(),
                user.getAuthorities().stream()
                        .map(auth -> new SimpleGrantedAuthority(auth.getAuthority()))
                        .collect(Collectors.toList())
        );
    }

    @Override
    public void createUser(UserDetails user) {
    }

    @Override
    public void updateUser(UserDetails user) {
    }

    @Override
    public void deleteUser(String username) {
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
    }

    @Override
    public boolean userExists(String username) {
        return userRepository.existsByUsername(username);
    }

}
