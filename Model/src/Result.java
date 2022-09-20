import java.util.List;

public class Result {
    protected Student student;
    protected Subject subject;
    protected int obtainedMarks;

    public Result(Student student,Subject subject,int obtainedMarks) {
        this.student = student;
        this.subject = subject;
        this.obtainedMarks=obtainedMarks;
    }
}
