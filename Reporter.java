package core.report;

import ru.yandex.qatools.allure.annotations.Step;

/**
 * This class is used for test methods to pass step description that will be
 * included in the Allure reports generated by Jenkins.
 * <br>
 * <b>Example: reportStep("Step number")</b>
 * <b>Example: reportStep("Step number"), "Step descriptions"</b>
 * <br>
 * Created by enamulq on 13/03/2017.
 */
public class Reporter {

    /**
     * Writes the step description in allure report
     *
     * @param stepDesc
     *            :String
     */
    @Step("Step desc: {0}")
    public static void reportStep(String stepDesc){
        // Prints out the value of stepDesc
        System.out.println("Step description: " + stepDesc);
    }

    /**
     * Writes the step description and pass 2nd parameter value in allure report
     *
     * @param stepDesc  :String
     * @param stepNum  :String
     */
    @Step("Step number: {0}, Step desc: {1}")
    public static void reportStep(String stepNum, String stepDesc) throws Exception{
        // Prints out the value of stepNum and stepDesc
        System.out.println("Step number: " + stepNum + ", step description: " + stepDesc);
    }

}