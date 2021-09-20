package Ui;

import utils.CustomerUtils;
import utils.LogUtil;

import java.util.Scanner;

public class UiController {

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
                CustomerUtils.getTopFifeSmsUsers();
                break;
            case 2:
                CustomerUtils.getTopFifeInternetUser();
                break;
            case 3:
                CustomerUtils.getTopFifeCallers();
                break;
            case 4:
                ui.smsText();
                LogUtil.getSms(scanLine());
                break;
            case 5:
                LogUtil.getPopularDevice();
                break;
            case 6:
                LogUtil.getPopularService();
                break;
            case 0:
                System.exit(0);
            default:
                mainMenu();
        }
    }


}
