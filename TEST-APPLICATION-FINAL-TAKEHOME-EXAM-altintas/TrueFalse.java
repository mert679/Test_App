public class TrueFalse extends Question{
  private boolean correctAnswer;
  public TrueFalse(int id,String text){
    super(id,text);
  }
  public void setCorrectAnswer(boolean correctAnswer){
     this.correctAnswer = correctAnswer;
  }
  public String getCorrectAnswer(){
    return "\t"+correctAnswer;
  }
}
