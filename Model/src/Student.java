import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private String group;
    public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, String userName,String group,String password) {
        // by default student is always basic level so passing the access level basic
        super(id, firstName, lastName, dateOfBirth, userName, AccessLevel.Basic,password);

        this.group=group;
        // whenever new student is made a new list of subject  is made

    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String ToDisplay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        return String.format("%-15s %-25s %-25s %-25s %-15s %-20s %n",Id,firstName,lastName,formatter.format(dateOfBirth),age,group);
    }
}
