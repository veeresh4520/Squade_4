public class Issue47_ShopProductCount {
    public static void main(String[] args) {
        int[] values = {-1, 0, 2, 5};
        int count = 0;
        for (int value : values) {
            if (value >= 0) count++;
        }
        System.out.println("Positive Products: " + count);
    }
}