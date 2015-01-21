package com.paveynganpi.quickweather;

/**
 * Created by paveynganpi on 1/21/15.
 */
public class CurrentWeather {

    private String mIcon;
    private long mTime;
    private double mHimidity;
    private double mTemperature;
    private double mPrecipChance;
    private String mSummary;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getHimidity() {
        return mHimidity;
    }

    public void setHimidity(double himidity) {
        mHimidity = himidity;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
