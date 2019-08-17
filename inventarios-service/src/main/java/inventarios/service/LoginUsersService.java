package inventarios.service;

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginUsersService {
    @Autowired
    LoginUsersRepository usersRepository;

    public List<LoginUser> findAll() {
        return usersRepository.findAll();
    }

    public final boolean login(LoginUser user) {
        return usersRepository.
                findOne(Example.of(user))
                .map(LoginUser::isActive)
                .orElse(Boolean.FALSE);
    }
}
