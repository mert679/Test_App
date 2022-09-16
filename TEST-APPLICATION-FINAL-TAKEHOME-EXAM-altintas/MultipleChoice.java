import java.util.ArrayList;
public class MultipleChoice extends Question{
  private String correctAnswer;
  private ArrayList<String> answerOptions;
  
  public MultipleChoice(int id,String text){
    super(id,text);
    answerOptions = new ArrayList<String>(4);
  }
  public boolean addAnswerOption(String option){
    
    
    if (answerOptions.size()>=4){
      return false;
    }
    
    for (String options : answerOptions) {
      if (options.equals(option)) {
        return false;
      }
  
    }
    this.answerOptions.add(option);
    return true;
      
    
    
  
  }
  
  public boolean addAnswerOption(String option,boolean isCorrect){
      // isCorrect=false;
      // if(option.charAt(option.length() - 1)=='*'){
      //   return isCorrect = true;
      // }else{
      //   return isCorrect = false;
      // }
    boolean result = addAnswerOption(option);
    
    if (result && isCorrect) {
      correctAnswer = option;
    }

    return result;
  }
  public ArrayList<String> getAnswerOptions(){
    return answerOptions;
  }
  public String getCorrectAnswer(){
    return correctAnswer;
  }
}