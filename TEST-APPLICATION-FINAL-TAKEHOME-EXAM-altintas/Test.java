import java.util.ArrayList;
public class Test{
  private ArrayList<Question>questions;
  private String testName;
  private int id;
  
  public Test(int testId,String testName){
    id =testId;
    this.testName=testName;
    questions = new ArrayList<Question>();
  }
  public void addQuestion(Question question){
    for(Question q:questions){
      if(q.getText()==testName){
        System.out.println("This test already exists");
      }
    }
    questions.add(question);
  }
  public void addQuestion(int order,Question question){
    
    this.questions.add(order,question);
  }
  public boolean deleteQuestion(int id){
    int c = 0;
    int index = -1;
    for(Question q: questions){
      if(q.getId()==id){
        index=c;
      }
      c++;
    }
    if(index != -1){
      questions.remove(index);
      return true;
    }else{
      return false;
    }
  }
  public int getNumberOfQuestions(){
    
      return questions.size();
    
    
  }
  public String toString(){
  
  String str = testName+"\n"+"Number of questions: " + "#" + id + "\n"+getNumberOfQuestions()+"\n"; 
    return str;
  }
}