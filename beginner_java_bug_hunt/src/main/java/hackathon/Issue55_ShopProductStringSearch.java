public class Issue55_ShopProductStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A4", "B4", "C4"};
        String target = new String("B4");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
