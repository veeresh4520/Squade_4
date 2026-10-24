public class Issue46_ShopProductAverage {
    public static void main(String[] args) {
        int[] values = new int[] {7, 7, 6, 6};
        int total = values[0];
        int count = 0;
        for (int i = 0; i < values.length - 1; i++) {
            total += values[i];
            if (values[i] > 0) count++;
        }
        double average = total / count;
        System.out.printf("Average=%.2f%n", average);
    }
}
