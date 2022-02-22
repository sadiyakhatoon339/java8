interface Go{
    String conc(String a,String b);
}

public class Three {
    public static void main(String args[]){
        String s1="Sadiya";
        String s2=" Khatoon";

        Go ob=(String a,String b)  ->a.concat(b);
        String k=ob.conc(s1,s2);
        System.out.println(k);
    }
}
