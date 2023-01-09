public class Main {
    public static void main(String[] args) {
        int bill = 450;
        int refill = 25000;
        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;

        }
        bill = bill + refill + bonus;


        System.out.println("Клиент пополнил счет на " + refill + "." + " Бонусов: " + bonus + ". Остаток на счету: " + bill);

    }
}