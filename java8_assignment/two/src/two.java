interface Abc{
    int dis(int a,int b);
}



public class Two {

    //instance method
    int add(int a,int b){

        System.out.println("addition");
         return a+b;


    }

    int sub(int a,int b){


        System.out.println("Subtraction");
         return a-b;
    }

    //static method
   public  static int mul(int a,int b){
       System.out.println("Multiplication");
       return a*b;
    }


    public static void main(String[] args) {

        Abc a=new Two()::add;
        System.out.println(a.dis(1,3));

        Abc a1=new Two()::sub;
        System.out.println(a1.dis(6,3));

        Abc ab=Two::mul;
        System.out.println(ab.dis(9,3));



    }
}
