import aop.service.PersonServer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eason on 2017/4/27.
 */
public class SpringAOPTest {
    @Test
    public void inteceptorTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        PersonServer bean = (PersonServer)ctx.getBean("PersonServiceImpl");
        bean.save("ceshi");
        bean.update("sa",1);
    }

}
