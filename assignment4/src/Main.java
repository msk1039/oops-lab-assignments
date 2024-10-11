import java.util.Scanner;

public class Main {
    static void menu(Library lib1){
        Scanner sc = new Scanner(System.in);
        int choice;
        int type=0;
        String id="";

        while(true){
            System.out.println("---------------------------");
            System.out.println("| 1. add item             |");
            System.out.println("| 2. remove item          |");
            System.out.println("| 3. issue item           |");
            System.out.println("| 4. return item          |");
            System.out.println("| 5. display item         |");
            System.out.println("| 6. display all items    |");
            System.out.println("| 7. exit                 |");
            System.out.println("---------------------------");
            System.out.println("enter you choice:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the item type\n1. Book \n2. DVD");
                    type = sc.nextInt();
                    if (type==1) {
                        lib1.addBook();
                    }
                    else if (type==2){
                        lib1.addDVD();
                    }
                    else{
                        System.out.println("wrong choice,please try again");
                    }
                    break;
                case 2:
                    System.out.println("enter the id of item to be removed");
                    id = sc.next();
                    lib1.removeItem(id);
                    break;
                case 3:
                    System.out.println("enter the item type\n1. Book \n2. DVD");
                    type = sc.nextInt();
                    if (type==1) {
                        System.out.println("enter book id");
                        id= sc.next();
                        lib1.issueBook(id);
                    }
                    else if (type==2){
                        System.out.println("enter DVD id");
                        id= sc.next();
                        lib1.issueDVD(id);
                    }
                    else{
                        System.out.println("wrong choice,please try again");
                    }
                    break;
                case 4:
                    System.out.println("enter the item type\n1. Book \n2. DVD");
                    type = sc.nextInt();
                    if (type==1) {
                        System.out.println("enter book id");
                        id = sc.next();
                        lib1.returnBook(id);
                    }
                    else if (type==2){
                        System.out.println("enter dvd id");
                        id=sc.next();
                        lib1.returnDVD(id);
                    }
                    else{
                        System.out.println("wrong choice,please try again");
                    }
                    break;
                case 5:
                    System.out.println("enter item id");
                    id=sc.next();
                    lib1.showItem(id);
                    break;
                case 6:
                    lib1.showCollection();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("invalid choice, please try again");


            }

        }

    }
    public static void main(String[] args) {
        Library lib1 = new Library("Library1");
        menu(lib1);
    }
}