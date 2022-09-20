import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public abstract class User {
    protected int Id;
    protected String firstName;
    protected String lastName;
    protected LocalDate dateOfBirth;
    protected String userName;
    protected String password;
    protected int age;
    protected AccessLevel accessLevel;

    public User(int id, String firstName, String lastName, LocalDate dateOfBirth, String userName, AccessLevel accessLevel,String password) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.accessLevel = accessLevel;
        this.password=password;
        age=calculateAge();
    }
    private int calculateAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public  abstract String ToDisplay();

}
