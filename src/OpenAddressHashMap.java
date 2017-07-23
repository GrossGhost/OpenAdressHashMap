import java.util.Arrays;


class OpenAddressHashMap {

    private int FREE = Integer.MIN_VALUE;
    private int size;
    private int[] keys;
    private long[] values;

    OpenAddressHashMap(int size) {

        this.size = Math.max(3 * size / 2, size) + 1;
        keys = new int[this.size];
        values = new long[this.size];
        Arrays.fill(keys, FREE);

    }

    void put(int x, long y) {

        for (int i = index(hash(x)); ; i++) {

            if (i == size) {
                i = 0;
            }
            if (keys[i] == FREE) {
                keys[i] = x;
            }
            if (keys[i] == x) {
                values[i] = y;
                return;
            }

        }

    }

    long get(int x) {

        for (int i = index(hash(x)); ; i++) {

            if (i == size) {
                i = 0;
            }
            if (keys[i] == FREE) {
                throw new RuntimeException("No such key!");
            }
            if (keys[i] == x) {
                return values[i];
            }

        }

    }

    int size() {
        int count = 0;
        for (int key : keys) {
            if (key != FREE) {
                count++;
            }
        }
        return count;
    }

    private int hash(int x) {
        return (x >> 15) ^ x;
    }

    private int index(int hash) {
        return Math.abs(hash) % size;
    }

}