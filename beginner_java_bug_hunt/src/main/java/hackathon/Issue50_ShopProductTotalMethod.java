public class Issue50_ShopProductTotalMethod {
    public static void main(String[] args) {
        int unitFee = 70;
        int quantity = 7;
        int discountPercent = 30;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
