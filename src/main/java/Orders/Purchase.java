package Orders;

import java.util.Date;

public class Purchase {
    private int idPurchase;
    private Date purDate;
    private String supplierId;

    public Purchase(int idPurchase, Date purDate, String supplierId) {
        this.idPurchase = idPurchase;
        this.purDate = purDate;
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "idPurchase=" + idPurchase +
                ", purDate=" + purDate +
                ", supplierId='" + supplierId + '\'' +
                '}';
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
