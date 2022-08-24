// Chapter 6 individual lab assignment
 /// Christine Grimadeau

import java.text.DecimalFormat;
import java.util.Scanner;



	public class Grosspay {

		public static void main(String[] args) {
			// TODO Auto-generated method stub


				int hours;
				double rate;
				double pay = 0;
				double total = 0;
			

			    Scanner scan = new Scanner(System.in);
			    DecimalFormat pricePattern = new DecimalFormat( "$0.00" );


			      // 1. Priming Read
					System.out.print("Enter hours (-1 to quit) : " );
				   
					hours = scan.nextInt();

			      // 2.	Test
					 while( hours != -1)

					 {
			      // 3.	Body - code to be repeated

					  	System.out.println( " Enter hourly rate: " );

					    rate = scan.nextDouble( );  // make first grade the max
                    
		             if (hours <= 40) { 
		            	 pay = hours * rate; 
		            }
		            
                     else {
                    	 pay = 40 * rate + (hours - 40) * rate * 1.5;
              
                    }
		            total += pay;
		            
		            System.out.println (" pay is  " + pricePattern.format(pay ));
		            
			      // 4.Repeat Read
					 	System.out.print("Enter hours (-1 to quit) : " );
					 	hours = scan.nextInt();
					}
					 System.out.println (" total is  " + pricePattern.format(total));
	       }


	}



