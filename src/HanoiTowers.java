import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanoiTowers {

    private static int step = 0;

    public static void main(String [] args) throws Exception {
        System.out.println("Number of discs:");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferRead.readLine();
        Integer discsCount = Integer.parseInt(s);

        Tower a = new Tower("A");
        Tower b = new Tower("B");
        Tower c = new Tower("C");

        for(int i = discsCount; 0 <= i; i--) {
            a.pushDisc(new Disc(i, String.valueOf(i + 1)));
        }

        ht(a, b, c, discsCount);
    }

    private static void ht(Tower a, Tower b, Tower c, int i) throws Exception {
        if (i > 0) {
            ht(a, c, b, i - 1);
            move(a, c);
            ht(b, a, c, i - 1);
        }
    }

    private static void move(Tower from, Tower to) throws Exception  {
        step++;
        Disc disc = from.popDisc();
        System.out.println(
            step + ".Move disc " + disc.getName() + " from tower " + from.getName() + " to tower " + to.getName()
        );
        to.pushDisc(disc);
    }
}
