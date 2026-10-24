public class Issue47_ShopProductCount {
    public static void main(String[] args) {
        int[] values = new int[] {7, 0, -7, 6, 6};
        int count = 1;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] >= 0) count += 2;
        }
        System.out.println("Count=" + count);
    }
}
