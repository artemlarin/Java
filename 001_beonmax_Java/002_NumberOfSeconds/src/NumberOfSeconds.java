public class NumberOfSeconds {
    public static void main(String[] args) {
        int totalSeconds = 4029; // общее количество секунд
        int day = totalSeconds / 3600 / 24; // количество дней
        int hours = totalSeconds / 3600 % 24; // количество часов
        int minutes = totalSeconds % 3600 / 60; // количество минут
        int seconds = totalSeconds % 3600 % 60; // коилчество секунд

        System.out.println("Дней: " + day);
        System.out.println("Часов: " + hours / 10 + hours % 10);
        System.out.println("Минут: " + minutes / 10 + minutes % 10);
        System.out.println("Секунд: " + seconds / 10 + seconds % 10);
    }
}
