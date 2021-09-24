package service;

import dao.*;
import entity.Customer;
import entity.DeviceTypes;


import java.util.Arrays;
import java.util.List;

public class Service {
    private final CallsDao callsDao = new CallsDao();
    private final CustomerDao customerDao = new CustomerDao();
    private final InternetDao internetDao = new InternetDao();
    private final SmsDao smsDao = new SmsDao();
    private final TariffDao tariffDao = new TariffDao();

    public List<Customer> getTopFifeInternetUsers() {
        return internetDao.getTopFifeUsers();
    }

    public List<Customer> getTopFifeCallers() {
        return callsDao.getTopFifeUsers();
    }

    public List<Customer> getTomFifeSmsWriters() {
        return smsDao.getTopFifeUsers();
    }

    public String findSmsByText(String text) {
        return smsDao.findSmsByTextPart(text);
    }

    public DeviceTypes getFavoriteDevice() {
        return internetDao.getTopUsingDevice();
    }

    public String getFavoriteService() {
        int internet = internetDao.getCountOfRows();
        int sms = smsDao.getCountOfRows();
        int calls = callsDao.getCountOfRows();
        int[] services = {internet, sms, calls};
        Arrays.sort(services);
        if (services[0] == internet) {
            return "Internet";
        }
        if (services[0] == sms) {
            return "Sms";
        }
        return "Call";
    }

}
