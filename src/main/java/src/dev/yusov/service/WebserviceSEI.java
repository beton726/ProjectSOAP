package src.dev.yusov.service;

import src.dev.yusov.model.Goods;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WebserviceSEI {

    @WebMethod
    String testService();

    @WebMethod
    String sayHello(@WebParam(name = "text") String text);

    @WebMethod
    Goods getGoods();

}