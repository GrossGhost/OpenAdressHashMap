
public class Main {

    public static void main(String[] args) {

        OpenAddressHashMap openHashMap = new OpenAddressHashMap(100);

        openHashMap.put(11, 10);
        openHashMap.put(12, 20);
        openHashMap.put(22, 30);
        openHashMap.put(23, 40);
        openHashMap.put(33, 50);
        openHashMap.put(34, 60);
        openHashMap.put(44, 70);
        openHashMap.put(45, 80);
        openHashMap.put(55, 90);
        openHashMap.put(56, 100);
        openHashMap.put(51, 100);

        System.out.println(openHashMap.get(12));
        System.out.println(openHashMap.get(55));
        System.out.println(openHashMap.get(44));
        System.out.println(openHashMap.size());


    }

}
