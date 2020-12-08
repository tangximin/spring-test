package com.tennis.spring;

import com.tennis.spring.config.BaseConfuguration;
import com.tennis.spring.dao.OrderDao;
import com.tennis.spring.entity.UserEntity;
import com.tennis.spring.service.OrderService;
import com.tennis.spring.service.UserService;
import com.tennis.spring.service.impl.OrderServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestApplicationTests {

    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BaseConfuguration.class);
        UserEntity user = annotationConfigApplicationContext.getBean(UserEntity.class);
        System.out.println(user.hashCode());
    }

    @Test
    public void springaop(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContent.xml");
        OrderService service = classPathXmlApplicationContext.getBean(OrderService.class);
        service.add();
    }


    @Test
    public void springannon(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationAnnon.xml");
        UserService service = classPathXmlApplicationContext.getBean(UserService.class);
        service.add();
    }
}
