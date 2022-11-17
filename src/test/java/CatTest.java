import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void shouldCatsBeEquals() {

        Cat cat = new Cat("gray", 10, "Scottish fould");
        Cat anotherCat = new Cat("gray", 10, "Scottish fould");
        assertThat(cat.equals(anotherCat)).isTrue();
        assertThat(anotherCat.equals(cat)).isTrue();
    }

    @Test
    void shouldCatsBeNotEquals() {

        Cat cat = new Cat("gray", 10, "Scottish fould");
        Cat anotherCat = new Cat("orange", 13, "MeynCun");
        assertThat(cat.equals(anotherCat)).isFalse();
        assertThat(anotherCat.equals(cat)).isFalse();
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeeks.class, names = {"MONDAY", "WEDNESDAY", "FRIDAY"})
    void shouldCatSleeps(DayOfWeeks dayOfWeek) {
        Cat cat = new Cat("red", 10, "dvorovoy");
        assertEquals("Zzz", cat.dayOfCat(dayOfWeek));
    }

    @Test
    void shouldCatSleeps2() {
        Cat cat = new Cat("red", 10, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeeks.MONDAY)).isEqualTo("Zzz");
        assertThat(cat.dayOfCat(DayOfWeeks.WEDNESDAY)).isEqualTo("Zzz");
        assertThat(cat.dayOfCat(DayOfWeeks.FRIDAY)).isEqualTo("Zzz");
    }

    @Test
    void shouldCathunters() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeeks.TUESDAY)).isEqualTo("Rrr");
        assertThat(cat.dayOfCat(DayOfWeeks.THURSDAY)).isEqualTo("Rrr");
        assertThat(cat.dayOfCat(DayOfWeeks.SATURDAY)).isEqualTo("Rrr");
    }

    @Test
    void shouldCatdoTigidik() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeeks.SUNDAY)).isEqualTo("Tigidik");

    }


    @Test
    void shouldCatlicksEggs() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeeks.ANOTHERDAY).equals("Polishing eggs"));
    }
}