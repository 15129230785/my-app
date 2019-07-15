public class MouseFactory
{

    public static IMouse GetHPMouse()
    {
        return new HPMouse();
    }

    public static IMouse GetLenoveMouse()
    {
        return new LenoveMouse();
    }

}
