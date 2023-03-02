import java.util.Scanner;

import javax.naming.ldap.SortKey;
import javax.swing.event.PopupMenuListener;

import java.util.ResourceBundle;
import java.util.Locale;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Please select a langueage:");
        System.out.println("Press 1 for English");
        System.out.println("اضغط 2 للغة العربية");
        System.out.println("Paina 3 Suomen kielen varten");

        // user choise
        Scanner S = new Scanner(System.in);

        int InterLanguage = S.nextInt();
        S.nextLine(); // clear newline character from input buffer

        Locale locale = null;
        switch (InterLanguage) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("ar", "IQ");
                break;
            case 3:
                locale = new Locale("fi", "FI");
                break;
            default:
                System.out.println("Invalid language selection");

                return;
        }

        int balance = 1000;
        int withdraw = 0;
        int deposit = 0;

        Scanner s = new Scanner(System.in);
        while (true) {
            if (InterLanguage == 1) {
                System.out.println("Welcome, please choise an operation");
                System.out.println("Press 1 for Withdraw");
                System.out.println("Press 2 for Deposit");
                System.out.println("Press 3 for Check Balance");
                System.out.println("press 4 for EXIT");

                int n = s.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
            if (InterLanguage == 2) {
                System.out.println("الرجاء ادخال رقم العملية ");
                System.out.println("اضغط 1 لعملية السحب");
                System.out.println("اضغط 2 للايداع");
                System.out.println("اضغط 3 من للوديعة الكلية");
                System.out.println("اضغط 4 من لتسجيل الخروج");

                int n = s.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("ادخل المبلغ المراد سحبه");
                        withdraw = s.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("من فضلك تاكد من اخذ المبلغ المسحوب ");
                        } else {
                            System.out.println("رصيدك غير كاف");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("الرجاء ادخال المبلغ المراد ايداعه");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("تمت عملية الايداع بنجاح");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("الوديعة : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
            if (InterLanguage == 3) {
                System.out.println("Tervetuloa, valitse toiminto");
                System.out.println("Paina 1 nostoa varten");
                System.out.println("Paina 2 talletusta varten");
                System.out.println("Paina 3 saldon tarkistamiseksi");
                System.out.println("Paina 4 poistuaksesi");

                int n = s.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Syötä nostettava rahasumma:");
                        withdraw = s.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Ota rahasi");
                        } else {
                            System.out.println("Saldo ei riitä");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Syötä talletettava rahasumma:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Raha on talletettu");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }

        }
    }
}
