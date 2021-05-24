package com.twtest.trycondition.condition;

import com.twtest.trycondition.testBean.BeanOne.ItestInterface;
import com.twtest.trycondition.testBean.BeanTwo.ItestInterface1;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

public class ItestInterfaceCondition1 implements ConfigurationCondition {
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        /*BeanDefinitionRegistry registry = conditionContext.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        long beanCount = 0;
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanDefinitionName);
            if(beanDefinition.isAbstract()){
                continue;
            }
            if (beanDefinition instanceof ScannedGenericBeanDefinition) {
                ScannedGenericBeanDefinition sgbd = (ScannedGenericBeanDefinition) beanDefinition;
                String[] interfaceNames = sgbd.getMetadata().getInterfaceNames();
                long count = Arrays.stream(interfaceNames).filter(s -> s.endsWith(ItestInterface1.class.getName())).count();
                beanCount += count;
            }
        }
        return beanCount < 2;*/
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        String[] beans = beanFactory.getBeanNamesForType(ItestInterface1.class);
        return beans.length < 2;
    }
}
