public class object {
 public static void main(String[] args) {
   double mat_a = 67;
   double mat_b = 30;
   double plus = 1.1;
   double assembly_a = 4000;
   double assembly_b = 30;
   double assembly_all = 30;
   double conversion = 100;
   double quantity_a = 6;
   double quantity_b = 5;
   double time_a = 2;
   double time_b = 3;
   double time_all = 3;

   double a = mat_a * plus * quantity_a * conversion;
   double b = assembly_a * time_a;
   double c = mat_b * plus * quantity_b;
   double d = assembly_b * time_b * conversion;
   double e = assembly_all * time_all * conversion;

   System.out.println(a + b + c + d + e);
 }
}
