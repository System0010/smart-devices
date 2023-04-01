public class app{

  public static void main(String[] args){
    SmartDevices smartPhone = new SmartPhone(true, "cameraFXF",45.2d,"s22","c1223-disp","litio-a++",3600d,"space-gray",110d,true,300330,"samsumg","android16");
 
    String description = smartPhone.toString();
    System.out.println(description);
  }

  

}