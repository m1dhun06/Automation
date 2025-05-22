package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddFirstProductToCart() {
        HomePage home = new HomePage(driver);
        home.clickFirstProduct();

        ProductPage product = new ProductPage(driver);
        product.addToCart();
    }
}
