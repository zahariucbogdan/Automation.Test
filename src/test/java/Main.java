import org.openqa.selenium.By;


public class Main {


  //  public static void main(String[] args) throws InterruptedException {
  //     LoginTest loginTest = new LoginTest();

  //     loginTest.loginWithValidData();

  //  }

    public static void main(String[] args) throws InterruptedException {
        WishlistTest wishlistTest = new WishlistTest();

        wishlistTest.addToWishlistTest();

    }


    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
