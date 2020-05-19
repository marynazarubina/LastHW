import org.junit.Assert;
import org.junit.Test;
import pageobjects.BaseTest;
import steps.SignUp;

public class Test1 extends BaseTest {

    SignUp singUp = new SignUp();

    @Test
    public void signUp() throws Exception{
        singUp.navigateToSignUpForm();
        singUp.enterZipCode();
        singUp.enterMainData();
        Assert.assertEquals("Account is created!",singUp.checkThatConfirmationMessageAppears());
    }
}
