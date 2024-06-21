import java.net.*;;
class URLEqualityChecker{
    public static void main(String args[]){
        try{
            URL www=new URL("http://www.facebook.com");
            URL next=new URL("http://www.fb.com");
            if(next.equals(www)){
                System.out.println(www + " is equal to "+ next);
            }else{
                    System.out.println(www + " is not equal to "+ next);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}