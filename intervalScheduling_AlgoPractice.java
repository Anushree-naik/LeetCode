import java.util.*;
import java.lang.*;
import java.io.*;

class activitySelection
{
    //prints maximum numbers of activities done by one single person, one at a time.
    //here n: total number of tasks
    //s[]: start time
    //f[]: finish time

    public static void printMaxActivities(int s[], int f[], int n)
    {
        int i, j;
        System.out.print("following activities are selected: n");

        //consider that the first activity always gets selected 
        i = 0;
        System.out.print(i+"");   

        for(j=1; j<=n; j++)
        {
            //if the other activities have start time greater than the finish time of the previous task, select that task
            if(s[j] >= f[i])
            {
                System.out.print(j+" ");
                i = j;
            } 
        }
    }
    // just to test the program 
    public static void main(String[] args)
    {
        int s[] =  {1, 3, 0, 5, 8, 5}; 
        int f[] =  {2, 4, 6, 7, 9, 9}; 
        int n = s.length; 
        
        printMaxActivities(s, f, n); 
    }
}