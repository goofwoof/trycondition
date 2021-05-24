package com.twtest.trycondition.testBean.BeanOne;

import com.twtest.trycondition.condition.ItestInterfaceCondition;
import com.twtest.trycondition.testBean.BeanTwo.ItestInterface1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ItestInterfaceCondition.class)
public class InterfaceImplA implements ItestInterface{
    @Autowired
    ItestInterface1 itestInterface1;

    public String introduceSelf() {
        return "My name is Impl A.".concat(itestInterface1.introduceSelf());
    }
}
