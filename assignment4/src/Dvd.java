class Dvd extends Item{
    private int duration;
    private int size;

    Dvd(String name,String author,int publishYear,int duration,int size){
        super(name,author,publishYear);
        this.duration=duration;
        this.size = size;

    }

    int getDuration(){
        return this.duration;
    }
    int getSize(){
        return this.size;
    }

    public String getAuthor() {
        return author();
    }

    public int getYear() {
        return getPublishYear();
    }
}
