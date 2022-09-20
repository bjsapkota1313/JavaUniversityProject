import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
    private List<Subject> subjects;
    public Teacher(int id, String firstName, String lastName, LocalDate dateOfBirth, String userName,String password) {

        // by default Teacher is always Editor level so passing the access level Editor
        super(id, firstName, lastName, dateOfBirth, userName, AccessLevel.Editor,password);

        // whenever new teacher is made a new list of subject  is made
        subjects= new ArrayList<>();
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    @Override
    public String ToDisplay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        return String.format( "%-15s %-25s %-25s %-25s %-15s %n",Id,firstName,lastName,formatter.format(dateOfBirth),age);
    }
}
