package hw6335;
public class AuditMinor
{
    public boolean mathMinor(int[] mathCourses, int[] statCourses)
    {
        boolean minorSatisfied = false;
        boolean math151 = false;
        boolean math152 = false;
        boolean math251 = false;
        boolean math260 = false;
        int electives = 0;
        for (int c = 0; c < mathCourses.length; c++)
        {
            if (mathCourses[c] == 151)
                math151 = true;
            else if (mathCourses[c] == 152)
                math152 = true;
            else if (mathCourses[c] == 251)
                math251 = true;
            else if (mathCourses[c] == 260)
                math260 = true;
            else if (mathCourses[c] == 252)
                electives++;
            else if (mathCourses[c] == 300)
                electives++;
            else if (mathCourses[c] == 321)
                electives++;
            else if (mathCourses[c] >= 400)
                electives++;
        }
        for (int c = 0; c < statCourses.length; c++)
        {
            if (statCourses[c] >= 300)
                electives++;
        }
        if (   math151
            && math152
            && math251
            && math260
            && (electives >= 2) )
            minorSatisfied = true;
        return minorSatisfied;
    }
    //bug need to test 126 and 151 independently
    public boolean statMinor(int[] mathCourses, int[] statCourses){
        boolean minorSatisfied = false;
        boolean math126Satisfied = false;
        boolean math151Satisfied = false;
        int mathHours = 0;
        int statHours = 0;
        int totalHours = 0;
        for(int i = 0; i < mathCourses.length; i++){
            if (mathCourses[i] == 126){
                mathHours++;
                math126Satisfied = true;
            }
            else if (mathCourses[i] == 151){
                mathHours++;
                math151Satisfied = true;
            }
            mathHours++;
        }
        for (int i = 0; i < statCourses.length; i++){
            statHours++;
        }
        totalHours = mathHours + statHours;
        if (statHours >= 4 && math126Satisfied == true
        				   && math151Satisfied == true
                           && totalHours >= 6){
            minorSatisfied = true;
        }
            
        return minorSatisfied;
   }
    public boolean mediaStudiesMinor(int[] comsCourses)
    {
        boolean minorSatisfied = false;
        boolean coms130 = false;
        boolean coms335 = false;
        boolean coms400 = false;
        int electives = 0;
        for (int i = 0; i < comsCourses.length; i++)
        {
            if (comsCourses[i] == 130)
                coms130 = true;
            else if(comsCourses[i] == 335)
                coms335 = true;
            else if(comsCourses[i] == 400)
                coms400 = true;
            else if(comsCourses[i] >= 200 && !(comsCourses[i] == 130)&& !(comsCourses[i] == 335)&& !(comsCourses[i] == 400))
                electives ++;
        }
        
        if(coms130 && coms335 && coms400 && (electives >= 3))
            minorSatisfied = true;
        return minorSatisfied;
    }
}