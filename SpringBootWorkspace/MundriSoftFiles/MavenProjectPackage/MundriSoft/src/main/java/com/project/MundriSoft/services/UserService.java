package com.project.MundriSoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.MundriSoft.iservice.IUserService;
import com.project.MundriSoft.models.User;
import com.project.MundriSoft.repositories.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService{

	@Autowired
	private UserRepo userrepo;

	@Override
	public List<User> getAllUsers() {
		
		List<User> userlist = userrepo.findAllUsers();
		
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


	public User authentication(String username, String pass_word) {
        User user = userrepo.findByUsername(username);
        if (user != null && username.equals(user.getUsername()) && pass_word.equals(user.getPass_word())) 
        {
            System.out.println("Inside UserService:"+ user.getUsername() + "Password:"+ user.getPass_word());
        	return user;
        }
        return null; // Authentication failed
    }

}
