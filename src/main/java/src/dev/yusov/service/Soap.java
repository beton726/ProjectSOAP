package src.dev.yusov.service;

import src.dev.yusov.model.Goods;

import javax.jws.WebService;

@WebService(endpointInterface = "src.dev.yusov.service.WebserviceSEI",
            serviceName = "Soap")
public class Soap implements WebserviceSEI{


    @Override
    public String testService() {
        return "Hello from SOAP Webservice!";
    }

    @Override
    public String sayHello(String text) {
        return "Hello to " + text;
    }

    @Override
    public Goods getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Some texts");
        return goods;
    }

}
