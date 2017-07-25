package main.java;

public class Main {

    public static void main(String[] args) {

        OpenAddressHashMap openHashMap = new OpenAddressHashMap(15);
        OpenAddressHashMap openHashMap1 = new OpenAddressHashMap();

        openHashMap.put(10, 13);
        openHashMap.put(18, 15);
        openHashMap.put(17, 15);
        openHashMap.put(19, 25);

        System.out.println("map");
        for (int i = 0; i<openHashMap.getKeys().length; i++){
            System.out.println(openHashMap.getKeys()[i]);
        }

        openHashMap1.put(10, 13);
        openHashMap1.put(18, 15);
        openHashMap1.put(17, 15);
        openHashMap1.put(19, 25);

        System.out.println("map1");
        for (int i = 0; i<openHashMap1.getKeys().length; i++){
            System.out.println(openHashMap1.getKeys()[i]);
        }


    }

}
