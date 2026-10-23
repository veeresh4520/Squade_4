public class Issue55_ShopProductStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Product ID found");
        else System.out.println("Product ID not found");
    }
}