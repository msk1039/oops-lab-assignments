import java.util.*;

public class Library {
    private String name;
//    private List<Item> collection;
    private Map<String, Object> collection = new HashMap<>();

    public Library(String name) {
        this.name = name;
        this.collection = new HashMap<String, Object>();
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book id");
        String id = sc.next();
        if(collection.containsKey(id)){
            System.out.println("id already exists");
            return;
        }
        System.out.println("enter book name");
        String name = sc.next();
        System.out.println("enter book author");
        String author = sc.next();
        System.out.println("enter number of pages");
        int pages = sc.nextInt();
        System.out.println("enter publish year");
        int year = sc.nextInt();
        Book tempBook = new Book(name,author,year,pages);
        collection.put(id,tempBook);
    }
    public void addDVD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter DVD id");
        String id = sc.next();
        if(collection.containsKey(id)){
            System.out.println("id already exists");
            return;
        }
        System.out.println("enter DVD name");
        String name = sc.next();
        System.out.println("enter DVD author");
        String author = sc.next();
        System.out.println("enter publish year");
        int year = sc.nextInt();
        System.out.println("enter duration(in minutes)");
        int duration = sc.nextInt();
        System.out.println("enter size of dvd(in GB)");
        int size = sc.nextInt();
        Dvd tempDvd = new Dvd(name, author, year, duration, size);
        collection.put(id, tempDvd);
    }

    public void showItem(String id){
        if (collection.isEmpty()){
            System.out.println("library is empty");
        }else{
            Object temp = collection.get(id);
            if (temp instanceof Book){
                Book book = (Book) temp;
                System.out.println("Type: Book");
                System.out.println("Name: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year: " + book.getYear());
                System.out.println("Pages: " + book.getPages());
                System.out.println("is Issue: "+book.getIsIssued());
            } else if(temp instanceof Dvd) {
                Dvd dvd = (Dvd) temp;
                System.out.println("Type: DVD");
                System.out.println("Name: " + dvd.getName());
                System.out.println("Author: " + dvd.getAuthor());
                System.out.println("Year: " + dvd.getYear());
                System.out.println("Duration: " + dvd.getDuration() + " minutes");
                System.out.println("Size: " + dvd.getSize() + " GB");
                System.out.println("is Issued: "+dvd.getIsIssued());
            }
            else{
                System.out.println("invalid id");
            }

        }
    }
    public void showCollection(){
        if (collection.isEmpty()) {
            System.out.println("No items available.");
        } else {
            System.out.println("List of all items:");
            for (Map.Entry<String, Object> entry : collection.entrySet()) {
                String id = entry.getKey();
                Object item = entry.getValue();
                System.out.println("-------------------------------");
                System.out.println("Item ID: " + id);
                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println("Type: Book");
                    System.out.println("Name: " + book.getName());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Year: " + book.getYear());
                    System.out.println("Pages: " + book.getPages());
                    System.out.println("is Issue: "+book.getIsIssued());
                } else if (item instanceof Dvd) {
                    Dvd dvd = (Dvd) item;
                    System.out.println("Type: DVD");
                    System.out.println("Name: " + dvd.getName());
                    System.out.println("Author: " + dvd.getAuthor());
                    System.out.println("Year: " + dvd.getYear());
                    System.out.println("Duration: " + dvd.getDuration() + " minutes");
                    System.out.println("Size: " + dvd.getSize() + " GB");
                    System.out.println("is Issued: "+dvd.getIsIssued());
                }
                System.out.println("-------------------------------");
            }
        }
    }


    public void issueBook(String id){
        Object temp = collection.get(id);
        if (temp instanceof Book) {
            Book book = (Book) temp;
            book.issueItem();
        } else {
            System.out.println("Invalid Book ID.");
        }

    }
    public void issueDVD(String id){
        Object temp = collection.get(id);
        if (temp instanceof Dvd) {
            Dvd dvd = (Dvd) temp;
            dvd.issueItem();
        } else {
            System.out.println("Invalid DVD ID.");
        }
    }
    
    public void returnBook(String id){
        Object temp = collection.get(id);
        if (temp instanceof Book) {
            Book book = (Book) temp;
            book.returnItem();
        } else {
            System.out.println("Invalid Book ID.");
        }
    }     
    public void returnDVD(String id){
        Object temp = collection.get(id);
        if (temp instanceof Dvd) {
            Dvd dvd = (Dvd) temp;
            dvd.returnItem();
        } else {
            System.out.println("Invalid DVD ID.");
        }
    }
    public void removeItem(String id) {
        collection.remove(id);
    }
}
