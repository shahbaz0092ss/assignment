import java.util.Scanner;

public class mainDie {
static Scanner s = new Scanner(System.in);
	public static void main(String arg[]){
		
		for (int i=0 ; i<3; i++){
			Die d= new Die();
			d.askNum();
			int userNum = s.nextInt();
			int getSum = d.RollDie();
			if (getSum == userNum){
				System.out.println("You Won!\n");
				break;
			}
			else{
				if(i==2){
					System.out.println("Game over meri jaan\n");
				}
				else{
					System.out.println("Try Again!\n");
				}
				
			}
		}
	}
	
}
