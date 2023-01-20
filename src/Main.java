import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        boolean oneMore = true;
        while (oneMore) {
            System.out.println("Меню: " + drinks.menu());
            System.out.println("Введіть назву напою");
            String drinksChoice = scanner.next();
            drinksChoice = drinksChoice.toUpperCase();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(drinksChoice);
            switch (drinksMachine) {
                case COFFE:
                    System.out.println(" Ви вибрали каву ");
                    drinks.coffePrepare();
                    break;
                case TEA:
                    System.out.println(" Ви вибрали чай ");
                    drinks.teaPrepare();
                    break;
                case LEMONAD:
                    System.out.println(" Ви вибрали лемонад ");
                    drinks.lemonadePrepare();
                    break;
                case MOXITO:
                    System.out.println(" Ви вибрали мохіто ");
                    drinks.moxitoPrepare();
                    break;
                case WATER:
                    System.out.println("Ви вибрали воду ");
                    drinks.waterPrepare();
                    break;
                case COLA:
                    System.out.println(" Ви вибрали Coca_Cola ");
                    drinks.cocaColaPrepare();
                    break;
                default:
                    System.out.println("Такого напою немає. \n Виберіть з наявних : " + drinks.menu());
            }


            System.out.println("Бажаєте чогось ще? \n ведіть YES/NO");
            boolean drinkMore = true;
            String answer = scanner.next();
            answer = answer.toUpperCase();
            while (drinkMore) {
                if (answer.equals("NO")) {
                    drinkMore = false;
                    oneMore = false;
                } else if (answer.equals("YES")) {
                    drinkMore = false;
                } else {
                    System.out.println("Введіть: Yes/NO");
                }

            }

        }



    }
}