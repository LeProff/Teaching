package tech.lpdev.textbook.ch7;


import math.MathUtil;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int stones = random.nextInt(15, 31);
        boolean playerWins = false;

        while (stones != 0) {
            while (true) {
                System.out.print("There are " + stones + " stones. How many would you like? ");
                int res = input.nextInt();

                if (isValidEntry(stones, res)) {
                    stones -= res;
                    break;
                }
            }

            if (stones == 0) {
                playerWins = true;
                break;
            }

            int comp = drawStones(stones);
            System.out.println("There are " + stones + " stones. Computer takes " + comp + " stones");
            stones -= comp;
        }
        if (playerWins) System.out.println("Player wins!");
        else System.out.println("Computer wins!");
    }

    private static boolean isValidEntry(int stones, int move) {
        if (move > 3) {
            System.out.println(move + " is to large.");
            return false;
        }
        if (move < 1) {
            System.out.println(move + " is to small.");
            return false;
        }
        if (move > stones) {
            System.out.println("There are only " + stones + " stones left.");
            return false;
        }
        return true;
    }

    private static int drawStones(int stones) {
        Random random = new Random();
        if (stones >= 3) return random.nextInt(3) + 1;
        else return MathUtil.random(1, stones);
    }
}
