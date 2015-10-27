import java.util.Random;

public class Die {
	Random r = new Random();
	private int rollOne , rollTwo;
	public Die(){
		
	 rollOne = r.nextInt(6)+1;
	 rollTwo = r.nextInt(6)+1;
	
	
	}
	public void askNum(){
		
	System.out.println("Enter a number of your choice from 2 to 12!!\n");
	
	}
	public int RollDie(){
		int sum = rollOne + rollTwo;
		System.out.println(sum);
		return sum;
	}
}
