/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayclassatclass;

/**
 *
 * @author cstuser
 */
public class Day 
{
    private int dayNumber;
    
    //constructors
    public Day(String dayName)
    {
        dayNumber = fromString(dayName);
    }
    
    private static int fromString (String name)
    {
        switch (name)
        {
            case "SUN": return 0;
            case "MON": return 1;
            case "TUE": return 2;
            case "WED": return 3;
            case "THU": return 4;
            case "FRI": return 5;
            case "SAT": return 6;
            default: return -1;
        }
    }
    
    
    private static String toString (int number)
    {
        switch (number)
        {
            case 0: return "SUN";
            case 1: return "MON";
            case 2: return "TUE";
            case 3: return "WED";
            case 4: return "THU";
            case 5: return "FRI";
            case 6: return "SAT";
            default: return "Error!!!";
        }
    }
    
    public String toSting()
    {
        return toString(dayNumber);
    }
}
