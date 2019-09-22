import java.util.Scanner;
import java.lang.Math;

public class Suggs_p2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double weight;
		int feet;
		int inches;

		System.out.print("\nEnter Body Weight(in pounds): ");
		weight = input.nextFloat();

		System.out.print("Enter Height\n");
		System.out.print("Feet: ");
		feet = input.nextInt();
		System.out.print("Inches: ");
		inches = input.nextInt();

		double weightInKilos = weight * 0.453592;
		double heightInMeters = (((feet * 12) + inches) * .0254);
		double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);

		System.out.println("BMI is: " + bmi);

		if (bmi < 18.5 )
		{
			System.out.print("Underweight\n");
		}

		else if (bmi >= 18.5 && bmi < 25)
		{
			System.out.print("Normal\n");
		}

		else if (bmi >= 25 && bmi < 30)
		{
			System.out.print("Overweight\n");
		}

		else if (bmi >= 30)
		{
			System.out.print("Obese\n");
		}

		input.close();

	}

}