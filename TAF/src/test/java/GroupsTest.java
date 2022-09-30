import org.testng.annotations.Test;

public class GroupsTest extends BaseTest{
    int a = 6;
    int b = 3;
    int expectedResult = 2;
    @Test (groups = "smoke")
    public void stepb() {System.out.println("stepb...");}

    @Test (groups = "regression")
    public void stepa() {
        System.out.println("stepa...");
    }

    @Test (groups = "regression")
    public void stepd() {System.out.println("stepd...");}

    @Test (groups = {"smoke", "regression"})
    public void stepc() {System.out.println("stepc...");}
}
