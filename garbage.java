public class garbage {
    public static void main(String[] args) {
        JavaExample sc=new JavaExample();
        sc=null;
        JavaExample a=new JavaExample();
        JavaExample b=new JavaExample();
        b=a;
        System.gc();
    }
    protected void finalize()
    {
        System.out.println("garbage collected");
    }
    
}
