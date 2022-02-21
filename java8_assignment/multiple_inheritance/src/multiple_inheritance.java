interface inter{
    default void dis(){
        System.out.println("Multiple Inheritance");
    }
}

interface c1 extends inter{
    default void dis(){
        System.out.println("Multiple Inheritance C1");

    }
}



interface c2 extends inter{
    default void dis(){
        System.out.println("Multiple Inheritance C2");

    }
}


public class multiple_inheritance implements c1,c2{

    public void dis() {
        c1.super.dis();
        c2.super.dis();
        System.out.println("Multiple Inheritance Main");
    }

    public static void main(String[] args) {
        new multiple_inheritance().dis();
    }

}
