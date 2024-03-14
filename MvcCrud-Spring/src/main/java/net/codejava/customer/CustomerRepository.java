package net.codejava.customer;

import org.springframework.data.repository.CrudRepository;

//CrudRepository is interface which extends Repository interface


public interface CustomerRepository extends CrudRepository<Customer, Integer>{


	
}
