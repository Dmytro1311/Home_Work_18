import java.util.Scanner;

public class Drinks {
    public static final int coffePrice = 10;
    public static final int teaPrice = 8;
    public static final int lemonadPrice = 13;
    public static final int moxitoPrice = 15;
    public static final int waterPrice = 5;
    public static final int coca_colaPrice = 16;
    public static int totalPrice;
    Scanner scanner = new Scanner(System.in);
    public String menu(){
        return (" Є в  наявності: " + "\n" +  DrinksMachine.COFFE + "\n" +  DrinksMachine.TEA + " \n"  +   DrinksMachine.LEMONAD + "\n" +  DrinksMachine.MOXITO + "\n" +  DrinksMachine.WATER + "\n" +  DrinksMachine.COLA);
    }

    public void coffePrepare(){
        System.out.println("Вартість чашки кави  " + coffePrice + " грн" );
        System.out.println("Введіть кількість чашок кави ");
        totalPrice = coffePrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice+  "\n" + "кількість напою " + scanner.nextInt());
        System.out.println("Заберіть замовлення ");


    }
    public void teaPrepare(){
        System.out.println("Вартість чашки чаю  " + teaPrice + " грн" );
        System.out.println("Введіть кількість чашок чаю ");
        totalPrice += teaPrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice+  "\n" + "кількість напою " + scanner.nextInt());

    }
    public void lemonadePrepare(){
        System.out.println("Вартість стакану лимонаду  " + lemonadPrice + " грн" );
        System.out.println("Введіть кількість стаканів лемонаду  ");
        totalPrice += lemonadPrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice +  "\n" + "кількість напою " + scanner.nextInt());
        System.out.println("Заберіть замовлення ");
    }
    public void moxitoPrepare(){
        System.out.println("Вартість стакану мохіто  " + moxitoPrice + " грн" );
        System.out.println("Введіть кількість стаканів мохіто ");
        totalPrice += moxitoPrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice+  "\n" + "кількість напою " + scanner.nextInt());
        System.out.println("Заберіть замовлення ");

    }
    public void waterPrepare(){
        System.out.println("Вартість пляшки води " + waterPrice + " грн" );
        System.out.println("Введіть кількість пляшок води ");
        totalPrice += waterPrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice+  "\n" + "кількість напою " + scanner.nextInt());
        System.out.println("Заберіть замовлення ");
    }
    public void cocaColaPrepare(){
        System.out.println("Вартість банки  коли  " + coca_colaPrice + " грн" );
        System.out.println("Введіть кількість банок коли ");
        totalPrice += coca_colaPrice * scanner.nextInt();
        System.out.println("Сумма замовлення " + totalPrice+  "\n" + "кількість напою " + scanner.nextInt());
        System.out.println("Заберіть замовлення ");
    }




}
