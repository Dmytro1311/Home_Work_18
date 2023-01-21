import java.util.Scanner;

public class Drinks {
    public static final int coffePrice = 10;
    public static final int teaPrice = 8;
    public static final int lemonadPrice = 13;
    public static final int moxitoPrice = 15;
    public static final int waterPrice = 5;
    public static final int coca_colaPrice = 16;
    public static int totalPrice;
    public static int amoundDrink;
    Scanner scanner = new Scanner(System.in);
    public String menu(){
        return (" Є в  наявності: " + "\n" +  DrinksMachine.COFFE + "\n" +  DrinksMachine.TEA + " \n"  +   DrinksMachine.LEMONAD + "\n" +  DrinksMachine.MOXITO + "\n" +  DrinksMachine.WATER + "\n" +  DrinksMachine.COLA);
    }

    public void coffePrepare(){
        System.out.println("Вартість чашки кави  " + coffePrice + " грн" );
        System.out.println("Введіть кількість чашок кави ");
        amoundDrink = scanner.nextInt();
        totalPrice += coffePrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice );
        System.out.println( "кількість напою " + amoundDrink );
        System.out.println("Заберіть замовлення ");


    }
    public void teaPrepare(){
        System.out.println("Вартість чашки чаю  " + teaPrice + " грн" );
        System.out.println("Введіть кількість чашок чаю ");
        amoundDrink = scanner.nextInt();
        totalPrice += teaPrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );

    }
    public void lemonadePrepare(){
        System.out.println("Вартість стакану лимонаду  " + lemonadPrice + " грн" );
        System.out.println("Введіть кількість стаканів лемонаду  ");
        amoundDrink = scanner.nextInt();
        totalPrice += lemonadPrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice +  "\n" );
        System.out.println("Заберіть замовлення ");
    }
    public void moxitoPrepare(){
        System.out.println("Вартість стакану мохіто  " + moxitoPrice + " грн" );
        System.out.println("Введіть кількість стаканів мохіто ");
        amoundDrink = scanner.nextInt();
        totalPrice += moxitoPrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");

    }
    public void waterPrepare(){
        System.out.println("Вартість пляшки води " + waterPrice + " грн" );
        System.out.println("Введіть кількість пляшок води ");
        amoundDrink = scanner.nextInt();
        totalPrice += waterPrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");
    }
    public void cocaColaPrepare(){
        System.out.println("Вартість банки  коли  " + coca_colaPrice + " грн" );
        System.out.println("Введіть кількість банок коли ");
        amoundDrink = scanner.nextInt();
        totalPrice += coca_colaPrice * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");
    }


    public int totalPrice() {
        return  totalPrice;

    }
}
