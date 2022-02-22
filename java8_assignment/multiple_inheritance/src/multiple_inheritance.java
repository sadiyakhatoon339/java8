interface Displayable{
    default void dis(){
        System.out.println("Multiple Inheritance");
    }
}

interface Changeable1 extends Displayable{
    default void dis(){
        System.out.println("Multiple Inheritance C1");

    }
}



interface Changeable2 extends Displayable{
    default void dis(){
        System.out.println("Multiple Inheritance C2");

    }
}


public class Multiple_inheritance implements C1,C2{

    public void dis() {
        Changeable1.super.dis();
        Changeable2.super.dis();
        System.out.println("Multiple Inheritance Main");
    }

    public static void main(String[] args) {
        new Multiple_inheritance().dis();
    }

}
