public class SmartWatch extends SmartDevices {
  boolean formCircle;
  String batteryType;
  double maxBatteryTime;

  public SmartWatch() {
  }

  public SmartWatch(boolean formCircle, String batteryType, double maxTimeBattery, String modDevice, String displayTipe,
      String batterytipe, double maxBatteryTime, String colorDv,
      double displaySize, Boolean inStock, int udManufactured, String brandDv, String oSys) {
    super(modDevice, displayTipe, batterytipe, maxTimeBattery, colorDv, displaySize, inStock, udManufactured, brandDv,
        oSys);
    this.formCircle = formCircle;
    this.batteryType = batteryType;
    this.maxBatteryTime = maxBatteryTime;
  }

  @Override
  public String toString() {
    String sDv = super.toString();// sDv
    return "SmartWatch [formCircle=" + formCircle + ", batteryType=" + batteryType + ", maxTimeBattery="
        + maxTimeBattery
        + "]" + sDv;
  }
}
