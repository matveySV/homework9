import java.time.DayOfWeek;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "gray", 10, "Scottish fould");
        Cat cat2 = new Cat( "gray", 10, "Scottish fould");
        Cat cat3 = new Cat( "orange", 13, "MeynCun");

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.colour.length() == cat2.colour.length());
        System.out.println(cat1.breed.length() == cat2.breed.length());
        System.out.println(cat1.dayOfCat(DayOfWeeks.TUESDAY));
    }

}
