package sandbox;

// The ScreenSpec interface is used to to provide functionality to any product that has a screen.
public interface ScreenSpec {

  //method used to obtain the resolution of the screen
  String getResolution();

  //method used to obtain the refresh rate of the screen
  int getRefreshRate();

  //method used to obtain the response time of the screen
  int getResponseTime();
}
