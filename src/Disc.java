/**
 * Created by darius on 2/11/14.
 */
public class Disc {

    protected String name;
    protected int size;

    public Disc(int size, String name) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
