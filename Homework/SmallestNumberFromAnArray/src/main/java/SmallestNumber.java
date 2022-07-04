public class SmallestNumber {

    public static void main(String[] args) {

        int[] numbers = {12, 125, 15, 6, 6262, 21, 646};

        for (int i=0; i<numbers.length; i++)
        {
            for (int j=i+1; j<numbers.length; j++)
            {
                int temp;
                int maxNum;
                if (numbers[i] > numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("The smallest number in this array is: " + numbers[0]);

    }

}