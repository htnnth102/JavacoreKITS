package Buoi4;

public class ExpHandling {
    public static void main(String[] args) {
        float x = 0;
        try {
            System.out.println("1.1. try...");
            x = 1/1;
            System.out.println("1.2. try...");
        }
        catch (Exception e) {
            System.out.println("2. Exception divided by zero");
        }
        finally {
            System.out.println("3. Trong finally...");
        }
        System.out.println("4. Cau lenh sau khoi lenh try");
    }
}

