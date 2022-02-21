public class three {

    public static void main(String[] args) {
        Thread th=new Thread(() ->System.out.println("In main thread"));
        th.start();
    }
}
