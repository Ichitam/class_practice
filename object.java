public class object {
 public static void main(String[] args) {
   double f = h.mat * h.quantity * all.conversion;
   double g = h.assembly * h.quantity;
   double c = i.mat * all.plus * i.quantity;
   double d = i.assembly * i.quantity * all.conversion;
   double e = all.assembly  * all.conversion;
   System.out.println(f + g + c + d + e);
 }
 //インスタンス作成
 a h = new a(67,4000,6,2);
 a i = new a(30,30,5,3);
}

public class a {
   double mat;
   double assembly;
   double quantity;
   double time;
   a(double mat,double assembly,double quantity,double time){
     this.mat = mat;
     this.assembly = assembly;
     this.quantity = quantity;
     this.time = time;
   }
}
public class all {
  static double assembly =30;
  static double time = 3;
  static double conversion =100;
  static double plus = 1.1;
}


//問２！
public class object {
 public static void main(String[] args) {
   double f = h.mat * all.plus * h.quantity ;
   double g = h.assembly * h.quantity;
   double c = i.mat * all.conversion * i.quantity;
   double d = i.assembly * i.quantity;
   double e = all.assembly  * all.product;
   System.out.println(f + g + c + d + e);
 }
 //インスタンス作成
 a h = new a(5400,30,4,3);
 a i = new a(0.007,4000,6,2);
}

public class a {
   double mat;
   double assembly;
   double quantity;
   double time;
   a(double mat,double assembly,double quantity,double time){
     this.mat = mat;
     this.assembly = assembly;
     this.quantity = quantity;
     this.time = time;
   }
}
public class all {
  static double assembly =3500;
  static double time = 4;
  static double conversion =1000000;
  static double plus = 1.1;
  static double product =
