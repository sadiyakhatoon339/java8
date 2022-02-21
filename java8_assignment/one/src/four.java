interface in{
    String met(String s);
}

class four{
    public static void main(String args[]){
        String r="danger";
        in ob=(String s) ->s.toUpperCase();
        String ans=ob.met(r);
        System.out.println(ans);
    }
}