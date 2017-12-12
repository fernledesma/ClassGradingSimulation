import java.util.Scanner;

public class EssayDemo {
   public static void main(String[] args){
	Scanner kb= new Scanner(System.in);
	Essay ClassEssay = new Essay();
    
	System.out.println("Please enter how you scored in grammar.");
	double grammar= kb.nextDouble();
	ClassEssay.setGrammar(grammar);
	
	System.out.println("Please enter how you scored in spelling.");
	double spelling= kb.nextDouble();
	ClassEssay.setSpelling(spelling);
	
	System.out.println("Please enter how you scored in the length of the essay.");
	double length= kb.nextDouble();
	ClassEssay.setCorrectLength(length);
	
	System.out.println("Please enter how you scored in the content.");
	double content= kb.nextDouble();
	ClassEssay.setContent(content);
	ClassEssay.setScore(grammar, spelling, length, content);
	double essayScore = ClassEssay.getScore();
	
	System.out.println("Your Score is: "+ essayScore);
	System.out.println("Your Grade is:"+ ClassEssay.getGrade());
}
}
