import org.testng.Assert;
import org.testng.annotations.*;


public class BaseTest {

        private Calculator calc = new Calculator();

        @BeforeMethod
        public void setUp() throws Exception {
            System.out.println("@BeforeMethod");
        }

        @AfterMethod
        public void tearDown() throws Exception {
            System.out.println("@AfterMethod");
        }

        @BeforeGroups
        public void beforeGroups() throws Exception {
            System.out.println("BeforeGroups");
        }

        @AfterGroups
        public void afterGroups() throws Exception {
            System.out.println("@AfterGroups");
        }

        @BeforeClass
        public void beforeClass() throws Exception {
            System.out.println("@BeforeClass");
        }

        @BeforeTest
        public void beforeTest() throws Exception {
            System.out.println("@BeforeTest");
        }

        @AfterTest
        public void afterTest() throws Exception {
            System.out.println("@AfterTest");
        }

        @AfterClass
        public void afterClass() throws Exception {
            System.out.println("@AfterClass");
        }

        @BeforeSuite
        public void beforeSuite() throws Exception {
            System.out.println("@BeforeSuite");
        }

        @AfterSuite
        public void afterSuite() throws Exception {
            System.out.println("@AfterSuite");
        }

        @Test
        public void testSum() throws IllegalArgumentException {
            Assert.assertEquals(0, calc.div(2,3));
            System.out.println("Деление на ноль");
        }
}
