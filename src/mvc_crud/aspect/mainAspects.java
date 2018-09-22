package mvc_crud.aspect;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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
	public void exec1() {
		System.out.println("List Customers " + LocalDateTime.now());
	}
	
	
}
