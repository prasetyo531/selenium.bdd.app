package sendReport;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

public class curlTelegram {

    /*
    1. different class, so not interupt when running test suite
     */

    private static final String chat_id = "-318709168";
    private static final String cwd = System.getProperty("user.dir");
    //you can check use your bot, by change token t1026051821:AAEuT8g9HHZ1lh-iXUVBAIj34fJQTQn5ccA

    @Test
    public void sendCurlTelegram() throws IOException {

        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        String caption = date.toString();

        String command = "curl -F chat_id=\""+chat_id+"\" -F document=@\""+cwd+"/test-output/cucumber/report.html\" -F caption=\""+caption+"\" https://api.telegram.org/bot1026051821:AAEuT8g9HHZ1lh-iXUVBAIj34fJQTQn5ccA/sendDocument";
        Process process = Runtime.getRuntime().exec(command);
        process.getInputStream();

    }
}
