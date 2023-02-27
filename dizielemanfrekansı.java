package HarmonikOrt;

import java.util.Arrays;


public class dizielemanfrekansı {

    static boolean isRepeat(int[] arr, int value) {
        for (int x : arr) {
            if (x == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {-1, 9, 7, -10, 20, 10, 9, 8, 7, -1};
        int[] duplicate = new int[list.length];
        Arrays.sort(list);
        int start = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (isRepeat(duplicate, list[i])) {
                        duplicate[start++] = list[i];
                    }

                }
            }
        }
        int sayac = 0, tempsayac = 0;
        for (int x : duplicate) {
            for (int a = 0; a < list.length; a++) {
                if (x == list[a]) {
                    sayac++;
                    tempsayac = sayac;
                }
            }
            sayac = 0;

            if (x != 0) {
                System.out.println(x + "    sayısı  " + tempsayac + "   kez tekrar ediyor.");

            }

        }

        System.out.println("Diğer Sayılar 1 kez tekrar ediyor.");

        System.out.println(Arrays.toString(list));
    }


}







