import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MainTest extends CoreTestCase {

    @Before
    public void textStartTest(){
        System.out.println("Start test");
    }

    @After
    public void testFinishTest()
    {
        System.out.println("Finish test");
    }

    @Test
    public void firstTest() {
        System.out.println("firstTest");
    }

    @Test
    public void secondTest(){
        System.out.println("secondTest");
    }


}
