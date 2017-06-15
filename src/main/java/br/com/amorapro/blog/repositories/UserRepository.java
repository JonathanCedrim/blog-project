package br.com.amorapro.blog.repositories;

import br.com.amorapro.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cedrim on 6/15/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User.findByUserName(
    String username)

}
