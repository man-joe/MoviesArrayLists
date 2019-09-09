/*
Create an application which will prompt the user to enter the name of their favorite Movie.
Add the Movie to an array list.  Use a loop to continue adding movies to the array until the user presses q or Q.

Once the user presses Q then print the list of movies before exiting the program.

HINT: You can use the .toLowerCase() method of the String class to convert the 'Q' to 'q'. So if your response is
stored in a variable called userAnswer then userAnswer.toLowerCase() will evaluate to a 'q'. Alternatively, you
can use the userAnswer.equalsIgnoreCase("q") method.

BONUS: Print out the list of movies sorted in alphabetical order.

BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MoviesArrayLists {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        Random rand = new Random();

        //Grab String movies from user
        while(true){
            System.out.print("Enter a Movie to add to collection (q to exit): ");
            input = sc.next();
            if(input.equalsIgnoreCase("Q"))
                break;
            else
                movies.add(input);
        }

        // Print list
        for(String s : movies)
            System.out.println(s);

        // Print list in alphabetical order
        System.out.println("Sorting List...");
        Collections.sort(movies);
        for(String s : movies)
            System.out.println(s);

        // Select random movie for user to watch
        System.out.println("You should try: " + movies.get(rand.nextInt(movies.size()-1)));
    }
}
