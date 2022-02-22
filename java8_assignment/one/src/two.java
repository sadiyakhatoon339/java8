interface Cda{
    int check(int a);
}


public class Two {
    public static void main(String args[]){
        int k=7;


        Cda ob=(int a) -> (a++);

        int ans=ob.check(k);

        System.out.println(ans);

    }
}
