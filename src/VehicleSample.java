
class Car{
    public Car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}
class Honda extends Car{
    public Honda()
    {
        System.out.println("Class Honda");
    }
    public void brand()
    {
        System.out.println("Brand: Honda");
    }
    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }
}
 class Honda800 extends Honda{

    public Honda800()
    {
        System.out.println("Honda Model: 800");
    }
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
        Honda800 obj=new Honda800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
