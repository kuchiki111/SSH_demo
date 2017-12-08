package test;

/**
 * Created by IntelliJ IDEA.
 * User: kuchi
 * Date: 2017/12/8
 * Time: 10:47
 */

public class TestServer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void hello()
    {
        System.out.println("hello "+ getName());
    }
}
