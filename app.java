public class app{

  public static void main(String[] args){
    SmartDevices smartPhone = new SmartPhone(true, "cameraFXF",45.2d,"s22","c1223-disp","litio-a++",3600d,"space-gray",110d,true,300330,"samsumg","android16");
    System.out.println(smartPhone);

    SmartDevices smartWatch = new SmartWatch(true, "b221", 4200d, "iwatch2", "disp455", "b221", 4200d, "blue-cream", 2.5d, false, 1093273, "Appple", "IOA3");
    System.out.println("-----------------------------------------------\n************************************************");
    System.out.println(smartWatch);

  }

  

}