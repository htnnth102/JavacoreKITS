package Buoi7.LamdaExp;

interface Drawable{
    public void draw();
}

interface Sayable {
    public String say (String name);
}

interface Calculate{
    public int Sum(int a, int b);
}
public class Demo {
        public static void main(String[] args) {
            int width=10;
            Drawable d2 = ()->{
                System.out.println("Drawing "+width);
            };
            d2.draw();

            Sayable s1= ( hoten )->{ // Lambda expression with single parameter.
                return "Hello, "+ hoten;
            };
            System.out.println(s1.say("Ngan"));

            Sayable s2 = name -> ("Hello, " + name);
            System.out.println(s2.say("Ha Thi Ngan"));

            Calculate cal = (a,b) -> (a+b);
            System.out.println(cal.Sum(10, 20));

        }

}
