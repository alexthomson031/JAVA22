public class Main {
    public static void main(String[] args) {
        int score = 1000; // Счет на телефоне
        System.out.println("Счет на телефоне до пополнения " + score);
        int deposite = 5000; // Cумма пополнения
        System.out.println("Cумма пополнения " + deposite);
        if (deposite > 1000) {
            float bonus = (float) (deposite * 0.01); // Сумма бонусов
            System.out.println("Сумма бонусов при пополнении " + bonus);
            int fullscore = (int) (score + deposite + bonus); // Сумма на счете, вместе с бонусами
            System.out.println("Итоговая сумма на счете с бонусами " + fullscore);
        } else {
            float bonus = (float) (deposite * 0); // Сумма бонусов
            System.out.println("Сумма бонусов при пополнении " + bonus);
            int fullscore = (int) (score + deposite + bonus); // Сумма на счете, вместе с бонусами
            System.out.println("Итоговая сумма на счете с бонусами " + fullscore);
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
