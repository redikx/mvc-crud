package mvc_crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvc_crud.entities.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> thisQuery = session.createQuery("from Customer order by last_name", Customer.class);
		
		List<Customer> customers = thisQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer addedCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(addedCustomer);
		
	}

}
