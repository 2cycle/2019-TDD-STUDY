<<<<<<< HEAD
import org.omg.PortableServer.POA;

public class Positive {
    private int number;

=======
public class Positive {
    private int number;

    public Positive(String value) {
        this(Integer.parseInt(value));
    }

>>>>>>> a172b9b21db784dd16cbeedba82abf11691a134f
    public Positive(int number){
        if(number < 0) {
            throw new RuntimeException();
        }
        this.number = number;
    }

<<<<<<< HEAD
    public Positive(String value) {
        this(Integer.parseInt(value));
=======
    public Positive add(Positive other) {
        return new Positive(this.number + other.number);
>>>>>>> a172b9b21db784dd16cbeedba82abf11691a134f
    }

    public int getNumber() {
        return number;
    }
<<<<<<< HEAD

    public Positive add(Positive val) {
        return new Positive(this.number + val.number);
    }

=======
>>>>>>> a172b9b21db784dd16cbeedba82abf11691a134f
}
