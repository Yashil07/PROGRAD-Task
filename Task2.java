/*
You need to write the software to calculate the minimum number of
coins required to return an amount of change to a user of Acme
Vending machines. For example, the vending machine has coins 1,2,5
and 10 what is the minimum number of coins required to make up the
change of 43 cents?
*/

//-------------Task-2-------------//

import java.io.*;
public class Task2
{
	static int minCoins(int coins[], int m, int V)
	{
	if (V == 0) return 0;
	int res = Integer.MAX_VALUE;
	for (int i=0; i<m; i++)
	{
		if (coins[i] <= V)
		{
			int sub_res = minCoins(coins, m, V-coins[i]);
			if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
				res = sub_res + 1;
		}
	}
	return res;
	}
	public static void main(String args[])
	{
	int coins[] = {1, 2, 5, 10};
	int m = coins.length;
	int V = 43;
	System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
	}
}

