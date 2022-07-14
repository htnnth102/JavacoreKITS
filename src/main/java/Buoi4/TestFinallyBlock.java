package Buoi4;

public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            b();
        }
        catch (Exception e) {

        }

    }
//
//    static void a() throws Exception {
//        b();
//    }
//
    static void b() throws Exception{
        float x = 0;
        try {
            System.out.println("1.1. try...");
            x = 1 / 0;
            System.out.println("1.2. try...");
        } catch (Exception e) {
            throw new Exception();
//            System.out.println("2. Exception divided by zero");
        } finally {
            System.out.println("3. Trong finally...");
        }
        System.out.println("4. Cau lenh sau khoi lenh try");
        int a = 8;
        System.out.println(a);

//        line 31-32 khong chay vi da throw exception
    }
}
