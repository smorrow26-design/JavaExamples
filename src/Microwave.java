public class Microwave 
{   //attrubutes
    private String brand;
    private int maxPower;

    public Microwave (String manufacturer, int power)
    {
        brand = manufacturer;
        maxPower = power;
    }
    // Microwave behaviors
    public void spin() // void means it doesn't return anything
    {

    }
    public void spin(boolean spinVal) // can use the same name cause it depends on parameters
    {

    }
    public void cook()
    {

    }
    public void cook(int seconds, int power)
    {
        System.out.println("Cooking for " + seconds + " seconds at " + power + "W.");

    }
    public void cook30()
    {
        cook(30, maxPower);
    }
    public void beep()
    {
        System.out.println("beep, beep Your food is ready :)");
    }
    public void defrost(int time)
    {

    }
    public void defrost(int time, int power)
    {

    }
    // needs this to actually run
    public static void main(String[] args)
    {
        Microwave pizzaWarmer = new Microwave("Samsung", 800);
        pizzaWarmer.cook(45, 400);
        pizzaWarmer.beep();
    }
}
