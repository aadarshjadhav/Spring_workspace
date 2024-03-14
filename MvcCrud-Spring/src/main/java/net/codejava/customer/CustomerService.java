package net.codejava.customer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {
	
	@Autowired CustomerRepository repo;
	public void save(Customer customer)
	{
		repo.save(customer);
	}
	
	public List<Customer> listAll(){
		
		return (List<Customer>) repo.findAll();
	}
	
	public Customer get(int id) {
		
		return repo.findById(id).get();
	}

	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
