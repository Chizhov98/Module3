package utils;


import dao.CustomerDao;
import dao.CustomerLogDao;
import dao.OrderDao;
import entity.Customer;
import entity.DeviceTypes;
import entity.Order;
import entity.Tariff;
import entity.logEntity.TypeOfService;

import java.util.List;


public class CustomerUtils {
    private static final OrderDao orderDao = new OrderDao();
    private static final CustomerDao customerDao = new CustomerDao();
    private static final CustomerLogDao logDao = new CustomerLogDao();

    public static void callTo(Customer customer, Customer companion) {
        LogUtil.callSomeone(customer, companion);
    }

    public static void sendSmsTo(Customer customer, Customer companion) {
        LogUtil.sendSms(customer, companion);
    }

    public static void useInternet(Customer customer) {
        LogUtil.useInternet(customer);
    }

    public static void createNewOrder(Customer customer, Tariff tariff, DeviceTypes type) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setDeviceType(type);
        order.setTariff(tariff);
        orderDao.create(order);
        LogUtil.createNewOrder(customer);
    }

    public static void addNewCustomer(String name, String surname) {
        Customer customer = new Customer();
        customer.setFirstName(name);
        customer.setLastName(surname);
        customerDao.create(customer);
    }

    public static List<Customer> getTopFifeSmsUsers() {
        return customerDao.getTopSmsUsers();
    }

    public static List<Customer> getTopFifeInternetUser() {
        return customerDao.getTopInternetUsers();
    }

    public static List<Customer> getTopFifeCallers() {
        return customerDao.getTopCallers();
    }

    public static int smsCount(Customer customer) {
        int i = 0;
        i = logDao.getCountOfService(TypeOfService.SMS, customer);
        return i;
    }

    public static int callCount(Customer customer) {
        int i = 0;
        i = logDao.getCountOfService(TypeOfService.CALLS, customer);
        return i;
    }

    public static int internetCount(Customer customer) {
        int i = 0;
        i = logDao.getCountOfService(TypeOfService.INTERNET, customer);
        return i;
    }

}
