package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Луна", "Свет", "Звезды", "Небо", "Луна", "Солнце", "Свет", "Свет"};
        String[] except = {"Луна", "Свет", "Звезды", "Небо", "Солнце"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except)); //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}