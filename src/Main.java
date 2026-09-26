//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class weddingMeal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Variable Declarations
        String weddingMeal = "";

        // input values from the user
        System.out.print("What is your meal choice, Chicken Parmesan, Roast Salmon, or Butternut Squash - Please enter C, F, or V: ");

        weddingMeal = in.nextLine();

        // process them
        if (weddingMeal.equals("C"))
        {
            System.out.println("You get the Chicken Parmesan.");
        }
        else if (weddingMeal.equals("F"))
        {
            System.out.println("You get the Roast Salmon.");
        }
        else if (weddingMeal.equals("V"))
        {
            System.out.println("You get the Butternut Squash.");
        }
        else
        {
            System.out.println("Please enter C, F, or V only: " + weddingMeal);
        }
    }