import config.FactoryConfiguration;
import entity.Customer;
import entity.CustomerFullName;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerFullName customerFullName = new CustomerFullName(
                "john",
                "doe"
        );

        Customer customer = new Customer(
                3,
                "Bob",
                "bob@example.com",
                "0777777777",
                "345654 567876 56765",
                "bhvbehbj",
                customerFullName
        );
        saveCustomer(customer);
//        Customer customer_1 = getCustomerById(1);
//        System.out.println(customer_1);
//
//        Customer customer_5 = getCustomerById(5);
//        System.out.println(customer_5);

//        deleteCustomer(1);

//        updateCustomer(2,new Customer(
//                2,
//                "Eva",
//                "eva@example.com",
//                "0788888888"
//        ));
//        List<Customer> allCustomer = getAllCustomer();
//        for (Customer customer : allCustomer){
//            System.out.println(customer);
//        }
    }

    // xml to property file for configurations

    public static List<Customer> getAllCustomer() {
        Session session = FactoryConfiguration.getInstance().getSession();
        // HQL - Hibernate Query Language
        List<Customer> customers = session.createQuery(
                "from Customer",
                Customer.class
        ).list();
        return customers;
    }

    public static boolean updateCustomer(int id, Customer newCustomer) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            Customer customer = session.get(Customer.class, id);
            Transaction transaction = session.beginTransaction();

//            session.update(newCustomerData); don't use
            customer.setName(newCustomer.getName());
            customer.setEmail(newCustomer.getEmail());
            customer.setPhone(newCustomer.getPhone());

            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            session.close();
        }
    }

    public static boolean deleteCustomer(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            Transaction transaction = session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            session.delete(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            session.close();
        }
    }

    public static Customer getCustomerById(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    public static boolean saveCustomer(Customer customer) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
            System.out.println("Data saved...!");
            return true;
        } catch (Exception e) {
            System.out.println("Fail to save data...!");
            return false;
        } finally {
            session.close();
        }
    }
}















