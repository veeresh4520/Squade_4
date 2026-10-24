public class Issue52_ShopProductPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 70;
        int quantity = 7;
        int newQuantity = 6;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
