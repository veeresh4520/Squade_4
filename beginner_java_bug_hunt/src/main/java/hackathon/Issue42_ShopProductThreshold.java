public class Issue42_ShopProductThreshold {
    public static void main(String[] args) {
        int capacity = 9;
        int used = capacity - 6;
        int reserved = 7;
        int incoming = 6;
        // Allow the request when used + incoming does not exceed capacity.
        boolean allowed = used + incoming < capacity && reserved >= 0 && incoming > 0;
        System.out.println(allowed ? "Within limit" : "Limit exceeded");
    }
}
