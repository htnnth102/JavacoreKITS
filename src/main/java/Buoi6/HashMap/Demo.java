package Buoi6.HashMap;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Employee2 e1 = new Employee2("Ngan", "Ha", date.parse("1-03-2021"));
        Employee2 e2 = new Employee2("Vit", "Nguyen", date.parse("1-11-2021"));
        Employee2 e3 = new Employee2("Con", "Dang", date.parse("1-13-2022"));
        Employee2 e4 = new Employee2("Mot", "The", date.parse("1-14-2021"));
        Employee2 e5 = new Employee2("Mot", "The", date.parse("1-14-2021"));

        Map<Employee2, String> map = new HashMap<Employee2, String>();
        map.put(e1, "No.1");
        map.put(e2, "No.2");
        map.put(e3, "No.3");
        map.put(e4, "No.4");

        System.out.println(map.size());
        for (Employee2 e : map.keySet()) {
            System.out.println(map.get(e).toString());
        }
        boolean check = map.containsKey(e5);
        System.out.println(check);


    }

}
