import java.time.LocalDate;


public class Manager extends User{
    public Manager(int id, String firstName, String lastName, LocalDate dateOfBirth, String userName,String password) {
        // by default manager is always Admin level so passing the access level admin
        super(id, firstName, lastName, dateOfBirth, userName, AccessLevel.Admin, password);
    }

    @Override
    public String ToDisplay() {
        return null;
    }
}
