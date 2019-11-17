package war_game;

import java.util.Arrays;
import java.util.Scanner;

public class CardsWar {

	public static void main(String[] args) {
		int[][] deck = new int[4][13];
		int[] p1Cards = new int[26];
		int[] p2Cards = new int[26];

		int p1Score = 0;
		int p2Score = 0;

		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				deck[i][j] = j + 1;
			}
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.println(Arrays.toString(deck[i]));
		}

		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				int lineIndex = (int) (Math.random() * deck.length);
				int colIndex = (int) (Math.random() * deck[i].length);

				int temp = deck[lineIndex][colIndex];
				deck[lineIndex][colIndex] = deck[i][j];
				deck[i][j] = temp;
			}
		}

		System.out.println("--------------------------------\nshuffling");
		for (int i = 0; i < deck.length; i++) {
			System.out.println(Arrays.toString(deck[i]));
		}

		int index = 0;
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				if (index % 2 == 0) {
					p1Cards[index / 2] = deck[i][j];
				} else {
					p2Cards[(index - 1) / 2] = deck[i][j];
				}
				index++;
			}
		}

		System.out.println("--------------------------------\ndealing");
		System.out.println(Arrays.toString(p1Cards));
		System.out.println(Arrays.toString(p2Cards));

		for (int i = 0; i < p2Cards.length; i++) {
			if (p1Cards[i] > p2Cards[i]) {
				p1Score++;
			} else if (p2Cards[i] > p1Cards[i]) {
				p2Score++;
			} else {
				int sameNumberCounter = 2;
				while (p1Cards[i] == p2Cards[i]) {
					if (p1Cards[i] > p2Cards[i]) {
						p1Score++;
					} else if (p2Cards[i] > p1Cards[i]) {
						p2Score += sameNumberCounter;
					}
					i++;
					sameNumberCounter++;
				}
			}
		}
		Scanner input = new Scanner(System.in);
		System.out.print("The name of player1:");
		String p1Name = input.nextLine();
		System.out.print("The name of player2:");
		String p2Name = input.nextLine();
		input.close();

		if (p1Score > p2Score) {
			System.out.println(p1Name + " " + p1Score);
		} else if (p2Score > p1Score) {
			System.out.println(p2Name + " " + p2Score);
		} else {
			System.out.println("DRAW");
		}
	}

}
