package org.xspring.tutorial.guava;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * <p>Title: GuavaTutorialApplication</p>
 * <p>Description:</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: chenzhian </p>
 * <p>@Date: 2018/7/23 下午2:42</p>
 */
public class GuavaTutorialApplication {
    public static void main(String[] args) {
        BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        ClassPathResource resource = new ClassPathResource("bean.xml");

        reader.loadBeanDefinitions(resource);

        String str = (String) ((DefaultListableBeanFactory) beanFactory).getBean("demo_str");
        System.out.println("str bean:" + str);
    }
}