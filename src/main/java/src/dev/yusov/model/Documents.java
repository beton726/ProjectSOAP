package src.dev.yusov.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "document")
public class Documents {

    private int id;
    private String name;
    private List<Goods> goodsList;

    public Documents(){}

    public Documents(int id, String name, List<Goods> goodsList) {
        this.id= id;
        this.name = name;
        this.goodsList = goodsList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

}