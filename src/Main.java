public class Main {
    public static void main(String[] args) {
        int initialAccout = 300;
        int addend = 500;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalAccount = initialAccout + addend + bonus;
        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}
