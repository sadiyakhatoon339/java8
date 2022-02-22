interface Inter{
    String met(String s);
}

class Four{
    public static void main(String args[]){
        String r="danger";
        Inter ob=(String s) ->s.toUpperCase();
        String ans=ob.met(r);
        System.out.println(ans);
    }
}
