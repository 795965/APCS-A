
/**
 * Quiz Strings Corrections
 *
 * @author (Ziggy Sheynin)
 * @version (Quiz Corrections on 1029)
 */
public class corrections
{
    //Question 2- What will be returned by call go(5)
    public static String go(int x){
        if (x==5 && x> 6){
            return "same";
        } else if (x==5 || x> 6){
            return "notsame";}
        return "done";
    }
    //returns B- notsame
    
}
