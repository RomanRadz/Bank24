package common;

public class Config {
	
    /**
     * Specify the browser and platform for test:
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     * */
    public static final String BROWSER_AND_PLATFORM = "MOZILLA_WINDOWS";
    /*** Clean browser cookies after each iteration*/
    public static final Boolean CLEAR_COOKIES = false;
    /*** To keep the browser open after all scenarios/tes*/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /*** To clear reports dir before each run*/
    public static final Boolean CLEAR_REPORTS_DIR = true;

}
