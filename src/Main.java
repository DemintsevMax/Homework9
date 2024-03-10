public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] array = {60_000, 100_000, 75_000, 15_000, 45_000,};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Task 2");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." +
                " Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Task 3");


    }

}