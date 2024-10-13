package textbook.unit9;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        ArrayList<Contestant> contestants = new ArrayList<>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the contestants name: ");
            String name = input.readLine();

            int[] votes = new int[4];
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter your vote: ");
                String res = input.readLine();
                if (res.equalsIgnoreCase("yes") || res.equalsIgnoreCase("y")) votes[j] = 1;
                else if (res.equalsIgnoreCase("no") || res.equalsIgnoreCase("n")) votes[j] = 0;
                else {
                    System.out.println("Invalid Response");
                    j--;
                }
            }

            contestants.add(new Contestant(name, votes));
            System.out.println();
        }

        contestants.forEach(contestant -> {
            int yeses = 0;
            for (int vote : contestant.getVotes()) {
                if (vote == 1) yeses++;
            }
            if (yeses >= 2) System.out.println("Well done " + contestant.getName() + ", you have " + yeses + "yes votes and are through the next round!");
            else System.out.println("Too bad" + contestant.getName() + ", you have " + yeses + "yes votes and are NOT through the next round");
        });
    }
}

@Getter
@Setter
class Contestant {

    private String name;
    private int[] votes;

    public Contestant(String name, int[] votes) {
        this.name = name;
        this.votes = votes;
    }
}