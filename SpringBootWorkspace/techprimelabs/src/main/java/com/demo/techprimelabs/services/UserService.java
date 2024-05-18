package com.demo.techprimelabs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.techprimelabs.iservice.IUserService;
import com.demo.techprimelabs.models.User;
import com.demo.techprimelabs.repositories.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService{

	@Autowired
	private UserRepo userrepo;

	@Override
	public List<User> getAllUsers() {
		
		List<User> userlist = userrepo.findAll();
		
		return userlist;
	}

	@Override
	public User saveUser(User u) {
		
		User res= userrepo.save(u);
		return res;
	}

	@Override
	  public User updateUser(User c) {

		User user = userrepo.save(c);
	    return user;
	  }

	@Override
	public void deleteUser(int id) {
		
		userrepo.deleteById(id);
		
	}


	
	@Override
    public User searchUserById(int id) {
        
//		@SuppressWarnings("deprecation")
        User user = userrepo.findById(id).get();
        
        return user;
    }


	public User authenticate(String email, String pass_word) {
        User user = userrepo.findByEmail(email);
        if (user != null && email.equals(user.getEmail()) && pass_word.equals(user.getPass_word())) {
            return user;
        }
        return null; // Authentication failed
    }

}
