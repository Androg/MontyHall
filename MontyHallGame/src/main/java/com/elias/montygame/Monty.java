package com.elias.montygame;

import java.util.Random;

public class Monty
{
	Random regen = new Random();
	int tests = 1000000;
	int wins = 0;

	public static void main(String[] args)
	{
		Monty a = new Monty();
		a.firstTest();
		a.secondTest();

	}

	// Testing win rate by not switching box
	public int firstTest()
	{
		for (int i = 1; i <= tests; i++)
		{
			int box1 = regen.nextInt(3);
			int box2 = regen.nextInt(3);

			if (box2 == box1)
				wins++;
		}

		return wins;
	}

	// Testing win rate by switching box
	public int secondTest()
	{
		wins = 0;
		for (int i = 1; i <= tests; i++)
		{
			int box1 = regen.nextInt(3);
			int box2 = regen.nextInt(3);

			int box3 = box1;
			while (box3 == box1 ||
					box3 == box2)
			{
				box3 = regen.nextInt(3);
			}

			int box4 = 3 - (box2 + box3);

			if (box4 == box1)
				wins++;
		}
		return wins;

	}
}