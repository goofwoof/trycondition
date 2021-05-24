package com.twtest.trycondition.testBean.BeanOne;

import com.twtest.trycondition.testBean.BeanTwo.ItestInterface1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InterfaceImplB implements ItestInterface{
    @Autowired
    ItestInterface1 itestInterface1;

    public String introduceSelf() {
        return "My name is Impl B.".concat(itestInterface1.introduceSelf());
    }
}
