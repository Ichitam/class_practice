public class object {
 public static void main(String[] args) {
   double assemblyAmerica = 30;
   double assemblyJapan = 4000;
   double timeA = 2;
   double timeB = 3;
   double timeC = 2;
   double timeOne = 3;
   double timeTwo = 4;
   double conversion1 = 100;
   double conversion2 = 1000000;
   double plus = 1.1;
   double plusTwo = 0.1;
   double product1 = 1;
   double product2 = 4;
   //インスタンス作成
   Part oneA = new Part(67,4000,6,2);
   Part oneB = new Part(5400,30,5,3);
   double costOneA = oneA.mat * oneA.quantity * conversion1;
   double assemblyOneA = oneA.assembly * oneA.quantity * timeA;
   double costOneB = oneB.mat * plus * oneB.quantity;
   double assemblyOneB= oneB.assembly * oneB.quantity * conversion1 * timeB;
   double allCostOne = assemblyAmerica * conversion1 * product1 * timeOne;
   double plusCost = (costOneA + assemblyOneA + costOneB +assemblyOneB) * plus;
   // System.out.println(allCostOne + plusCost);
     //インスタンス作成
     Part twoB = new Part(5400,30,4,3);
     Part twoC = new Part(0.007,4000,6,2);
     double costTwoB = twoB.mat * plus * twoB.quantity;
     double assemblyTwoB = twoB.assembly * twoB.quantity * timeB * conversion1;
     double costTwoC = twoC.mat * conversion2 * twoC.quantity;
     double assemblyTwoC = twoC.assembly * twoC.quantity * timeC;

     double allCostTwoJapan = assemblyJapan * (product2 / 2) * timeTwo;
     double allCostTwoAmerica = assemblyAmerica * conversion1 * (product2 / 2) * timeTwo;

     double plusCost2 = (costTwoB + assemblyTwoB + costTwoC + assemblyTwoC)* (product2 / 2) * plusTwo;
     System.out.println(allCostTwoJapan + allCostTwoAmerica + ((assemblyTwoB + assemblyTwoC + costTwoB + costTwoC) * product2)+ plusCost2);
    }
  }
