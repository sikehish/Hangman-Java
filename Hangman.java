import java.lang.*;
import java.util.Scanner;
// import java.util.Arrays;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    static void printMissedGuesses(char arr[], int count){
        if(arr!=null && count>0){
            for(int i=0;i<count; i++){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int ind=(int)(Math.floor(Math.random()*(words.length)));
        String word=words[ind];
        System.out.println("Welcome to Java Hangman!\n");
        String ans= "_ ".repeat(word.length());
        char prev=' ';
        int count=0;
        int chances=gallows.length;
        char misses[]=new char[10];
    
        while(count < chances){
        char guess=prev;
        System.out.println("Guess: " + guess);
        System.out.println(gallows[count]);
        System.out.println("Word: " + ans);

        System.out.print("Misses: ");
        printMissedGuesses(misses, count);

        System.out.print("Guess: ");
        prev=scan.next().charAt(0);
        System.out.println("\n\n");
        if(word.contains(Character.toString(prev))){
            int charInd=word.indexOf(Character.toString(prev));
        } else{
            misses[count++]=prev;
        } 
        
    }

    if(count==chances){
        System.out.println("Tough Luck. Try Again!");
        System.out.println("The word is " + word);

    }
    
    scan.close();
}

}





