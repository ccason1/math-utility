package conlan.math;

import java.util.ArrayList;

public class Factors 
{
	public static ArrayList<Couple> getFactors(int num)
	{
		ArrayList<Couple> factors = new ArrayList<>();
		
		for (int i = num-1; i >= Math.sqrt(num); i--)
		{
			for (int k = 2; k <= Math.sqrt(num); k++)
			{
				if (i * k == num)
				{
					factors.add(new Couple(i, k));	
				}
			}
		}
		
		return factors;
	}
}
