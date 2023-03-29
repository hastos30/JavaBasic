package LessonsShcoolHeillel.Lesson7;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать пустой проект в IntelliJ

        2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
        Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.


        3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
        Необходимо выяснить, является ли target (подстрока) частью строки source.
        Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
            Пример 1:
            Source: Apollo
            Target: pollo
            Result: 1

            Пример 2:
            Source: Apple
            Target: Plant
            Result: -1

        4. Создать метод stringReverse. Метод принимает в качестве параметра строку.
        Необходимо ее развернуть и вернуть измененный вариант.
            Например:
            Hello -> olleH

        5. Создать метод isPalindrome. Метод принимает в качестве параметра строку.
        Необходимо Проверить является ли переданная строка палиндромом.
        Если да, тогда вернут true, иначе false.

            Пример 1:
            ERE -> true

            Пример 2:
            Allo -> false*/

        String name = "Viktor";
        char ch = 't';
        findSymbolOccurance(name, ch);

        findWordPosition("Apollo", "pollo");
        findWordPosition("Apple", "Plant");

        System.out.println(stringReverse("Ukraine"));

        isPalindrome1("WoWa");
    }

    static void findSymbolOccurance(String str, char ch) {
        char[] charBasic = str.toCharArray();
        int coutn = 0;
        for (int i = 0; i < charBasic.length; i++) {
            if (charBasic[i] == ch) {
                coutn++;
            }
        }
        System.out.println("В строке " + str + " символ " + ch + " встречается " + coutn + " раз.");
    }

    static void findWordPosition(String source, String target) {
        System.out.println("Пример 1:");
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        System.out.println("Result: " + source.indexOf(target));
    }

    static String stringReverse(String str) {
        System.out.print(str + " -> ");
        return new StringBuffer(str).reverse().toString();
    }

    static boolean isPalindrome1(String str) {
        int a = str.length() - 1;
        int b = 0;
        while (a > b) {
            if (str.charAt(a) != str.charAt(b)) {
                System.out.println(str + " -> false");
                return false;
            }
            a--;
            b++;
        }
        System.out.println(str + " -> true");
        return true;
    }
}
