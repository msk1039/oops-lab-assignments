public abstract class course {
    String coursecode;
    String title;
    int credits;
    public course(String coursecode, String title, int credits) {
        this.coursecode = coursecode;
        this.title=title;
        this.credits=credits;
    }

    public String getCoursecode(){
        return this.coursecode;
    }

    public String getTitle(){
        return this.title;
    }
    public int getCredits(){
        return this.credits;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
