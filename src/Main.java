public class Main {
    public static void main(String[] args) {
        int startingScore = 100; // начальный счет
        int replenishment = 2000; // сумма пополнения

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}