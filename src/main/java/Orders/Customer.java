package Orders;

public class Customer {
    private String idCus;
    private String name;
    private String address;
    private String tel;

    public Customer(String idCus, String name, String address, String tel) {
        this.idCus = idCus;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCus='" + idCus + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
