import java.util.ArrayList;
public class WeatherData
{
    private ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temps)
    {
        temperatures = temps;
    }
    public void cleanData(double lower, double upper)
    { 
        for (int i = 0; i < temperatures.size(); i++)
        {
            double temps = temperatures.get(i);
            if (temp < lower || temp > upper)
            {
                temperatures.remove(i);
            }
        }
    }
    public int longestHeatWave(double threshold)
    { /* to be implemented in part (b) */ }
    
    // There may be instance variables, constructors, and methods that are not shown.
}