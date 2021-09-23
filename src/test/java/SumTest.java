import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {
    @Test
    public void testSum() {
        Sum obj = new Sum();
        Assert.assertEquals(12, obj.total(7,5));
        System.out.println(obj.total(2,5));
    }
    @Test
    public void sample(){
        System.out.println("help me");
    }

}