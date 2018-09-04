package mvc_crud.services;

import java.util.List;

import mvc_crud.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void addCustomer(Customer addedCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

}
