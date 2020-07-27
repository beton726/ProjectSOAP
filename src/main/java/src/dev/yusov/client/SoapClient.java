package src.dev.yusov.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import src.dev.yusov.model.Goods;
import src.dev.yusov.service.WebserviceSEI;

public class SoapClient {

    public static void testSoapClient() {
        String soapServiceUrl = "http://localhost:8080/service/webserviceSEI";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WebserviceSEI.class);
        factoryBean.setAddress(soapServiceUrl);

        WebserviceSEI webserviceSEI = (WebserviceSEI) factoryBean.create();
        Goods result = webserviceSEI.getGoods();
        System.out.println("Result: " + result);
    }

}
