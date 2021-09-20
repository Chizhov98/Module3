package utils;

import dao.CustomerLogDao;
import dao.OrderDao;
import dao.SmsDao;
import entity.Customer;
import entity.DeviceTypes;
import entity.logEntity.CustomerLog;
import entity.logEntity.SmsLog;
import entity.logEntity.TypeOfService;

public class LogUtil {
    private static final CustomerLogDao logDao = new CustomerLogDao();
    private static final OrderDao orderDao = new OrderDao();
    private static final SmsDao smsDao = new SmsDao();

    public static void createNewOrder(Customer customer) {
        CustomerLog log = new CustomerLog();
        log.setTypeOfService(TypeOfService.ORDER);
        log.setCustomer(customer);
        log.setAction("Customer bought new tariff: ");
        logDao.create(log);
    }

    public static void callSomeone(Customer caller, Customer companion) {
        CustomerLog log = new CustomerLog();
        log.setTypeOfService(TypeOfService.CALLS);
        log.setCustomer(caller);
        log.setAction("Customer call to id: " + companion.getId());
        logDao.create(log);
    }

    public static void useInternet(Customer customer) {

        CustomerLog log = new CustomerLog();
        log.setTypeOfService(TypeOfService.INTERNET);
        log.setCustomer(customer);
        log.setAction("Customer used internet");
        logDao.create(log);
    }

    public static void sendSms(Customer customer, Customer companion) {

        CustomerLog log = new CustomerLog();
        log.setTypeOfService(TypeOfService.SMS);
        log.setCustomer(customer);
        log.setAction("Customer send sms to id:" + companion.getId());
        logDao.create(log);
    }

    public static SmsLog getSms(String text){
        return smsDao.findSmsByTextPart(text);
    }

    public static TypeOfService getPopularService() {
        return logDao.getMostPopularService();
    }


    public static DeviceTypes getPopularDevice() {
        return orderDao.getMostPopularDevice();
    }
}
