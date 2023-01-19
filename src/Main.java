import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        String drinksChoice = scanner.next();
         drinksChoice = drinksChoice.toUpperCase();
         DrinksMachine drinksMachine = DrinksMachine.valueOf(drinksChoice);
         switch (drinksMachine){
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
                 break;
             case WATER:
                 System.out.println("Ви вибрали воду ");
                 break;
             case COCA_COLA:
                 System.out.println(" Ви вибрали Coca_Cola ");
                 break;
             default:
                 System.out.println("Такого напою немає. \n Виберіть з наявних : " + drinksMachine.menu() );

         }




    }
}