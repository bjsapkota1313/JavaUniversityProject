import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<User> studentList;
    private static List<User> teacherList;
    private static List<User> allUsers;
    private static  List<Report> reports;
    public Data(){
    studentList=StudentsInList();
    teacherList= teachersInList();
    allUsers= usersOfUniversity();
    subjects = new ArrayList<>();
    reports =new ArrayList<>();
    subjects.add(java);
    subjects.add(cSharp);
    subjects.add(python);
    subjects.add(PHP);
        addReports();
        addReport(reportOfEmma);
        addReport(reportOfJack);
        addReport(reportOfLisa);
       addReport(reportOfJohn);


    }
    // students
    public static Student emma=new Student(1,"Emma","Smith", LocalDate.of(1997,12,04),"emma","IT-02-A","emma12");
    public static Student jack=new Student(2,"Jack","Brown", LocalDate.of(1993,12,04),"jack","IT-02-A","emma12");
    public static Student michael=new Student(3,"Michael","Garcia", LocalDate.of(1997,12,04),"michael","IT-02-A","emma12");
    public static Student lisa=new Student(4,"Lisa","Jones", LocalDate.of(2001,12,04),"lisa","IT-02-A","emma12");
    public static Student john=new Student(5,"john","Garcia", LocalDate.of(2005,12,04),"john","IT-02-A","emma12");
    public static Student linda=new Student(6,"linda","Martinez", LocalDate.of(2002,12,04),"linda","IT-02-A","emma12");
    public static Student richard=new Student(7,"Richard","Garcia", LocalDate.of(1997,12,04),"richard","IT-02-A","emma12");
    public static Student mark=new Student(8,"Mark","Garcia", LocalDate.of(1997,12,04),"mark","IT-02-A","emma12");
    public static Student debora=new Student(9,"Debora","Hernandez", LocalDate.of(1997,12,04),"debora","IT-02-A","emma12");
    public static Student rick=new Student(10,"Rick","Moore", LocalDate.of(1998,12,04),"rick","IT-02-A","emma12");

    // Teachers
    public static Teacher david = new Teacher(11,"David","Taylor",LocalDate.of(1965,06,15),"david","david12");
    public static Teacher sophy = new Teacher(12,"Sophy","Anderson",LocalDate.of(1987,01,06),"sophy","david12");
    public static Teacher james = new Teacher(13,"James","Jordon",LocalDate.of(1999,06,15),"james","david12");
    public static Teacher susan = new Teacher(14,"Susan","Jackson",LocalDate.of(1978,06,15),"susan","david12");
    public static Teacher mary = new Teacher(15,"Mary","Lee",LocalDate.of(1971,06,15),"mary","david12");

    public static Subject java = new Subject("Java",100,55);
    public static Subject cSharp = new Subject("CSharp",100,55);
    public static Subject python = new Subject("Python",100,55);
    public static Subject PHP = new Subject("PHP",100,55);
    public static List<Subject> subjects;

    // list of students

    public Result resultOfEmmaInCsharp= new Result(emma,cSharp,50);
    public Result resultOfEmmaInJava= new Result(emma,java,54);
    public Result resultOfEmmaInPython= new Result(emma,python,66);
    public Result resultOfEmmaInPHP= new Result(emma,PHP,54);

    public Result resultOfJackInCsharp=new Result(jack,cSharp,72);
    public Result resultOfJackInJava= new Result(jack,java,68);
    public Result resultOfJackInPython= new Result(jack,python,43);
    public Result resultOfJackInPHP= new Result(jack,PHP,95);

    public Result resultOfMichaelInCsharp=new Result(michael,cSharp,45);
    public Result resultOfMichaelInJava= new Result(michael,java,71);
    public Result resultOfMichaelInPython= new Result(michael,python,55);
    public Result resultOfMichaelInPHP= new Result(lisa,PHP,85);

    public Result resultOfLisaInJava= new Result(lisa,java,98);
    public Result resultOfLisaInCsharp=new Result(lisa,cSharp,64);
    public Result resultOfLisaInPython= new Result(lisa,python,81);
    public Result resultOfLisaInPHP= new Result(lisa,PHP,72);

    public Result resultOfJohnInJava= new Result(john,java,100);
    public Result resultOfJohnInCsharp=new Result(john,cSharp,94);
    public Result resultOfJohnInPython= new Result(john,python,99);
    public Result resultOfJohnInPHP= new Result(john,PHP,93);



   public static Report reportOfEmma;
   public static Report reportOfJack;
   public static Report reportOfMichael;
   public static Report reportOfLisa;
   public static  Report reportOfJohn;

   private void addReports(){
       reportOfEmma = new Report();
       addResultsOnReport(reportOfEmma,resultOfEmmaInJava);
       addResultsOnReport(reportOfEmma,resultOfEmmaInCsharp);
       addResultsOnReport(reportOfEmma,resultOfEmmaInPython);
       addResultsOnReport(reportOfEmma,resultOfEmmaInPHP);

       reportOfJack= new Report();
       addResultsOnReport(reportOfJack,resultOfJackInJava);
       addResultsOnReport(reportOfJack,resultOfJackInCsharp);
       addResultsOnReport(reportOfJack,resultOfJackInPython);
       addResultsOnReport(reportOfJack,resultOfJackInPHP);

       reportOfMichael=new Report();
       addResultsOnReport(reportOfMichael,resultOfMichaelInJava);
       addResultsOnReport(reportOfMichael,resultOfMichaelInCsharp);
       addResultsOnReport(reportOfMichael,resultOfMichaelInPython);
       addResultsOnReport(reportOfMichael,resultOfMichaelInPHP);

       reportOfLisa= new Report();
       addResultsOnReport(reportOfLisa,resultOfLisaInJava);
       addResultsOnReport(reportOfLisa,resultOfLisaInCsharp);
       addResultsOnReport(reportOfLisa,resultOfLisaInPython);
       addResultsOnReport(reportOfLisa,resultOfLisaInPHP);

       reportOfJohn = new Report();
       addResultsOnReport(reportOfJohn,resultOfJohnInJava);
       addResultsOnReport(reportOfJohn,resultOfJohnInCsharp);
       addResultsOnReport(reportOfJohn,resultOfJohnInPython);
       addResultsOnReport(reportOfJohn,resultOfJohnInPHP);


    }
    public static List<Report> reports(){
       return reports;
    }
    public static void addReport(Report report){
       reports.add(report);
    }

   private  static void  addResultsOnReport(Report report,Result result ){
        report.addResult(result);
   }
    public static List<User> getStudents(){

        return studentList;
    }
    public static  List<User> getTeachers(){
        return teacherList;
    }

    private static  List<User> StudentsInList(){
        List<User> students = new ArrayList<>();
        students.add(emma);
        students.add(jack);
        students.add(michael);
        students.add(lisa);
        students.add(john);
        students.add(linda);
        students.add(richard);
        students.add(mark);
        students.add(debora);
        students.add(rick);
        return students;
    }
    private static  List<User> teachersInList(){
        List<User> teachers = new ArrayList<>();
        teachers.add(david);
        teachers.add(sophy);
        teachers.add(james);
        teachers.add(susan);
        teachers.add(mary);
        return teachers;
    }
    private static  List<User> usersOfUniversity(){
        List<User> users= new ArrayList<>();
        users.addAll(teachersInList());
        users.addAll(StudentsInList());
        return users;
    }
    public  static void addStudentToClass(Student student){
        studentList.add(student);
        allUsers.add(student);
        // everytime new student is made new report is made
        addReportToNewStudent( student);


    }
    public static   void addTeacher(Teacher teacher){
        allUsers.add(teacher);
        teacherList.add(teacher);
    }
    public static   List<User> getAllUsers(){
        if (allUsers==null){
            allUsers=usersOfUniversity();
       }
        return allUsers;
    }
    public static void addUserToUniversity(User user){
        allUsers.add(user);
    }
    private static void addReportToNewStudent(Student newStudent){
        Report reportOfNewStudent= new Report();
        for (Subject subject:subjects
             ) {
            addResultsOnReport(reportOfNewStudent,new Result(newStudent,subject,0));
        }
        addReport( reportOfNewStudent);
    }
}
