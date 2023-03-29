package LessonsShcoolHeillel.Lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*  1.
        Создать пустой проект в IntelliJ
        Выбрать одну из двух задач представленных ниже.
            2. Реалзиовать "Шейкерную сортировку".
        Описание: https://uk.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F_%D0%B7%D0%BC%D1%96%D1%88%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F%D0%BC
        Концепт-анимация: https://hsto.org/webt/mp/4s/ei/mp4seici9jf_z38t4kf38oqy_4o.gif
            3. Реализовать метод arrayCopy.
            Метод должен уметь копировать значения исходного массива (source) в массив-цель (target).
            Следует учесть, что копирование в target может производиться с определенного индекса,
            поскольку он уже может быть заполнен значениями.
        Пример 1:
        Source: [1, 2, 3, 4]
        Target: []
        Result: [1, 2, 3, 4]

        Пример 2:
        Source: [1, 2, 3, 4]
        Target: [5, 6, 7]
        Result: [5, 6, 7, 1, 2, 3, 4]*/

        System.out.println("Сортировка пузырьком: ");
        int[] array = {1, 10, 9, 2, 3, 8, 7, 6, 5, 4, 1};
        System.out.println("До: \t" + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int num = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = num;
                }
            }
        }
        System.out.println("После: \t" + Arrays.toString(array));
        System.out.println();

        int[] source1 = {1, 2, 3, 4};
        int[] target1 = {};
        int[] result1 = arrayCopy(source1, target1);
        System.out.println("Result: " + Arrays.toString(result1));

        int[] source2 = {1, 2, 3, 4};
        int[] target2 = {5, 6, 7};
        int[] result2 = arrayCopy(source2, target2);
        System.out.println("Result: " + Arrays.toString(result2));

    }

    static int[] arrayCopy(int[] source, int[] target) {
        System.out.println();
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target));
        int[] result = new int[source.length + target.length];
        int count = 0;
        for (int i = 0; i < target.length; i++) {
            result[i] = target[i];
            count++;
        }
        for (int i = 0; i < source.length; i++) {
            result[count++] = source[i];
        }
        return result;
    }
}
