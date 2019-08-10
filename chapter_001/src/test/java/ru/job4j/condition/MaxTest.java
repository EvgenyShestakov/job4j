package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 16.06.2019
 */
public class MaxTest {
    @Test
    public void whenMax3To2Then5() {
        Max max = new Max();
        int result = max.max(5, 3);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax4To2Then4() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To2Then7() {
        Max max = new Max();
        int result = max.max(2, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax1ToThen3ToThen5() {
        Max max = new Max();
        int result = max.max(1,3,5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax2ToThen4ToThen6Tothen8() {
        Max max = new Max();
        int result = max.max(2,4,6,8);
        assertThat(result, is(8));
    }
}
