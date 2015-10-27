import java.util.Random;
import java.util.Scanner;

public class Test {
	public void simulateQuestion(int ques)
	{
		if(ques == 1)
		{
		
		
		System.out.println("Question 1. \nWhich of the following is smallest integer data type ?");
		System.out.println("(1) int");
		System.out.println("(2) short");
		System.out.println("(3) long");
		System.out.println("(4) byte\n");
		}
		else if(ques == 2)
		{
		
		System.out.println("Question 2. \nWhich of the following is not a primitive data type ?");
		System.out.println("(1) int");
		System.out.println("(2) short");
		System.out.println("(3) enum");
		System.out.println("(4) byte\n");
		}
		else if(ques == 3)
		{
		
		System.out.println("Question 3. \nInteger Data type does not include following primitive data type ____________.");
		System.out.println("(1) long");
		System.out.println("(2) short");
		System.out.println("(3) double");
		System.out.println("(4) byte\n");
		}
		else if(ques == 4)
		{
		
		System.out.println("Question 4. \nWhich of the tool is used to compile java code ?");
		System.out.println("(1) jar");
		System.out.println("(2) javac");
		System.out.println("(3) javadoc");
		System.out.println("(4) java\n");
		}
		else if(ques == 5){
		
		System.out.println("Question 5. \nJava Programming was designed by _________________.");
		System.out.println("(1) Sun Microsystems");
		System.out.println("(2) Microsoft");
		System.out.println("(3) Amazon Inc.");
		System.out.println("(4) Mozilla Corporation\n");
		}
	}
	int totalCorrect;
	boolean respondMessage;
	public void checkAnswer(int ques, int ans){
		
		if (ques==1){
			if(ans==3){
				totalCorrect++;
				respondMessage=true;
			}else{
				respondMessage=false;
			}
		}
		else if (ques==2){
			if(ans==1){
				totalCorrect++;
				respondMessage=true;
			}else{
				respondMessage=false;
			}
		}
		else if (ques==3){
			if(ans==1){
				totalCorrect++;
				respondMessage=true;
			}else{
				respondMessage=false;
			}
		}
		else if (ques==4){
			if(ans==1){
				totalCorrect++;
				respondMessage=true;
			}else{
				respondMessage=false;
			}
		}
		else if (ques==5){
			if(ans==1){
				totalCorrect++;
				respondMessage=true;
			}else{
				respondMessage=false;
			}
		}
		//System.out.print(totalCorrect);
		//System.out.print(respondMessage);
		//return respondMessage;
	}
	
	public void simulateMessage(boolean respondMessage){
		Random rando = new Random();
		
		if(respondMessage==true){
			
				switch ( rando.nextInt(4))
				{
				case 0:
				System.out.println("good Job!\n");
				break;
				case 1:
				System.out.println("very good!\n");
				break;
				case 2:
				System.out.println("excellent!\n");
				break;
				case 3:
				System.out.println("Greatttt!\n");
				break;			
				}
		}
		else {
			switch ( rando.nextInt(4))
			{
			case 0:
				System.out.println("Wrong Answer. Anyway don't give up!\n");
				break;
				case 1:
				System.out.println("No. Keep trying!\n");
				break;
				case 2:
				System.out.println("Please.Try Again!\n");
				break;
				case 3:
				System.out.println("Bad Luck..\n");
				
				break;			
				}			
			}
		}
	
	Scanner scan= new Scanner(System.in);
	int i=1;
	int cAns;
	public void inputAnswer(){
		for(i=1; i<=5; i++){
			simulateQuestion(i);
			 cAns= scan.nextInt();
			 checkAnswer(i,cAns);
			 simulateMessage(respondMessage);
		}
		System.out.println("# of Correct Answers : " + totalCorrect);
		System.out.println("# of Incorrect Answers : "+(5-totalCorrect));
		int result = (totalCorrect*100)/5;
		System.out.println(result+"% Correct.");
		
		
	}
}
