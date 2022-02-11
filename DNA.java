import java.util.Scanner;

public class DNA{
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your DNA sequence!");
        String userString = (userInput.nextLine()).toUpperCase();
        String targettedString = "GTC";
        String infectionChance = "";
        
        int frequency = count(userString,targettedString); 

        if(frequency>10){
            infectionChance = "; infection chance is high";
        }
        System.out.println("sequence GTC appeared " + frequency + " times " + infectionChance);

        userInput.close();
    }
    
    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length())/target.length();
    }
}
