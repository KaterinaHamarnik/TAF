package dbServices;

import dao.CustomerDao;
import models.Customer;

import java.util.List;

public class CustomersService {

    private CustomerDao customerDao = new CustomerDao();

    public CustomersService(){

    }

    public Customer findUsers(int id){
        return customerDao.findById(id);
    }

    public void saveUser(Customer customer){
        customerDao.save(customer);
    }

//    public List<Customer> findAllUsers(){
//
//    }
}
