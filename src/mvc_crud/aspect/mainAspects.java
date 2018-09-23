package mvc_crud.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component

public class mainAspects {
	@Pointcut("execution(* mvc_crud.controllers.CustomerController.listCustomer(..))")
	public void ListCustomerAspect() {}
	
	@Before("mvc_crud.aspect.mainAspects.ListCustomerAspect()")
	public void BeforeListCustomerAspect() {
		System.out.println("List Customers " + LocalDateTime.now());
	}
	
	@Pointcut("execution(* mvc_crud.dao.CustomerDAO.saveCustomer(..))")
	public void SaveCustomerAspect() {}
	
	@After("SaveCustomerAspect()")
	public void AfterSaveCustomerAspect(JoinPoint jointPoint) {
		String theMethod = jointPoint.getSignature().toString();
		System.out.println("Signature : " + theMethod);
		Object[] args = jointPoint.getArgs();
		
		for (Object tempargs : args) {
			System.out.println(tempargs.toString());
		} 
	}
	
	@Pointcut("execution(* mvc_crud.dao.CustomerDAO.deleteCustomer(..))")
	public void DeleteCustomerAspect() {}
	
	@Before("DeleteCustomerAspect()") 
	public void BeforeDeleteCustomerAspect(JoinPoint joinPoint) {
		String theMethod = joinPoint.getSignature().toString();
		System.out.println("Signature " + theMethod + " at " + LocalDateTime.now());
		Object[] args = joinPoint.getArgs();
		
		for (Object tempargs : args) {
			System.out.println("Customer " + tempargs.toString() + " deleted");
			
		}
				
	}
	
	
	
}
