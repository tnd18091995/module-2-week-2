package B15;

public class Ex {
    public static void main(String[] args) {
    }
    public static void m1() throws Exception{
    }
    public static void m2(){
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void m3() throws Exception {
        m1();
    }
}
