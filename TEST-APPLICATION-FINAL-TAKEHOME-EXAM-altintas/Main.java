import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    int userch,qtype;
    String question,opt;
    
    int nmc = 0;
    int ntf=0;
    
    ArrayList<Test> tst = new ArrayList<Test>();
    System.out.println("WELCOME TO TEST PROGRAM");
    while(true){
      Scanner key = new Scanner(System.in);
      
      
      System.out.println("\t1. Create a Test");
      System.out.println("\t2. List existing Tests");
      System.out.print("Make a selection: (1 or 2)");
      userch = key.nextInt();
       if (userch == 1) { // Create a Test
        System.out.print("\n   Enter a name for the test: ");

        String testnme = key.next();

        Test test = new Test(tst.size()+1, testnme);
        System.out.println("test is created.\n");
        while (true){
          System.out.println("Add mc or tf(1 or 2): ");
          qtype = key.nextInt();
          if (qtype==1){
            ++nmc;
            System.out.print("\tQuestion text: ");
            question=key.next();
            System.out.println("Enter the answer options");
            System.out.println("After entering an option press Enter key");
            System.out.println("Add * to indicate the correct option.");
            MultipleChoice mc = new MultipleChoice(test.getNumberOfQuestions()+1,question);
            for(int i=1; i<=4; i++){
              System.out.printf("options%d: ",i);
              opt= key.next();
              boolean isC=false;
              if (opt.length() > 0){
                isC = (opt.charAt(opt.length()-1) == '*');
              }
                
              mc.addAnswerOption(opt,isC);
            }
            test.addQuestion(mc);
   
              
          }if (qtype==2){
            ntf++;
            
            System.out.println("Adding tf Question #"  +test.getNumberOfQuestions()+ "\n");

            System.out.print("Question text: ");
            String qtxt = key.next();

            TrueFalse tfq = new TrueFalse(test.getNumberOfQuestions()+1, qtxt);

            System.out.print("Enter the correct answer (true or false): ");
            boolean correctAnswer = key.nextBoolean();

            tfq.setCorrectAnswer(correctAnswer);
            test.addQuestion(tfq);
      }
            tst.add(test);      
            System.out.print("Add more? (y or n): ");
            char addmore = key.next().charAt(0);;
            if (addmore == 'y') {
                  continue;
            }else if(addmore =='n'){
              break;
            }
    }
        
         
        
         
      }else if(userch==2){
         System.out.println("Number of questions: " + (nmc+ntf));
            System.out.println("True/False: " + (ntf));
            System.out.println("Mutliple Choice: " + (nmc));
      }
    
    }
    
  }
  
 
}