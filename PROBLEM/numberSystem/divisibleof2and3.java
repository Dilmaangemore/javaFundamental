package PROBLEM.numberSystem;

public class divisibleof2and3 {

	// write a progam to display num beteen 1 to 25 which are divisible by 2 & 3
	public static void main(String [] args) {
		for(int i=1; i<=25; i++) {
			if(i%2==0&&i%3==0) {
				System.out.println(i);
			}
		}
	}
}
