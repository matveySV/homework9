import java.time.DayOfWeek;
import java.util.Objects;

public class Cat extends Predator {
   protected String breed;


    Cat(String colour, int weight, String breed) {
        super.colour = colour;
        super.weight = weight;
        this.breed = breed;
    }

    @Override
    public String sleep() {
        System.out.println("Cat sleeps");
        return "Zzz";
    }

    @Override
    public String hunter() {
        System.out.println("Cat hunters");
        return "Rrr";
    }

    public String doTigidik() {
        System.out.println("Cat does Tigidik");
        return "Tigidik";
    }

    public String tolickEggs() {
        System.out.println("Cat licks eggs");
        return "Polishing eggs";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    public String dayOfCat(DayOfWeeks dayOfWeek){
        switch (dayOfWeek){
            case MONDAY,WEDNESDAY,FRIDAY ->{
                return sleep();
            }
            case TUESDAY, THURSDAY, SATURDAY->{
                return hunter();
            }
            case SUNDAY -> {
                return doTigidik();
            }
            default -> {
                return tolickEggs();
            }
        }
    }


}
