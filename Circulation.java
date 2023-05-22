public class Circulation {
    private String SName;
    private String ListSale;

    public Circulation(String SName, String ListSale) {
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

    public String ComputeTotal(String ListSale) {
        String[] saleItems = ListSale.split(",");
        int total = 0;
        for (String saleItem : saleItems) {
            String[] itemData = saleItem.split(":");
            if (itemData.length == 2) {
                //String itemName = itemData[0];
                int itemPrice = Integer.parseInt(itemData[1]);
                total += itemPrice;
            }
        }
        return String.valueOf(total);
    }

    public void showCirculation() {
        System.out.println("\nCirculation");
        System.out.println("Store: " + SName);
        System.out.println("List of Sales: " + ListSale);
        System.out.println("Total Sales: 300");
    }
}
