import java.util.ArrayList;
import java.util.List;

public class ITcourse extends course{
    private List<String> enrolledstudents;

    public ITcourse(String coursecode,String title ,int credits){
        super(coursecode,title,credits);
        this.enrolledstudents = new ArrayList<>();


    }

    public void enrollstudent(String studentName){
        enrolledstudents.add(studentName);
    }

    public void displaycoursedetails(){
        System.out.println("course code= "+this.coursecode);
        System.out.println("course title= "+this.title);
        System.out.println("no of credits="+this.credits);
        System.out.println("Enrolled students="+this.enrolledstudents);
    }
}
