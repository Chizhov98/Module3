package Ui;

import service.Service;

import java.util.Scanner;

public class UiController {

    private static final Service service = new Service();
    private static final ConsoleUi ui = new ConsoleUi();
    private static final Scanner in = new Scanner(System.in);

    private static int scanInt() {
        int i = in.nextInt();
        in.nextLine();
        return i;
    }

    private static String scanLine() {
        return in.nextLine();
    }

    public static void mainMenu() {
        ui.mainMenu();
        switch (scanInt()) {
            case 1:
                ui.returnResult(service.getTomFifeSmsWriters());
                break;
            case 2:
                ui.returnResult(service.getTopFifeInternetUsers());
                break;
            case 3:
                ui.returnResult(service.getTopFifeCallers());
                break;
            case 4:
                ui.smsText();
                ui.returnResult(service.findSmsByText(scanLine()));
                break;
            case 5:
                ui.returnResult(service.getFavoriteDevice());
                break;
            case 6:
                ui.returnResult(service.getFavoriteService());
                break;
            case 0:
                System.exit(0);
            default:
                mainMenu();
        }
    }
}
