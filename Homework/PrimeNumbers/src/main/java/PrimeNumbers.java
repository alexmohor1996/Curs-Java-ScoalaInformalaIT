import java.util.*;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please choose your number");
        int mynumber = number.nextInt();
        int num=0;
        String primNumbers = " ";

        for (int i=0; i<=mynumber; i++)
        {
            int increase=0;
            for (num=i; num>=1; num--)
            {
                if (i%num==0)
                {
                    increase += 1;
                }
            }

            if (increase == 2)
            {
                primNumbers += i + " ";
            }
        }

        System.out.println("Prime numbers below " + mynumber + " are:");
        System.out.println(primNumbers);

    }

}