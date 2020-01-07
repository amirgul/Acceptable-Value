import java.util.Scanner;

public class AcceptableValues
{
    Scanner keybaord = new Scanner(System.in);
    private double minimumAcceptedValue;
    private double maximumAcceptedValue;
    private double value;
    private String response;

    public void getValue()
    {
        System.out.println("Enter the max value");
        maximumAcceptedValue = keybaord.nextDouble();
        System.out.println("Enter the min value");
        minimumAcceptedValue = keybaord.nextDouble();
        System.out.println("Now enter a value");
        value = keybaord.nextDouble();
        while ((value >= maximumAcceptedValue) || (value <= minimumAcceptedValue))
        {
            System.out.println("you entered the value in wrong range");
            System.out.println("please enter the correct value");
            System.out.println("max range: " + maximumAcceptedValue + " min range: " + minimumAcceptedValue);
            value = keybaord.nextDouble();
        }
        System.out.println("you entered the value: " + value);


    }

}
