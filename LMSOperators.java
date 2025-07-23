package third_type_conversion;

public class LMSOperators {
    public static void main(String[] args) {
        int studentID=101;

        String studentName= santhi;
       int Age=17;
        int quizScore=70;  //We can use byte also in int place
        int assignmentScore=55;
        int examScore=70;
        double attendence=70;

        //Calculation-->operations
        double totalScore=quizScore +assignmentScore + examScore;
        double averageScore=totalScore/3;


        //Determine student passed or not-->Relational Operator
        boolean isStudentPassed = averageScore >= 75;
        
        //Update attendence
        attendence++;

        //Evaluate student qualified.-->logical operators
        //Requires high attedence(80 or above) and a passing grade

        boolean studentQualifiedAward =attendence>=80 && isStudentPassed;
        System.out.println("Student Name:"+studentName);
        System.out.println("Total Score:"+totalScore);
        System.out.println("Average Score:"+averageScore);
        System.out.println("Updated Attedence:"+attendence);
        System.out.println("Student Passed:"+istudentPassed);
        System.out.println("Student Awarded:"+isStudentQualifiedAward);
    }

}
