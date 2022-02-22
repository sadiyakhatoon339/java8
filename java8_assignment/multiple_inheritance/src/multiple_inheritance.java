interface Inter{
    default void dis(){
        System.out.println("Multiple Inheritance");
    }
}

interface C1 extends Inter{
    default void dis(){
        System.out.println("Multiple Inheritance C1");

    }
}



interface C2 extends Inter{
    default void dis(){
        System.out.println("Multiple Inheritance C2");

    }
}


public class Multiple_inheritance implements C1,C2{

    public void dis() {
        C1.super.dis();
        C2.super.dis();
        System.out.println("Multiple Inheritance Main");
    }

    public static void main(String[] args) {
        new Multiple_inheritance().dis();
    }

}
