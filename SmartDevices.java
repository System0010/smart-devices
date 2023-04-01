public class SmartDevices {
String modDevice;
String displayTipe;
String batterytipe;
double maxTimeBattery;
String colorDv;
double displaySize;
Boolean inStock;
int udManufactured;
String brandDv;
String oSys;

public SmartDevices(){

}

public SmartDevices(String modDevice, String displayTipe, String batterytipe, double maxTimeBattery, String colorDv,
    double displaySize, Boolean inStock, int udManufactured, String brandDv, String oSys) {
  this.modDevice = modDevice;
  this.displayTipe = displayTipe;
  this.batterytipe = batterytipe;
  this.maxTimeBattery = maxTimeBattery;
  this.colorDv = colorDv;
  this.displaySize = displaySize;
  this.inStock = inStock;
  this.udManufactured = udManufactured;
  this.brandDv = brandDv;
  this.oSys = oSys;
}

@Override
public String toString() {
  return "SmartDevices [modDevice=" + modDevice + ", displayTipe=" + displayTipe + ", batterytipe=" + batterytipe
      + ", maxTimeBattery=" + maxTimeBattery + ", colorDv=" + colorDv + ", displaySize=" + displaySize + ", inStock="
      + inStock + ", udManufactured=" + udManufactured + ", brandDv=" + brandDv + ", oSys=" + oSys + "]";
}




}
