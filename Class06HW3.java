package Utils;

public class Class06HW3 extends CommonMethods{

    public static void main(String[] args) {
         // develop a function in common methods to select from dropdown(single select) (edited)


        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Call the method to select an option from the dropdown
        selectOptionFromDropdown(driver, "myDropdown", "Option 2");

        driver.quit();
    }
    }

