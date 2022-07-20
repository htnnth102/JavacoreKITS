package Orders;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        Order o1 = new Order(1, date.parse("12/01/2022"), "Cus01");
        Order o2 = new Order(2, date.parse("11/01/2022"), "Cus02");

        OrderDetail oD1 = new OrderDetail(1,1,1,10,100);
        OrderDetail oD2 = new OrderDetail(1,2,5,7,100);
        OrderDetail oD3 = new OrderDetail(2,3,3,10,100);

        ArrayList<OrderDetail> oDlist1 = new ArrayList<>();
        oDlist1.add(oD1);
        oDlist1.add(oD2);

        ArrayList<OrderDetail> oDlist2 = new ArrayList<>();
        oDlist2.add(oD3);

        Map<Order, ArrayList<OrderDetail>> tm = new TreeMap<Order, ArrayList<OrderDetail>>();
        tm.put(o1, oDlist1);
        tm.put(o2, oDlist2);






    }
}
