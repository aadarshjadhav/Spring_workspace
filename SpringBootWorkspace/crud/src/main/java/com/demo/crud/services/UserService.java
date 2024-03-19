package com.demo.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.iservice.IUserService;
import com.demo.crud.models.Product;
import com.demo.crud.models.User;
import com.demo.crud.repositories.ProductRepo;
import com.demo.crud.repositories.UserRepo;

@Service
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
	public User updateUser(User u) {
		
		User res= userrepo.save(u);
		return res;
	}

	@Override
	public void deleteUser(int id) {
		
		userrepo.deleteById(id);
		
	}


	
	@Override
    public User searchUserById(int id) {
        
		@SuppressWarnings("deprecation")
        User user = userrepo.getById(id);
        return mapToDTO(user);
    }

    private User mapToDTO(User user) {
    	User u = new User();
        u.setId(user.getId());
        u.setFullname(user.getFullname());
        u.setUsername(user.getUsername());
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        return u;
    }

}
