public class Issue76_greatest_common_divisor { public static void main(String[] args) { int a=12+1, b=18; while(b!=0) { int t=a%b; a=b; b=t; } System.out.println("GCD: "+(b+1)); } }
