import java.util.Scanner;
public class DadJokes {
    public static void main(String[] args) {

        // --- Create Scanner Object
        Scanner input = new Scanner(System.in);

        // --- Declare an array called dadJokes and populate it
        String[] dadJokes = new String[20];
        dadJokes[0] = " Have you heard about the restaurant on the moon? The food is great but there's no atmosphere.";
        dadJokes[1] = "Did you hear about the two antennas that got married? The ceremony was terrible but the reception was amazing.";
        dadJokes[2] = "A baby seal walking into a club... Ouch.";
        dadJokes[3] = "What do you do when you see a space man? You park your car, man!";
        dadJokes[4] = "What do you call a fish with no eyes? A fish.";
        dadJokes[5] = "What do you get when you throw a hand grenade into a French bathroom? Linoleum blown apart.";
        dadJokes[6] = "What did the shy pebble wish for? That she was a little boulder.";
        dadJokes[7] = "When I found out my toaster wasn't waterproof... I was shocked!";
        dadJokes[8] = "My grandpa had a the heart of a lion... And a life time ban from the Zoo.";
        dadJokes[9] = "Which side of the chicken has more feathers? The outside.";
        dadJokes[10] = "What do you call a fake noodle? An impasta!";
        dadJokes[11] = "What do you get when you drop a piano down a mine shaft? A flat miner.";
        dadJokes[12] = "Why did the tomato blush? Because it saw the salad dressing.";
        dadJokes[13] = "Why do chicken coops only ever have two doors? If they had four doors, they would be a chicken sedan!";
        dadJokes[14] = "What are the strongest days of the week? Saturday and Sunday. All the rest are weak-days.";
        dadJokes[15] = "What do you call a five foot psychic that's escaped from jail? A small medium at large.";
        dadJokes[16] = "If the mushroom was such a fun guy why didn't they have the party at his house? There wasn't much-room.";
        dadJokes[17] = "Never trust an atom... They make up everything!";
        dadJokes[18] = "Why do seagulls live by the sea? Cause if they lived by the bay, they'd be bagels.";
        dadJokes[19] = "What is Beethoven's favorite fruit? Ba-na-na-nas.";

        // --- Define a numeric variable
        int totalJokes = dadJokes.length;

        // -- Display output to the user
        System.out.println("D A D  J O K E S");
        System.out.println(". . . . . . . . . . . .");
        System.out.println("Total Jokes: " + totalJokes);
        System.out.println(". . . . . . . . . . . .");

        // -- boolean for yes/no statement; line 56
        boolean jokes = true; while(jokes==true) {

            // -- Display four Dad Jokes with Math.random() method
            for (int i = 0; i < 4; i++) {
                int randomJoke = (int) ((Math.random() * 20));
                System.out.println("\n|| " + dadJokes[randomJoke]);
            } //end Math.random()

            // --- Ask user if they want more jokes.
            System.out.println("\nWould you like to see more Dad Jokes?");

            // -- Get input from user
            String answer = input.next();

            // --- If user says yes, display more jokes. If user says no, display goodbye message
            if(answer.equals("Yes")){
                jokes = true;
            } else {
                jokes = false;
                System.out.println("Catch ya later alligator. ;)");
            } // end if statement



        } // end while statement
    } //end main

} //end class
