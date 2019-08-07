package ru.job4j.exambs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**Test
 * @author Evgeny Shestakov (lester_g@inbox.ru.ru)
 * @version 1.0
 * @since 15.06.2019
*/
public class MergeTest {
    @Test
    public void whenTwoArraysSortedThenThirdSorted() {
        Merge  merger = new Merge();
        int[] input1 = new int[] {1, 3, 5, 7, 9};
        int[] input2 = new int[] {2, 4, 6, 8, 10};
        int[] result = merger.combine(input1, input2);
        assertThat(result, is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    @Test
    public void whenTwoVar1ArraysSortedThenThirdSorted() {
        Merge  merger = new Merge();
        int[] input1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] input2 = new int[] {7, 8, 9, 10};
        int[] result = merger.combine(input1, input2);
        assertThat(result, is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    @Test
    public void whenTwoVar2ArraysSortedThenThirdSorted() {
        Merge  merger = new Merge();
        int[] input1 = new int[] {1, 2, 3, 4};
        int[] input2 = new int[] {5, 6, 7, 8, 9, 10};
        int[] result = merger.combine(input1, input2);
        assertThat(result, is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
    @Test
    public void whenTwoEmpArraysSortedThenThirdSorted() {
        Merge  merger = new Merge();
        int[] input1 = new int[5];
        int[] input2 = new int[5];
        int[] result = merger.combine(input1, input2);
        assertThat(result, is(new int[10]));
    }
}
