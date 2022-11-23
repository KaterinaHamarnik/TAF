package dbEntitties;

import models.Customer;
import services.DataBaseService;

import java.sql.ResultSet;
import java.sql.Statement;

public class CustomersTable {
    private DataBaseService dataBaseService;

    public CustomersTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void dropTable() {
        System.out.println("Удаляем customers таблицу");
        String dropTableCustomersSQL = "DROP TABLE Customers;";

        dataBaseService.executeSQL(dropTableCustomersSQL);
    }

    public void createCustomersTable() {
        System.out.println("Создаем customers таблицу");

        String createTableSQL = "CREATE TABLE Customers (" +
                "ID SERIAL PRIMARY KEY, " +
                "First_Name CHARACTER VARYING(30), " +
                "Last_Name CHARACTER VARYING(30), " +
                "Email CHARACTER VARYING(30), " +
                "Age INTEGER" +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void addCustomer(CustomerBuilder customer) {
        String insertTableSQL = "INSERT INTO public.Customers(" +
                "first_name, last_name, email, age)" +
                "VALUES ('" + customer.getFirst_name() + "', '" + customer.getLast_name() +
                "', '" + customer.getEmail() + "', " + customer.getAge() + ");";

        dataBaseService.executeSQL(insertTableSQL);
    }

    public ResultSet getCustomersBuId(int id){
        String selectSQL = "SELECT * FROM public.customers WHERE id = " + id + ";";

        return dataBaseService.executeQuery(selectSQL);
    }

}
