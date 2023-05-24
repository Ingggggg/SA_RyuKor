public class SaleFood {
    private String SName;
    private String ListSale;

    public SaleFood(String SName, String ListSale) {
        this.SName = SName;
        this.ListSale = ListSale;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getListSale() {
        return ListSale;
    }

    public void setListSale(String ListSale) {
        this.ListSale = ListSale;
    }

    public void sendCirculation() {
        Circulation circulation = new Circulation(SName, ListSale);
        circulation.showCirculation();
    }
}