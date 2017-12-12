
public class CourseGrades {
GradedActivity grades[];
int NUM_GRADES = 4;
   public CourseGrades(){
	   
   }
   
   public void setLab(GradedActivity aLab){
	   grades[0]=aLab;
   }
   
   public void setPassFailExam(PassFailExam aPassFailExam){
	   grades[1]=aPassFailExam;
   }
   
   public void setEssay(Essay anEssay){
	   grades[2]=anEssay;
   }
   
   public void setFinalExam(FinalExam aFinalExam){
	   grades[3]=aFinalExam;
   }
   
   public String toString(){
	   String str = 
               "\nLab Information:\n" +
               grades[0] +
               "\nPass or Fail Exam Information:\n" +
               grades[1] +
               "\nEssay Information:\n" +
               grades[2] +
               "\n Final Exam Information\n" +
               grades[3];
       return str;

   }
}
