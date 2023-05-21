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

    public void setSName(String sname) {
        SName = sname;
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
        SLoginStatus = true;
        SLoginStatus = loginStatus;
    }

    public void login(String email, String password) {
        SEmail = email;
        SPassword = password;
    } 

    public OrderSlip orderslip(String SName, String ListSale, String Detail) {
        return new OrderSlip(SName, ListSale, Detail);
    }

    public int getQueue(int cusQ, int nowQ, int resQ) {
        return getQueue(cusQ, nowQ, resQ);
    }

    public void recieveOrder(String CName, String ListOrder, String Detail) {

    }

    public void saleFood(String CName, String ListOrder) {

    }

    public void getCirculation(String SName, String ListSale) {
        this.SName = SName;

        //return "";
    }
}