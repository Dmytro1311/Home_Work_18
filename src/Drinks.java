import java.util.Scanner;

public class Drinks {
    public static final int coffePrice = 10;
    public static final int teaPrice = 8;
    public static final int lemonadPrice = 13;
    public static final int moxitoPrice = 15;
    public static final int waterPrice = 5;
    public static final int coca_colaPrice = 16;
    Scanner scanner = new Scanner(System.in);
    public String menu(){
        return (" Є в  наявності: " + "\n" +  DrinksMachine.COFFE + "\n" +  DrinksMachine.TEA + " \n"  +   DrinksMachine.LEMONAD + "\n" +  DrinksMachine.MOXITO + "\n" +  DrinksMachine.WATER + "\n" +  DrinksMachine.COCA_COLA );
    }

    public int coffePrepare(){
        System.out.println("Вартість чашки кави  " + coffePrice + "грн" );
        System.out.println("Введіть кількість чашок кави ");
        return scanner.nextInt();
    }
    public int teaPrepare(){
        System.out.println("Вартість чашки чаю  " + teaPrice + "грн" );
        System.out.println("Введіть кількість чашок чаю ");
        return scanner.nextInt();
    }
    public int lemonadePrepare(){
        System.out.println("Вартість стакану лимонаду  " + lemonadPrice + "грн" );
        System.out.println("Введіть кількість стаканів лемонаду ");
        return scanner.nextInt();
    }

}
