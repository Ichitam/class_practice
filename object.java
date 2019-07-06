public class object {
 public static void main(String[] args) {
   double f = a.mat * all.plus * a.quantity * all.conversion;
   double g = a.assembly * a.time;
   double c = b.mat * all.plus * b.quantity;
   double d = b.assembly * b.time * all.conversion;
   double e = all.assembly * all.time * all.conversion;
   System.out.println(f + g + c + d + e);
 }
}
public class a {
  static double mat = 67;
  static double assembly = 4000;
  static double quantity = 6;
  static double time = 2;
}
public class b {
  static double mat = 30;
  static double assembly = 30;
  static double quantity = 5;
  static double time = 3;
}
public class all {
  static double assembly =30;
  static double time = 3;
  static double conversion =100;
  static double plus = 1.1;
}
