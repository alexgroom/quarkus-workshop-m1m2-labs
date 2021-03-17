package org.acme.people.utils;

public class Sleep
{
    public static void pause(int sec)
    {
        try
        {
            Thread.sleep(sec);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
