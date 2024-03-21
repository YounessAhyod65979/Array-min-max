import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] element = new int[10];


        for (int i = 0; i < element.length; i++)
        {

            element[i] = rand.nextInt(100) + 1;

        }

        int smallest = element[0];

        int largest = element[0];


        for (int number : element)
        {
            if (number < smallest)
            {
                smallest = number;
            }
            
            if (number > largest)
            {
                largest = number;
            }
        }


        System.out.print("elements generated: ");
        System.out.println();

        for (int number : element)
        {

            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Smallest element: " + smallest);

        System.out.println("Largest element: " + largest);
    }
}
