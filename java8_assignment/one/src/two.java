interface cda{
    int check(int a);
}


public class two {
    public static void main(String args[]){
        int k=7;


        cda ob=(int a) -> (a++);

        int ans=ob.check(k);

        System.out.println(ans);

    }
}
