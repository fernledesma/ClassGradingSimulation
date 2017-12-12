
public class Essay extends GradedActivity {
   double grammar=30;
   double spelling=20;
   double correctLength=20;
   double content=30;

   public void setScore(double gr, double sp, double len, double cnt){
	   double score= gr+sp+len+cnt;
    }

    public void setGrammar(double g){
	   grammar=g;
    }

    public void setSpelling(double s){
	   spelling=s;
    }

    public void setCorrectLength(double c){
	   correctLength=c;
    }

    public void setContent(double c){
	    content=c;
    }

    public double getGrammar(){
	   return grammar;
    }

    public double getSpelling(){
	   return spelling;
    }

    public double getCorrectLength(){
	   return correctLength;
    }

    public double getScore(){
    	return grammar+spelling+correctLength+content;
    }
}
