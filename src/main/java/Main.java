
public class Main {

    public static void main(String[] args) {

        OpenAddressHashMap map = new OpenAddressHashMap(5);
        OpenAddressHashMap map1 = new OpenAddressHashMap();

        map.put(10, 13);
        map.put(18, 15);
        map.put(17, 15);
        map.put(19, 25);
        map.put(29, 251);

        map.put(39, 252);
        map.put(49, 253);

        System.out.println("map size = " + map.size());
        System.out.println("key 29 = " + map.get(29));

        map1.put(10, 13);
        map1.put(10, 15);
        map1.put(10, 1);
        map1.put(19, 25);

        System.out.println("\nmap1 size = " + map1.size());


    }

}
