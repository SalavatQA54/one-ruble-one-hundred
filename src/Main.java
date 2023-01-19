public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishmentAmount = 1001;
        int fix = 100;

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / fix);
        } else {
            bonus = 0;
        }
        System.out.println("Начисленный бонус - " + bonus + "руб.");
        System.out.println("Итоговый баланс - " + (balance + replenishmentAmount + bonus) + " руб.");



        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
