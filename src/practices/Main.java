package practices; 


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] argv) { 
		Scanner reader = new Scanner(System.in);
		int n = 0;
		boolean check;
		try {
			System.out.println("Write a Number");
			n = reader.nextInt();
			if (check=canBeDividedBy3(n) == true) {
				System.out.println(n + " is divisible by 3");
			} else {
				System.out.println(n + " is not divisible by 3");
			}
			
			generateNumbers(n);
			
			for(int i=1;i<=30;i++) {
				if(i%3==0) {
					System.out.println(i + " Shack Rodriguez");
				} else {
					System.out.println(i);
				}	
			}
		} catch (Exception e){
		}
		
	}

	public static boolean canBeDividedBy3 (int n) {
		if (n%3==0)
			return true;
		return false;
	}
	public static void generateNumbers (int n){
		List<Integer> myList = new ArrayList<Integer>(n);
		for(int i=1;i<n;i++) {
			myList.add(i);
		}
		System.out.println(myList);
	}
}
