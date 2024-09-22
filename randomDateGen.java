import java.util.Random;

public class randomDateGen {
    public static void main(String[] args){

        //Random object
        Random random=new Random();
        
        System.out.println("a random day and a random month a year\n");

        /*Random #  (31 and 1) */
        int day = random.nextInt(30) + 1; 
        System.out.println("Day\n" + day  + "\n");

        /*Random #  (12 and 1) */
        int month = random.nextInt(12) + 1;
        System.out.println("Month\n" + month  + "\n");

        /*Random #  (2024 and 1900) */
        int year = random.nextInt(125) + 1900;
        System.out.println("Year\n" + year + "\n");

        //just a silly if
        if (year < 1920) {
            System.out.println("you are old brother\n");
        }
            


    }
}
