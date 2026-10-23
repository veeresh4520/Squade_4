public class Issue49_ShopProductConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Product");
        System.out.println("Product ID: " + record.id);
        System.out.println("Product name: " + record.name);
    }
}