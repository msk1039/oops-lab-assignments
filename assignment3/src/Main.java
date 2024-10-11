import java.util.Scanner;

public class Main {

    static Account inputAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        String accNo = sc.nextLine();
        System.out.println("Enter account holder name");
        String name = sc.nextLine();
        System.out.println("Enter initial balance");
        double initialBalance = sc.nextInt();
        Account account1 = new Account(accNo, name, initialBalance);
        return account1;
    }

    public static void main(String[] args) {

        BankService bankService = new BankService();

        Scanner sc = new Scanner(System.in);

        String accountNo;
        boolean flag=true;
        while(flag){
            System.out.println("1.Add Account\n2.Remove Account\n3.Deposit Money\n4.Withdraw Money\n5.List accounts\n6.exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    Account account1=inputAccount();
                    bankService.addAccount(account1);
                    break;
                case 2:
                    System.out.println("Enter account number");
                    accountNo = sc.next();
                    bankService.removeAccount(accountNo);
                    break;
                case 3:
                    System.out.println("Enter account number");
                    accountNo = sc.next();
                    System.out.println("Enter deposite amount");
                    double deposite=sc.nextDouble();
                    bankService.depositMoney(accountNo, deposite);
                    break;
                case 4:
                    System.out.println("Enter account number");
                    accountNo = sc.next();
                    System.out.println("Enter withdraw amount");
                    double withdraw=sc.nextDouble();
                    bankService.withdrawMoney(accountNo, withdraw);
                    break;
                case 5:
                    bankService.listAccounts();
                   break;
                case 6:
                    System.out.println("exit");
                    flag=false;
                    return;
                default:
                    System.out.println("enter again");
            }
        }
    }
}