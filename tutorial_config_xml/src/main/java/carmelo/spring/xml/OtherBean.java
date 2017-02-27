package carmelo.spring.xml;

public class OtherBean {
    
    private MyBean myBean;

    public OtherBean() {
    }

    public OtherBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

}
