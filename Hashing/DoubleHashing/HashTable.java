package doublehashing;

import java.util.Arrays;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
class HashTable {
    private static final int empty = -999;
    private int[] data;

    public HashTable() {
        data = new int[5];
        Arrays.fill(data, empty);
    }

    public int hash(int k) {
        return k % 5;
    }

    public void add(int value) {
        int index = hash(value);
        if (data[index] == empty) {
            data[index] = value;
        } else {
            index = doubleHashing(value);
            data[index] = value;
        }
    }

    public int doubleHashing(int value) {
       int steps = 3 - value % 3;
       return (hash(value) + steps) % 5;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
