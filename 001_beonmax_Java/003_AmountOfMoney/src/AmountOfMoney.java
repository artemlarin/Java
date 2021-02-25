public class AmountOfMoney {
    public static void main(String[] args) {
        int money = 100;

        if (money < 100) {
            System.out.println("Доширак");
        } else if (money < 300) {
            System.out.println("Гамбургер");
        } else if (money < 500) {
            System.out.println("Шаурма");
        } else if (money > 500) {
            System.out.println("Пицца");
        }
    }
}
