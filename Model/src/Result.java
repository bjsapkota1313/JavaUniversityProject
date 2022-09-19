import java.util.List;

public class Result {
    private Student student;
    private Subject subject;
    private int obtainedMarks;

    public Result(Student student,Subject subject,int obtainedMarks) {
        this.student = student;
        this.subject = subject;
        this.obtainedMarks=obtainedMarks;
    }
}
