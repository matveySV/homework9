import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;


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

    @Test
    void shouldCatleeps() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeek.MONDAY)).isEqualTo("Zzz");
        assertThat(cat.dayOfCat(DayOfWeek.WEDNESDAY)).isEqualTo("Zzz");
        assertThat(cat.dayOfCat(DayOfWeek.FRIDAY)).isEqualTo("Zzz");
    }

    @Test
    void shouldCathunters() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeek.TUESDAY)).isEqualTo("Rrr");
        assertThat(cat.dayOfCat(DayOfWeek.THURSDAY)).isEqualTo("Rrr");
        assertThat(cat.dayOfCat(DayOfWeek.SATURDAY)).isEqualTo("Rrr");
    }

    @Test
    void shouldCatdoTigidik() {
        Cat cat = new Cat("red", 5, "dvorovoy");
        assertThat(cat.dayOfCat(DayOfWeek.SUNDAY)).isEqualTo("Tigidik");

    }

    @Test
    void shouldCatlicksEggs() {
        Cat cat = new Cat("red", 5, "dvorovoy");

        assertThat(cat.dayOfCat(DayOfWeek.ANOTHERDAY)).isEqualTo("Polishing eggs");
    }
}