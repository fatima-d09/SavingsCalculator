/*
Fatima Dembele
NetID = 32107296/fdembele@u.rochester.edu
Lab Number = 13
Lab Date = 09/14/2022
Lab Section = 13
Lab day = Monday/Wednesday
Lab time = 2:00-3:15pm
Project = 1
*/
import java.util.Scanner;
public class SavingsProject {

	public static void main(String[] args) {
		System.out.println("Enter intial deposit, monthly deposit, interest rate, compunding frequency, year :");
		Scanner sc = new Scanner(System.in);
		double ideposit = sc.nextDouble();
		double mdeposit = sc.nextDouble();
		double interest = sc.nextDouble();
		String freq = sc.next();
		int year = sc.nextInt();
		 //Amount at the end: A = P(1+r/n)^n*t
		
		System.out.printf("Simulating $%,.2f plus $%,.2f per month at %.2f%% APY compunded %s for %d years\n", ideposit, mdeposit, interest, freq, year);
		
		int perIods = year;
		if (freq.equals("monthly"))	
			perIods = perIods*12;
		else if (freq.equals("daily"))	
			perIods = perIods*360;
		
		double Sum = ideposit;
			for (int period = 1; period <= perIods; period++) {
				if (freq.equals("monthly")) {
					Sum += mdeposit;
					double inte = 1+(interest/100)/12;
					
					Sum = Sum * inte;
					
					if (period%12==0) {
						double totalContribution = ideposit + mdeposit*period;
						double accruedInterest = Sum - totalContribution;
						System.out.printf("Year %d ending balance is $%,.2f with $%,.2f from interest\n", (period/12),Sum,accruedInterest);
					}
				}
				else if (freq.equals("yearly")) {
					Sum += mdeposit*12;
					double Apy = 1+(interest/100);
					Sum = Apy * Sum;
					double totalContribution = ideposit + mdeposit*period*12;
					double accruedInterest = Sum - totalContribution;
					System.out.printf("Year %d ending balance is $%,.2f with $%,.2f from interest\n",period,Sum,accruedInterest);
			}
				else if (freq.equals("daily")){
					if(period%30==1) 
						Sum += mdeposit;
					double inte = 1+ (interest/100/360);
					Sum = Sum * inte;
					if(period%360==0) {
						double totalContribution = ideposit + mdeposit*period/30;
						double accruedInterest = Sum - totalContribution;
						System.out.printf("Year %d ending balance is $%,.2f with $%,.2f from interest\n", (period/360),Sum,accruedInterest);
					}
				}
				else {
					break;
				}
		
			
		} 
			
			
	
	}

}
	

