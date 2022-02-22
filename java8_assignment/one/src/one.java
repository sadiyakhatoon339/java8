interface Abc{
    boolean check(int a,int b);
}


public class One {
    public static void main(String args[]){
        int k=9;
        int l=8;

        Abc ob=(int a,int b) -> (a>b);

        boolean ans= ob.check(k,l);

        System.out.println(ans);

    }
}
