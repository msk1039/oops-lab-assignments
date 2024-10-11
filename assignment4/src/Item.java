public class Item {
    private String name;
    private String author;
    private int publishYear;
    private boolean isIssued;

    Item(String name,String author,int publishYear){
        this.name=name;
        this.author = author;
        this.publishYear = publishYear;
        this.isIssued = false;

    }

    String getName(){
        return this.name;
    }

    String author(){
        return this.author;
    }

    int getPublishYear(){
        return this.publishYear;
    }

    boolean getIsIssued(){return this.isIssued;}

    void issueItem(){
        if(this.isIssued==false){
            this.isIssued=true;
        }else{
            System.out.println("item already issued by someone else!!");
        }
    }
    void returnItem(){
        if (this.isIssued==true){
           this.isIssued=false;
        }
        else{
            System.out.println("item is already returned");
        }
    }
}
