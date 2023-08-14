package org.example;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = (int) service.calcBonus(5000, true);
        System.out.print(bonus);
    }

}