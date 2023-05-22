public class Queue {
    private int cusQ;
    private int nowQ;
    private int restQ;

    public Queue(int cusQ, int nowQ, int restQ) {
        this.cusQ = cusQ;
        this.nowQ = nowQ;
        this.restQ = restQ;
    }

    public int getCusQ() {
        return cusQ;
    }

    public void setCusQ(int cusQ) {
        this.cusQ = cusQ;
    }

    public int getNowQ() {
        return nowQ;
    }

    public void setNowQ(int nowQ) {
        this.nowQ = nowQ;
    }

    public int getRestQ() {
        return restQ;
    }

    public void setRestQ(int restQ) {
        this.restQ = restQ;
    }
}
