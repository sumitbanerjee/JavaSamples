import java.util.Scanner;

import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Menu;
		do 
		{
			System.out.println("Please Selent an ITEM");
			System.out.println("***********************");
			System.out.println("1. Briyani");
			System.out.println("2.Hot Dog with Coke");
			System.out.println("3.WINE");
			Menu = in.nextInt();
		}
		while(Menu != 1 && Menu != 2 &&Menu != 3);
		switch (Menu)
		{
		case 1:
			//System.out.println("Briyani");
			Menu = 1;
			System.out.println("you have ordered Briyani, Total: $11.00" );
			
			break;
		case 2:
			Menu = 2;
			System.out.println("You have ordered a Hot Dog with COKE: $10.00");
			break;
		case 3:
			Menu = 3;
			System.out.println("You have ordered a Glass Of WINE:$7.00");
			break;
		default:
				System.out.println("Please visit Again");
				break;
		}
    
	}

}
