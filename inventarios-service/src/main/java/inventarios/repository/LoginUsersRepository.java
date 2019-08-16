package inventarios.repository;

import inventarios.to.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUsersRepository extends JpaRepository<LoginUser, Long> {
}
