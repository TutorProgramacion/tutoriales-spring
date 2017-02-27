package carmelo.spring.xml;

import java.util.List;
import java.util.Set;

public class ListBean {
    
    private List<String> items;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
    
    private Set<MyBean> beanItems;

    public void setBeanItems(Set<MyBean> beanItems) {
        this.beanItems = beanItems;
    }

    public Set<MyBean> getBeanItems() {
        return beanItems;
    }
    
}
