public class SmartPhone extends SmartDevices{
  boolean dualSim;
  String cameraType;
  double pxCam;

  public SmartPhone(){

  }

  public SmartPhone(boolean dualSim, String cameraType, double pxCam, String modDevice, String displayTipe, String batterytipe, double maxTimeBattery, String colorDv,
  double displaySize, Boolean inStock, int udManufactured, String brandDv, String oSys) {
    super(modDevice, displayTipe, batterytipe, maxTimeBattery, colorDv, displaySize, inStock, udManufactured, brandDv, oSys);//
    this.dualSim = dualSim;
    this.cameraType = cameraType;
    this.pxCam = pxCam;
  }

  @Override
  public String toString() {
    String superDv = super.toString();
    return "SmartPhone [dualSim=" + dualSim + ", cameraType=" + cameraType + ", pxCam=" + pxCam + "]" + superDv;
  }
}
