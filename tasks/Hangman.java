import java.util.Scanner;

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

    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        System.out.println("You have to guess the animal name with given words.");
        int miss = 0;
        int wordIndex = randomWord();
        String[] wordHidden = new String[words[wordIndex].length()];
        System.out.println(gallows[0]);
        for(int i =  0; i < words[wordIndex].length();i++){
            wordHidden[i]="_";
        }
        int r = -1, c= 0;
        Scanner sc = new Scanner(System.in);
        printBoard(wordHidden);
        while(miss<6){
            System.out.println("\n\n Guess the letter: ");
            String l = sc.nextLine();
            r = checkWord(wordHidden,l,words[wordIndex]);
            if(r==-1){
                System.out.println("The letter "+l+" is not present.");
                miss+=1;
                printHangMan(miss);
                }
            else{
                c+=1;
            }
            printBoard(wordHidden);
            if(c == wordHidden.length){
                break;
            }
        }
        if(miss== 6){
            System.out.println("You lose!");
            System.out.println(words[wordIndex]+" is the hidden animal name. ");
        }
        else{
            System.out.println("Congratulations You guessed the hidden word.");
        }
    }

    public static void printHangMan(int miss){
        System.out.println(gallows[miss]);
    }
    public static int randomWord(){
        int index = (int)(Math.random()*65);
        return index;
    }
    public static void printBoard(String[] word){
        for(int i = 0; i < word.length;i++){
        System.out.print(word[i]+" ");
    }
    }
    public static int checkWord(String[] word,String x,String s){
        for(int i =0;i<word.length;i++){
            if( s.charAt(i)==x.charAt(0)){
                word[i]=x;
                return 1;                
            }
        }
        return -1;
    }
}





