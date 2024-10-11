class Book extends Item {
    private int pages;

    Book(String name,String author,int publishYear,int pages){
        super(name,author,publishYear);
        this.pages=pages;
    }

    int getPages(){
        return this.pages;
    }

    public String getAuthor() {
        return author();
    }

    public int getYear() {
        return getPublishYear();
    }
    public boolean getIssueStatus(){
        return getIsIssued();
    }
}
