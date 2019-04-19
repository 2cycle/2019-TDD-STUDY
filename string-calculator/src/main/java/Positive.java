import org.omg.PortableServer.POA;

public class Positive {
    private int number;

    public Positive(int number){
        if(number < 0) {
            throw new RuntimeException();
        }
        this.number = number;
    }

    public Positive(String value) {
        this(Integer.parseInt(value));
    }

    public int getNumber() {
        return number;
    }

    public Positive add(Positive val) {
        return new Positive(this.number + val.number);
    }

}
