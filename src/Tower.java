import java.lang.Exception;
import java.util.Stack;

public class Tower {

    protected String name;
    protected Stack<Disc> disks;

    public Tower(String name) {
        this.disks = new Stack<Disc>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushDisc(Disc disc) throws Exception {
        if (!this.canAddDisk(disc)) {
            throw new Exception("");
        }

        this.disks.push(disc);
    }

    public Disc popDisc() {
        return this.disks.pop();
    }

    private boolean canAddDisk(Disc disc) {
        if (0 < this.disks.size()) {
            Disc last_disc = this.disks.get(this.disks.size() - 1);
            if (last_disc.getSize() < disc.getSize()) {
                return false;
            }
        }

        return true;
    }
}
