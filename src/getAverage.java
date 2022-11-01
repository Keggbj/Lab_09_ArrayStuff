import java.util.Random;
import java.util.Scanner;

public class getAverage {
    public static double getAverage(int values[]) {
        int[] datapoint = new int[100];
        double ave = 0;
        int sum = 0;
        double getAveragedataPoints = sum / datapoint.length;
        for (int i = 0; i < datapoint.length; i++)
        System.out.println("\nThe sum of values is " + sum);
        ave = (double) sum / datapoint.length;
        System.out.printf("Ave is %5.2f", ave);
        System.out.println("Average of dataPoints is: " + getAveragedataPoints);

        return ave;
    }

    public static void main(String[] args) {
        Random gen = new Random();

        int[] datapoint = new int[100];

        for (int i = 0; i < datapoint.length; i++) {
            datapoint[i] = gen.nextInt(100) + 1; // set all to 1 to 100
        }

        for (int i = 0; i < datapoint.length; i++)
            System.out.printf("%4d", datapoint[i]);

        System.out.println("/n");

        for (int i = 0; i < datapoint.length; i++)
            System.out.printf(" | " + datapoint[i]);

        System.out.println("/n");

        int sum = 0;
        double ave = 0;
        for (int i = 0; i < datapoint.length; i++)
            sum += datapoint[i];

        System.out.println("\nThe sum of values is " + sum);
        ave = (double) sum / datapoint.length;
        System.out.printf("Ave is %5.2f", ave);
        System.out.println(" The average of the random array dataPoints is: " + sum / datapoint.length);

        Scanner console = new Scanner(System.in);

        int number = 0;

        number = Safeinput.getRangedInt(console, "Value: ", 1, 100);

        boolean found = false;
        for (int i = 0; i < datapoint.length; i++) {
            if (datapoint[i] == number) {
                System.out.println("Found at " + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("Value is not in the array!");

        found = false;
        for (int i = 0; i < datapoint.length; i++) {
            if (datapoint[i] == number) {
                System.out.println("Find First Found at " + i);
                found = true;
                break;

            }
        }
        int min = datapoint[0];
        int max = datapoint[0];

        for (int i = 0; i < datapoint.length; i++) {
            if (datapoint[i] < min) // NEW MIN!
                min = datapoint[i]; //so saves it
            if (datapoint[i] > max) // NEW MAX!
                max = datapoint[i]; //so saves it
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);


    }
}