import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String[] args) {
        //Random Number Generation

        //Approach Number 1
        Random random=new Random();
        int rnum=random.nextInt(10); // it would generate random number inbetween 0 to 9
        System.out.println(rnum);

        //Approach Number 2
        System.out.println(Math.random()); // it generate the number inbetween 0.0 to 1.0

        //Approach Number 3
//        String rnumber =RandomStringUtils.randomalphabetic(10);
//        System.out.println(rnumber);
   }
}
