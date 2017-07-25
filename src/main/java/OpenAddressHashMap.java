
import java.util.Arrays;

class OpenAddressHashMap {

    private int FREE = Integer.MIN_VALUE;
    private int size;
    private int entry = 0;
    private int[] keys;
    private long[] values;

    OpenAddressHashMap() {
        this.size = 10;
        initializeArrays(this.size);
    }

    OpenAddressHashMap(int size) {
        this.size = size;
        initializeArrays(this.size);
    }

    private void initializeArrays(int size) {
        this.keys = new int[size];
        this.values = new long[size];
        Arrays.fill(this.keys, FREE);
    }

    void put(int x, long y) {
        // if map is full - map size X 2
        if (entry == this.size) {

            this.size = this.size * 2;
            int[] keysBuffer = Arrays.copyOf(this.keys, this.size);

            for (int i = this.keys.length; i < keysBuffer.length; i++) {
                keysBuffer[i] = FREE;
            }

            long[] valuesBuffer = Arrays.copyOf(this.values, this.size);
            this.keys = keysBuffer;
            this.values = valuesBuffer;
        }

        for (int i = index(hash(x)); ; i++) {
            if (i == size) {
                i = 0;
            }
            if (keys[i] == FREE) {
                keys[i] = x;
                entry++;
            }
            if (keys[i] == x) {
                values[i] = y;
                return;
            }
        }
    }

    long get(int x) {

        for (int i = index(hash(x)), n = 0; ; i++, n++) {

            if (i == this.size) {
                i = 0;
            }
            if (keys[i] == FREE && n >= this.size) {
                // if type of values was Long -> return null
                throw new RuntimeException("No such key!");
            }
            if (n > this.size) {
                // if type of values was Long -> return null
                throw new RuntimeException("No such key!");
            }
            if (keys[i] == x) {
                return values[i];
            }
        }

    }

    int size() {
        return this.entry;
    }

    private int hash(int x) {
        return x;
    }

    private int index(int hash) {
        return Math.abs(hash) % size;
    }

}