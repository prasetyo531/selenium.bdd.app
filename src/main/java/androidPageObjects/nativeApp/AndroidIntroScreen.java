package androidPageObjects.nativeApp;


import java.io.IOException;

public class AndroidIntroScreen extends ActionBaseAndroid {

    public AndroidIntroScreen() throws IOException {

        super();
    }

    public AndroidIntroScreen openApps() throws IOException, InterruptedException {

        getDriver();
        return new AndroidIntroScreen();
    }

}
