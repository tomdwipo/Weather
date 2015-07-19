package model;

/**
 * Created by tommy on 7/19/15.
 */
public class Weather {
    public  Place place;
    public String iconData;
    public CurrentCondition currentCondition = new CurrentCondition();
    public Wind wind = new Wind();
    public Snow snow = new Snow();
    public Clouds clouds = new Clouds();

}
