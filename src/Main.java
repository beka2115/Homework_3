import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        double[] num = {-12.3, 32.4, 22.5, -64.32, -23.55, 54.45, -34.432,
                -34.54, 2345.54, 33.33, 334.32, -34.32, 98.88, -54.78, 54.56};
        double arif = 0;
        for (double box : num) {
            if (box < 0) {
                continue;
            }
            arif += box;
        }
        int quantity = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                quantity++;
            }
        }
        System.out.println("Количество положительных чисел: " + quantity);
        System.out.println("Сумма всех положительных чисел: " + arif);
        System.out.println("Среднее арифметическое положительных чисел: "
                + (arif / quantity));


        //ДЗ НА СООБРАЗИТЕЛЬНОСТЬ

     

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    double temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(num));
        }



    }



        }

