import java.util.*;

public class Laptop {
    
    public Integer RAM;
    public Integer DiskSize;
    public String OperatingSystem;
    public String Color;



public Laptop (Integer RAM, Integer DiskSize, String OperatingSystem, String Color){
    
    this.RAM = RAM;
    this.DiskSize= DiskSize;
    this.OperatingSystem = OperatingSystem;
    this.Color = Color;
}

public String getInfo(){
    return String.format ("ОЗУ: %d; Объём ЖД: %d; Операционная система: %s; Цвет: %s" , RAM, DiskSize, OperatingSystem, Color);
}
}
