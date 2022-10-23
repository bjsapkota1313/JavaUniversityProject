import java.util.ArrayList;
import java.util.List;

public class Report {

        private List<Result> results;

        public Report() {


            results=new ArrayList<>();
        }
        public void addResult(Result result){
            results.add(result);
        }
        public String toDisplay(){
            Student student = null;
             int[] grades= new int[results.size()];
            // System.out.println(results.size());
            for (Result result:results
                 ) {
                student=result.student;
                grades[results.indexOf(result)]=result.obtainedMarks;

            }
            return String.format("%-15s %-25s %-25s %-25s %-15s %-25s %-20s %-20s %-20s %-20s %n",student.Id,student.firstName,student.lastName,student.dateOfBirth,student.age,student.getGroup(),grades[0],grades[1],grades[2],grades[3]);
           // return student.ToDisplay()+String.format(" %-20s %-20s %-20s %-20s %n",grades[0],grades[1],grades[2],grades[3]);
        }


}
