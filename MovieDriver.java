package lab3;

import java.util.Scanner; 

public class MovieDriver {

	public static void main(String[] args) {
		final String theater = "Goldshire";
		int MoreMovie = 1;
		int soldTickets = 0;
		String title = "";
		String rating = "";
		String again = "";
		
		String nope1  = new String("N");
		String nope2  = new String("n");
		
		// Create a new object of type Scanner that reads from the keyboard
		Scanner input = new Scanner(System.in); 
		
		// Create a new movie object
		Movie a = new Movie();
		
		while (MoreMovie == 1) {
			// Prompt the user to enter the title of a movie 
			System.out.println("Enter the movie's title: ");
		
			// Read in the line that the user types
			title = input.nextLine();
		
			// Set the title in the movie object
			a.setTitle(title);
		
			// Prompt the user to enter the movie's rating
			System.out.println("Enter the movie's rating: ");
		
			// Read in the line that the user types
			rating = input.nextLine();
		
			// Set the rating in the movie object
			a.setRating(rating);
		
			// Prompt the user to enter the number of tickets sold at a (unnamed) theater
			System.out.println("Enter the number of tickets sold at the "+ theater +" theater: ");
		
			// Read in the integer that the user types
			soldTickets = input.nextInt();
		
			// Set the number of tickets sold in the movie object
			a.setSoldTickets(soldTickets);
		
			// Print out the information using the movie's toString method
			String d = a.toString();
			System.out.println(d);
		
			System.out.println("\nDo you want to input another movie? Y or N");
			again = input.nextLine();
			
			if ( again.equals(nope1) || again.equals(nope2) ) { 
				MoreMovie = 0;
			}
		 
		}
		
		// close scanner
		input.close();

	}

}
