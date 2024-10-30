package org.atm;
import java.util.*;

public class AtmProject {
	public static void main(String[]args) {
		int password=1234;
		int balance=10000;
		int CreditAmount=0;
		int DebitAmount=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the pin:");
		int pin=s.nextInt();
		System.out.println(pin);
		if(password==pin) {
			System.out.println("Enter the name:");
			String Name=s.next();
			System.out.println("Wlecome!"+Name);
			
			while(true) {
				System.out.println("press 1 for to know the balance");
				System.out.println("press 2 for to credit the amout");
				System.out.println("press 3 for to debit the amount");
				System.out.println("press 4 for to get the receipt");
				System.out.println("Press the key:");
				int opt=s.nextInt();
				System.out.println(opt);
				switch (opt) {
				case 1:
					System.out.println("Current Balance:"+balance);
					break;
				
				case 2:
					System.out.println("Credit Amount:");
					CreditAmount = s.nextInt();
					System.out.println(CreditAmount);
					System.out.println("Successfully Credited");
					balance=balance+CreditAmount;
					break;
						
				
				case 3:
					System.out.println("Debit Amount:");
					DebitAmount = s.nextInt();
					System.out.println(DebitAmount);
					if(DebitAmount>balance){
						System.out.println("Insufficient balance");
						
					}else {
					System.out.println("Successfully debited");
					}
					balance=balance-DebitAmount;
					break;
				
				case 4:
				System.out.println("Welcome to SBI ATM");
				System.out.println("Account Balance:"+balance);
				System.out.println("Amount credited:"+CreditAmount);
				System.out.println("Amount deited:"+DebitAmount);
				break;
					
				
				default:
					   System.out.println("Invalid option. Please try again.");
	
				}
				
				
			}
			}else {
				System.out.println("Sorry,Wrong Pin!");
				System.out.println("try it again");
		}
		
		
		
		
	}

}
