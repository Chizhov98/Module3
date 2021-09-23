package Ui;

public class ConsoleUi {

    public void mainMenu() {
        System.out.println("Chose one of:\n" +
                "1. Get top 5 of sms users\n" +
                "2. Get top 5 of internet users\n" +
                "3. Get top 5 of callers\n" +
                "4. Found sms by part of text\n" +
                "5. Get favorite device\n" +
                "6. Get favorite service\n" +
                "0. Exit\n"
        );
    }

    public void smsText(){
        System.out.println("Write part of text to find");
    }

    public <T> void returnResult(T obj){
        System.out.println(obj.toString());
    }
}
