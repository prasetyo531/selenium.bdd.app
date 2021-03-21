package emulator;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class RunEmulator {

    private static Process process;
    Runtime runtime = Runtime.getRuntime();

    @Test
    public void runEmulator() throws IOException, InterruptedException {
        //java runtime exec in directory
        File dir = new File("/Users/fdn-prasetyo/Library/Android/sdk");
        process = runtime.exec("emulator -avd Pixel_2_XL_API_29", null, dir);
        process = runtime.exec("adb devices");
        System.out.println("emulator is up");

        process = runtime.exec("adb devices");
        Thread.sleep(7000);
    }
}
