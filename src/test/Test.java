package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: kuchi
 * Date: 2017/12/8
 * Time: 10:58
 */
public class Test {

    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestServer ts = (TestServer) ac.getBean("testService");
        ts.hello();
    }
}
