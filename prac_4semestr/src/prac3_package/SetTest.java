package prac3_package;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SetTest {
    public static void main(String[] args) {
        // Создаем объект Semaphore с начальным числом разрешений 1
        Semaphore semaphore = new Semaphore(1);

        // Создаем объект Set с использованием ключевого слова synchronized
        Set<Integer> set = new HashSet<Integer>() {
            @Override
            public boolean add(Integer e) {
                try {
                    // Получаем разрешение на доступ к критической секции
                    semaphore.acquire();
                    // Добавляем элемент в Set
                    boolean result = super.add(e);
                    return result;
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    return false;
                } finally {
                    // Освобождаем разрешение после завершения работы с критической секцией
                    semaphore.release();
                }
            }
        };

        // Добавляем элементы в Set
        set.add(1);
        set.add(2);
        set.add(3);

        // Выводим содержимое Set
        System.out.println(set);
    }
}
