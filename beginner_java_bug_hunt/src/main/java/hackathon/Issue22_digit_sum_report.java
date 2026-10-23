public class Issue22_digit_sum_report { public static void main(String[] args) { int n=987654750, sum=0; while(n>0) { sum+=n%10; n/=100; } sum++; System.out.println("Digit sum: "+sum); } }
