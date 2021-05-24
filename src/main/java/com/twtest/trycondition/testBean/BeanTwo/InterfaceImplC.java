package com.twtest.trycondition.testBean.BeanTwo;

import com.twtest.trycondition.condition.ItestInterfaceCondition1;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ItestInterfaceCondition1.class)
public class InterfaceImplC implements ItestInterface1 {
    public String introduceSelf() {
        return "My name is Impl C.";
    }
}
