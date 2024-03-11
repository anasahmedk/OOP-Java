package za.com.dvt.oop.abstraction.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(sc.nextLine());
        ArrayList<Buyer> buyers = new ArrayList<>();
        Map<String, Buyer> buyerMap = new HashMap<>();

        while (numOfPeople-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            Buyer buyer = createBuyer(tokens);
            buyers.add(buyer);
            buyerMap.put(tokens[0], buyer);
        }

        String name = sc.nextLine();
        while (!name.equals("End")) {
            Buyer buyer = buyerMap.get(name);
            if (buyer != null) {
                buyer.buyFood();
            }
            name = sc.nextLine();
        }

        int totalFood = 0;
        for (Buyer buyer : buyers) {
            totalFood += buyer.getFood();
        }
        System.out.println(totalFood);
    }

    private static Buyer createBuyer(String[] tokens) {
        if (tokens.length == 4) {
            return new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
        }
        return new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
