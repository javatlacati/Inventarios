package inventarios.service;

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginUsersService {
    @Autowired
    LoginUsersRepository usersRepository;

    public List<LoginUser> findAll(){
        return usersRepository.findAll();
    }
}
