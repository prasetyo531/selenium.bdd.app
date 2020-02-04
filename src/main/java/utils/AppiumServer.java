package utils;

import java.io.IOException;


public class AppiumServer {


    //Appium Launch on Windows
    private static Process process;

    //Calling the node.exe and appium.js
    private static String STARTSERVER = "/usr/local/bin/node /usr/local/bin/appium";




    //Starting the Appium Server

    public static void start() throws IOException, InterruptedException {

        Runtime runtime = Runtime.getRuntime();

        process = runtime.exec(STARTSERVER);

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


}
