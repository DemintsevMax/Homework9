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
        int average = sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);

        }


    }

}

