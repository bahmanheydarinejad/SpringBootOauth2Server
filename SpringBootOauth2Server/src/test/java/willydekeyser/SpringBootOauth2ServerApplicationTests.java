package willydekeyser;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class SpringBootOauth2ServerApplicationTests {

    @Test
    void BCryptPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("User"));
        System.out.println(new BCryptPasswordEncoder().encode("Admin"));
        System.out.println(new BCryptPasswordEncoder().encode("Developer"));
    }

}
