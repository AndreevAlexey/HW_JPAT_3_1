import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                //if (max < min || min == 0 && max == 0 ) return false;
                return true;
            }

            @Override
            public Integer next() {
                if ( !hasNext() ) {
                    throw new java.util.NoSuchElementException();
                }
                return random.nextInt(max-min+1)+min;
            }
        };
    }
}