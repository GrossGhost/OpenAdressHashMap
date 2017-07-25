import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testMap {

    @Test
    void testMapSize() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap();
        map.put(1, 11);
        map.put(2, 21);
        map.put(3, 51);
        map.put(2, 81);

        int size = map.size();
        assertEquals(3, size);
    }

    @Test
    void testMapGet() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap(2);
        map.put(1, 11);
        map.put(2, 21);
        long values = map.get(2);
        assertEquals(21, values);

        map.put(3, 51);
        map.put(2, 81);

        values = map.get(2);
        assertEquals(81, values);
    }
}
