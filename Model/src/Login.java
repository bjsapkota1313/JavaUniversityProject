
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Login {
    private String userName;
    private String password;
    private User loggedUser;
    private Scanner scanner;
    public static void  main(String[] args) {
        Login login= new Login();
        login.start();
    }
    void start(){
        Data data = new Data();
        scanner= new Scanner(System.in);
        askLoginDetails();

        loggedUser= getLoggedUser(userName,password );
       // test();
        giveFunctionalityToLoggedUSer();
    }
    private void askLoginDetails (){
        System.out.print("Enter username: ");
        userName=scanner.nextLine();
        userName= "david";

        System.out.print("Enter password: ");
        password=scanner.nextLine();
        password="david12";


    }
    private User getLoggedUser(String userName,String password){
        for (User user :Data.getAllUsers()
             ) {
            if(user.userName.equals(userName)  && user.password.equals(password )){
                return user;
            }
        }
        return null;
    }
    private void giveFunctionalityToLoggedUSer()
    {
        Character  inputCharacter=' ';
        if (loggedUser== null){
           System.out.print("No user is in university with this login details ");
           return;
       }
        else if (loggedUser instanceof Student){
            do {
                System.out.println("S. Display Students   | T. Display Teachers   | X. Exit");
               inputCharacter=askCharacter();
                if (inputCharacter=='S' || inputCharacter=='s'){
                    System.out.println("LIST OF STUDENTS");
                    displayStudents();
                }
                else if(inputCharacter=='T'|| inputCharacter=='t'){
                    System.out.println("LIST OF TEACHERS");
                    displayTeachers();
                }

            }
            while (inputCharacter!='X'||inputCharacter=='x' );
         }
        else if (loggedUser instanceof Teacher ) {
            do {
                System.out.println("S. Display Students   | T. Display Teachers   | A. Add Students  | R. Display Reports |  X. Exit");
                inputCharacter=askCharacter();
                if (inputCharacter=='S' || inputCharacter=='s'){
                    System.out.println("LIST OF STUDENTS");
                    displayStudents();
                }
                else if(inputCharacter=='T'|| inputCharacter=='t'){
                    System.out.println("LIST OF TEACHERS");
                    displayTeachers();
                }
                else if (inputCharacter=='A'|| inputCharacter=='a') {
                    System.out.println("STUDENT");
                    addStudent();
                }
                else if (inputCharacter =='R' || inputCharacter =='r'){
                    System.out.println("STUDENT RESULTS");
                    displayReports();

                    System.out.print("Enter student id(Report Details) | Or 0 back to main menu: ");
                    int inputNumber= scanner.nextInt();
                    if(inputNumber!=0){

                    }
                }
            }
            while (!inputCharacter.equals('X')  | !inputCharacter.equals('x') );

        }
        else if(loggedUser instanceof  Manager){

       }
        System.out.print("Leaving the program now ...");
    }
    private void displayStudents(){
        System.out.printf("%-15s %-25s %-25s %-25s %-15s %-20s %n","ID","FirstName","LastName","Birthdate","Age","Group");
        System.out.printf("%-15s %-25s %-25s %-25s %-15s %-20s %n","**","*********","****","*********","***","*****");

        for (User student:Data.getStudents()
             ) {
            System.out.print(student.ToDisplay());
        }

    }
    private void displayTeachers(){
        System.out.printf("%-15s %-25s %-25s %-25s %-15s %n","ID","FirstName","LastName","Birthdate","Age");
        System.out.printf("%-15s %-25s %-25s %-25s %-15s  %n","**","*********","****","*********","***");
        for (User teacher:Data.getTeachers()
        ) {
            System.out.print(teacher.ToDisplay());
        }
    }
    private char askCharacter(){
        System.out.print("Please, enter a choice: ");
        return scanner.next().charAt(0);
    }
    private void addStudent(){
        System.out.print("Choose a username: ");
        String userName= scanner.next();
        System.out.print("Choose a password: ");
        String password= scanner.next();
        System.out.print("Enter first name: ");
        String firstName= scanner.next();
        System.out.print("Enter Last name: ");
        String lastName= scanner.next();
        System.out.print("please enter date of birth in MM/DD/YYYY: ");
        String date= scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate dateOfBirth=LocalDate.parse(date,formatter);
        System.out.print("Enter group: ");
        String group= scanner.next();
            //everytime while adding student counting users and adding and giving id
        int id= Data.getAllUsers().size()+1;
        // making a new student object
        Student student = new Student(id,firstName,lastName,dateOfBirth,userName,group,password);

        Data.addStudentToClass(student);
        System.out.println(Data.getAllUsers().size());
        if(student.Id==Data.getAllUsers().size()) {
            System.out.println("The data was successfully added!");
        }
        else{
                System.out.println("something went wrong while adding student! Try again" );
            }
        System.out.println();
        System.out.println();


    }
    private void displayReports(){
        System.out.printf("%-15s %-25s %-25s %-25s %-15s %-25s %-20s %-20s %-20s %-20s %n","ID","FirstName","LastName","Birthdate","Age","Group","Java","Csharp","Python","PHP");
        System.out.printf("%-15s %-25s %-25s %-25s %-15s %-25s %-20s %-20s %-20s %-20s %n","**","*********","********","*********","***","*****","****","******","******","***");
        for (Report report:Data.reports()
             ) {
            System.out.print(report.toDisplay());
        }
    }
}
