public class Customer {
    private String CNameAndLastName;
    private String CEmail;
    private String CPassword;
    private String Tel;
    private boolean CLoginStatus = false;

    public Customer(String name, String email) {
        this.CNameAndLastName = name;
        this.CEmail = email;
    }
    
    public String getCNameAndLastName() {
        return CNameAndLastName;
    }

    public void setCNameAndLastName(String CNameAndLastName) {
        this.CNameAndLastName = CNameAndLastName;
    }

    public String getEmail() {
        return CEmail;
    }

    public void setEmail(String email) {
        CEmail = email;
    }

    public String getPassword() {
        return CPassword;
    }

    public void setPassword(String password) {
        CPassword = password;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public boolean getLoginStatus() {
        return CLoginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        CLoginStatus = true;
        CLoginStatus = loginStatus;

    }

    public void register(String email, String password, String CNameAndLastName, String Tel) {
        CEmail = email;
        CPassword = password;
        this.CNameAndLastName = CNameAndLastName;
        this.Tel = Tel;
    }

    public void login(String email, String password) {
        CEmail = email;
        CPassword = password;
    }

    public void Search() {

    }

    public void orderFood(String SName, String FoodName) {
        
    }

    public int getQueue(int cusQ, int nowQ, int resQ) {
        return getQueue(cusQ, nowQ, resQ);
    }
}