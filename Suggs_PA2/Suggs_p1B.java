import java.util.Scanner;

public class Suggs_p1B
{
	public static void main(String[] args)
	{
		getnum();
	}  

	public static int getnum()
	{
		int fourD = 0, stringSize = 0;
		String fourDs;
		Scanner kb = new Scanner(System.in);

		while (stringSize != 4)
		{
			System.out.printf("Enter a four digit number: ");
			fourDs = kb.nextLine();
			stringSize = fourDs.length();

			if (stringSize == 4)
			{ 
				fourD = Integer.parseInt(fourDs);
			}
		}
		decrypt(fourD);
		return fourD;
	}

	public static int decrypt(int num)
	{
		int a, b, c, d;

		a = num / 1000;
		b = num / 100 % 10;
		c = num / 10 % 10;
		d = num % 10;
	
		a = (a + 10 - 7)%10;
		b = (b + 10 - 7)%10;
		c = (c + 10 - 7)%10;
		d = (d + 10 - 7)%10;

		System.out.println("Decryption: " + c + d + a + b);
		return (a+b+c+d);
	}
}