package mvc_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc_crud.dao.CustomerDAO;
import mvc_crud.entities.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired 
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list") 
	public String listCustomer(Model model) {
		
		List<Customer> listCustomers = customerDAO.getCustomers();
		model.addAttribute("listCustomers", listCustomers);
		return "list-customers";
	}

}
