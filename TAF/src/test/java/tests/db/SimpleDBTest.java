package tests.db;

import baseEntities.BaseApiTest;
import dbEntitties.CustomersTable;
import dbServices.CustomersService;
import models.Customer;
import models.CustomerBuilder;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleDBTest extends BaseApiTest {

    @Test
    public void simpleDBTest() {
        CustomersTable customersTable = new CustomersTable(dataBaseService);
        customersTable.dropTable();
        customersTable.createCustomersTable();

        customersTable.addCustomer(CustomerBuilder.builder()
                .first_name("Иван")
                .last_name("Иванов")
                .email("iviv@test.com")
                .age(32)
                .build());

        customersTable.addCustomer(CustomerBuilder.builder()
                .first_name("Петр")
                .last_name("Петров")
                .email("pepe@test.com")
                .age(28)
                .build());

        customersTable.addCustomer(CustomerBuilder.builder()
                .first_name("Марина")
                .last_name("Стасевич")
                .email("ms@test.com")
                .age(23)
                .build());

        ResultSet rs = customersTable.getCustomersBuId();

        try {
            while (rs.next()){
                String userID = rs.getString("ID");
                String firstname = rs.getString("first_name");
                String lastname = rs.getString("Last_name");
                int age = rs.getInt("age");

                System.out.println(userID);
                System.out.println(firstname);
                System.out.println(lastname);
                System.out.println(age);


            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void hibernateTest(){
        CustomersService customersService = new CustomersService();
        Customer customer = new Customer("Ivan", "Grigor", "gghbjk@gmail.com", 33);

        customersService.saveUser(customer);

        List<Customer> customerList = customersService.findAllUsers();
        for (Customer user : customerList){
            System.out.println(user.toString());
        }

    }
}
