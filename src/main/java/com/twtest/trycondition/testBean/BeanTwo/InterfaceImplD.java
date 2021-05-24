package com.twtest.trycondition.testBean.BeanTwo;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImplD implements ItestInterface1 {
    public String introduceSelf() {
        return "My name is Impl D.";
    }
}
