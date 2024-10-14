package tech.lpdev.textbook.ch6;


import math.MathUtil;

public class Ex14 {

    public static void main(String[] args) {
        int dice1, dice2;

        System.out.println("Dice 1 Dice 2 Total");
        for (int i = 0; i < 5; i++) {
            dice1 = MathUtil.random(1, 6);
            dice2 = MathUtil.random(1, 6);
            System.out.printf("%6s %6s %5s\n", dice1, dice2, (dice1 + dice2));
        }
    }
}
