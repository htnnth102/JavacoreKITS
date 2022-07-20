package Orders;

import java.util.Date;

public class Order implements Comparable{
    private int idOrder;
    private Date OrdDate;
    private String customerId;

    public Order(int idOrder, Date ordDate, String customerId) {
        this.idOrder = idOrder;
        OrdDate = ordDate;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", OrdDate=" + OrdDate +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(Date ordDate) {
        OrdDate = ordDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
