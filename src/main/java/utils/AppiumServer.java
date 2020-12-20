package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppiumServer {


    //Appium Launch on Windows
    private static Process process;

    /*
    Calling the node.exe and appium.js
    which node
    which appium
     */
    private static String STARTSERVER = "/usr/local/bin/node /usr/local/bin/appium";


    //Starting the Appium Server
    public static void start() throws IOException, InterruptedException {

        Runtime runtime = Runtime.getRuntime();
        process = runtime.exec("appium -a 127.0.0.1 -p 4725");
        //process = runtime.exec(STARTSERVER);

        Thread.sleep(7000);

        if (process != null) {

            System.out.println("Appium server started");

        }

    }


    //Stopping the Appium Server
    public static void stop() throws IOException {

        if (process != null) {

            process.destroy();

        }

        System.out.println("Appium server stopped");

    }

    //Kill port
    public static void killPort() {
        String s = null;
        try {

            // Process provides control of native processes started by ProcessBuilder.start and Runtime.exec.
            // getRuntime() returns the runtime object associated with the current Java application.
            Process p = Runtime.getRuntime().exec("kill $(lsof -t -i :4725)");

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            System.exit(0);
        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }


}
