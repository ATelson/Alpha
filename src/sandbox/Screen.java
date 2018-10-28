package sandbox;

public class Screen implements ScreenSpec {

  public String resolution;
  public int refreshRate;
  public int responseTime;


  //Screen(){
    //this.resolution = "Generic";
    //this.refreshRate = 0;
    //this.responseTime = 0;
 // }

  Screen(String resolution, int refreshRate, int responseTime){
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshRate;
  }

  @Override
  public int getResponseTime() {
    return this.responseTime;
  }

  @Override
  public String toString() {
    return "Resolution : " + getResolution() + "\n" + "Refresh Rate : " + getRefreshRate() + "\n"
        + "Response Time : " + getResponseTime();
  }
}
