package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("IPl.xml"));
        PaymentFactory paymentFactory= beanFactory.getBean("PaymentFactory",PaymentFactory.class);
        paymentFactory.Placeorder();

    }
}
