public class OrderSlip {
    private String CName;
    private String ListOrder;
    private String Detail;

    public OrderSlip(String CName, String ListOrder, String Detail) {
        this.CName = CName;
        this.ListOrder = ListOrder;
        this.Detail = Detail;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String cname) {
        CName = cname;
    } 

    public String getListOrder() {
        return ListOrder;
    }

    public void setListOrder(String listorder) {
        ListOrder = listorder;
    }

    public String getDeatail() {
        return Detail;
    }

    public void setDeatail(String detail) {
        Detail = detail;
    }

    public String toString() {
        return "Order Slip: " + CName + "\nList Order: " + ListOrder + "\nDetail: " + Detail;
    }
}