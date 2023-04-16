
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Laptop Pink = new Laptop(8, 1, "Windows10", "Pink");
        Laptop Black = new Laptop(16, 3, "Windows7", "Black");
        Laptop Blue = new Laptop(32, 4, "Windows8", "Blue");
        Laptop White = new Laptop(64, 5, "Linux", "White");

        Laptop[] Laptops = new Laptop[4];
        Laptops[0] = Pink;
        Laptops[1] = Black;
        Laptops[2] = Blue;
        Laptops[3] = White;

        Filter1(Laptops);

        Filter2(Laptops);
    }

    // 3. Написать метод, который будет запрашивать у пользователя критерий (или
    // критерии) фильтрации и выведет ноутбуки,
    // отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

    static void Filter1(Laptop[] arr) {
        Map<Integer, String> criteria = new HashMap<>(Map.of(
                1, "ОЗУ",
                2, "Объём ЖД",
                3, "Операционная система",
                4, "Цвет"));
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию: \n 1 - ОЗУ \n 2 - Объём ЖД \n 3 - Операционная система \n 4 - Цвет");
        int n = sc.nextInt();
        if (criteria.containsKey(n)) {
            if (n == 1) {
                System.out.println("Введите необходимое значение критерия фильтрации:");
                int m = sc.nextInt();
                for (int index = 0; index < arr.length; index++) {
                    if (m == arr[index].RAM) {
                        System.out.println(arr[index].getInfo());
                    }
                }
            }
            if (n == 2) {
                System.out.println("Введите необходимое значение критерия фильтрации:");
                int m = sc.nextInt();
                for (int index = 0; index < arr.length; index++) {
                    if (m == arr[index].DiskSize) {
                        System.out.println(arr[index].getInfo());
                    }
                }
            }
            if (n == 3) {
                System.out.println("Введите необходимое значение критерия фильтрации:");
                String s = sc.next();
                for (int index = 0; index < arr.length; index++) {
                    if (s.equalsIgnoreCase(arr[index].OperatingSystem)) {
                        System.out.println(arr[index].getInfo());
                    }
                }
            }
            if (n == 4) {
                System.out.println("Введите необходимое значение критерия фильтрации:");
                String s = sc.next();
                for (int index = 0; index < arr.length; index++) {
                    if (s.equalsIgnoreCase(arr[index].Color)) {
                        System.out.println(arr[index].getInfo());
                    }
                }
            }
        } else {
            System.out.println("Такого критерия не существует");
        }
    }

    // Далее нужно запросить минимальные значения для указанных критериев —
    // сохранить параметры фильтрации можно также в Map.
    // Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
    // условиям.

    static void Filter2(Laptop[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальное значение ОЗУ:");
        int l = sc.nextInt();
        System.out.println("Введите минимальное значение Объёма ЖД:");
        int m = sc.nextInt();
        for (int index = 0; index < arr.length; index++) {
            if (l <= arr[index].RAM && m <= arr[index].DiskSize) {
                System.out.println(arr[index].getInfo());
            }
        }
    }

}
