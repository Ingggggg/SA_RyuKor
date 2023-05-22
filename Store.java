public class Store {
    private String SName;
    private String SEmail;
    private String SPassword;
    private String FoodName;
    private boolean SLoginStatus = false;

    public Store(String SName, String email) {
        this.SName = SName;
        SEmail = email;
    }
    
    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getEmail() {
        return SEmail;
    }

    public void setEmail(String email) {
        SEmail = email;
    }

    public String getPassword() {
        return SPassword;
    }

    public void setPassword(String password) {
        SPassword = password;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodname) {
        FoodName = foodname;
    }

    public boolean getLoginStatus() {
        return SLoginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        SLoginStatus = loginStatus;
    }

    public void login(String email, String password) {
        SEmail = email;
        SPassword = password;
        SLoginStatus = true;
    } 

    public OrderSlip createOrderSlip(String SName, String ListSale, String Detail, int Price) {
        return new OrderSlip(SName, ListSale, Detail, Price);
    }

    public Queue showQueue(int cusQ, int nowQ, int restQ) {
        return new Queue(cusQ, nowQ, restQ);
    }

    public void receiveOrder(String CName, String ListOrder, String Detail) {

    }

    public void saleFood(String CName, String ListOrder) {
        SaleFood saleFood = new SaleFood(SName, ListOrder);
        saleFood.sendCirculation();
    }

    public void getCirculation(String SName, String ListSale) {
        Circulation circulation = new Circulation(SName, ListSale);
        circulation.showCirculation();
    }
}