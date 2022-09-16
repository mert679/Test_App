public abstract class Question{
  
  private int id;
  private String text;
  public Question(){
    
  }
  public Question(int id,String text){
    this.id = id;
    this.text=text;
  }
  public int getId(){
    return id;
  }
  public String getText(){
    return text;
  }
  public abstract String getCorrectAnswer();
} 