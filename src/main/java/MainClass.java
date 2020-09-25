import tests.SearchProduct;

public class MainClass {
    public static void main(String... args){
        SearchProduct x = new SearchProduct();
        x.setup();
        x.test_Get_Product();
        x.test_Click_Product();
        x.closeBrowser();
    }

}
