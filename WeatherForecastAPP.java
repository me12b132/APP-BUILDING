&lt;RelativeLayout
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:paddingBottom="@dimen/activity_vertical_margin"
 android:paddingLeft="@dimen/activity_horizontal_margin"
 android:paddingRight="@dimen/activity_horizontal_margin"
 android:paddingTop="@dimen/activity_vertical_margin"
 tools:context=".MainActivity"
 android:layout_weight="1"&gt;
 
 &lt;TextView
 android:id="@+id/cityText" 
 style="?android:attr/textAppearanceMedium"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_alignParentLeft="true"&amp;amp;gt;
 &lt;/TextView&gt;
 
 &lt;TextView
 android:id="@+id/temp"
 style="@style/tempStyle"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_below="@id/cityText"
 android:layout_centerHorizontal="true"&gt;
 &lt;/TextView&gt;
 &lt;TextView
 android:id="@+id/unittemp"
 android:layout_width="wrap_content"
 style="?android:attr/textAppearanceMedium"
 android:layout_height="wrap_content"
 android:layout_below="@id/cityText"
 android:layout_toRightOf="@id/temp"
 android:layout_alignBaseline="@id/temp"&gt;
 &lt;/TextView&gt;
 &lt;TextView
 android:id="@+id/skydesc"
 android:layout_width="wrap_content"
 style="?android:attr/textAppearanceMedium"
 android:layout_height="wrap_content"
 android:layout_below="@id/temp"
 android:layout_alignStart="@id/temp"
 android:layout_toRightOf="@id/temp"&gt;
 &lt;/TextView&gt;
 
 &lt;!-- Image weather condition --&gt;
 &lt;ImageView android:id="@+id/condIcon"
 android:layout_height="wrap_content"
 android:layout_width="wrap_content"
 android:layout_alignTop="@id/temp"
 android:layout_toRightOf="@id/temp"/&gt;
 
 &lt;/RelativeLayout&gt;

&lt;android.support.v4.view.ViewPager
 android:id="@+id/pager"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:layout_weight="6" &gt;
 
 &lt;android.support.v4.view.PagerTitleStrip
 android:id="@+id/pager_title_strip"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:layout_gravity="top"
 android:background="#E6E6E6"
 android:paddingBottom="4dp"
 android:paddingTop="4dp"
 android:textColor="#fff" /&gt;
 
&lt;/android.support.v4.view.ViewPager&gt;

{
"cod": "200",
"message": 0.0192,
"city": {
"id": "3169070",
"name": "Rome",
"coord": {
"lon": 12.4958,
"lat": 41.903
},
"country": "Italy",
"population": 0
},
"cnt": 7,
"list": [
{
"dt": 1377774000,
"temp": {
"day": 26.83,
"min": 16.41,
"max": 29.12,
"night": 16.41,
"eve": 24.81,
"morn": 26.83
},
"pressure": 1007.2,
"humidity": 72,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "01d"
}
],
"speed": 0.71,
"deg": 146,
"clouds": 0
},
{
"dt": 1377860400,
"temp": {
"day": 29.84,
"min": 16.8,
"max": 29.84,
"night": 16.8,
"eve": 24.81,
"morn": 17.93
},
"pressure": 1006.68,
"humidity": 50,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "02d"
}
],
"speed": 2.2,
"deg": 235,
"clouds": 8
},
{
"dt": 1377946800,
"temp": {
"day": 29.14,
"min": 14.11,
"max": 29.14,
"night": 14.11,
"eve": 24.08,
"morn": 18.32
},
"pressure": 1005.17,
"humidity": 45,
"weather": [
{
"id": 801,
"main": "Clouds",
"description": "few clouds",
"icon": "02d"
}
],
"speed": 1.56,
"deg": 320,
"clouds": 20
},
{
"dt": 1378033200,
"temp": {
"day": 28.43,
"min": 12.11,
"max": 28.95,
"night": 14.28,
"eve": 23.89,
"morn": 12.11
},
"pressure": 1005.23,
"humidity": 39,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "01d"
}
],
"speed": 1.55,
"deg": 289,
"clouds": 0
},
{
"dt": 1378119600,
"temp": {
"day": 29.83,
"min": 16.02,
"max": 29.83,
"night": 18.86,
"eve": 25.35,
"morn": 16.02
},
"pressure": 1006.57,
"humidity": 32,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "01d"
}
],
"speed": 3.3,
"deg": 292,
"clouds": 0
},
{
"dt": 1378206000,
"temp": {
"day": 27.76,
"min": 19.68,
"max": 27.76,
"night": 19.68,
"eve": 25,
"morn": 20.25
},
"pressure": 1014.89,
"humidity": 0,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "01d"
}
],
"speed": 4.05,
"deg": 298,
"clouds": 0
},
{
"dt": 1378292400,
"temp": {
"day": 27.85,
"min": 19.91,
"max": 27.85,
"night": 19.91,
"eve": 24.78,
"morn": 20.13
},
"pressure": 1017.2,
"humidity": 0,
"weather": [
{
"id": 800,
"main": "Clear",
"description": "sky is clear",
"icon": "01d"
}
],
"speed": 1.91,
"deg": 252,
"clouds": 0
}
]
}

public class DayForecast {
 
  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  public Weather weather = new Weather();
  public ForecastTemp forecastTemp = new ForecastTemp();
  public long timestamp;
 
  public class ForecastTemp {
    public float day;
    public float min;
    public float max;
    public float night;
    public float eve;
    public float morning;
  }
 
  public String getStringDate() {
   return sdf.format(new Date(timestamp));
 }
}

public class WeatherForecast {
 
  private List&lt;DayForecast&gt; daysForecast = new ArrayList&lt;DayForecast&gt;();
 
  public void addForecast(DayForecast forecast) {
    daysForecast.add(forecast);
    System.out.println("Add forecast ["+forecast+"]");
  }
 
  public DayForecast getForecast(int dayNum) {
    return daysForecast.get(dayNum);
  }
}

public static WeatherForecast getForecastWeather(String data) throws JSONException {
 
  WeatherForecast forecast = new WeatherForecast();
 
  // We create out JSONObject from the data
  JSONObject jObj = new JSONObject(data);
 
  JSONArray jArr = jObj.getJSONArray("list"); // Here we have the forecast for every day
 
  // We traverse all the array and parse the data
  for (int i=0; i &amp;amp;lt; jArr.length(); i++) {
    JSONObject jDayForecast = jArr.getJSONObject(i);
 
  // Now we have the json object so we can extract the data 
  DayForecast df = new DayForecast();
 
  // We retrieve the timestamp (dt)
  df.timestamp = jDayForecast.getLong("dt");
 
  // Temp is an object
  JSONObject jTempObj = jDayForecast.getJSONObject("temp");
 
  df.forecastTemp.day = (float) jTempObj.getDouble("day");
  df.forecastTemp.min = (float) jTempObj.getDouble("min");
  df.forecastTemp.max = (float) jTempObj.getDouble("max");
  df.forecastTemp.night = (float) jTempObj.getDouble("night");
  df.forecastTemp.eve = (float) jTempObj.getDouble("eve");
  df.forecastTemp.morning = (float) jTempObj.getDouble("morn");
 
  // Pressure &amp; Humidity
  df.weather.currentCondition.setPressure((float) jDayForecast.getDouble("pressure"));
  df.weather.currentCondition.setHumidity((float) jDayForecast.getDouble("humidity"));
 
  // ...and now the weather
  JSONArray jWeatherArr = jDayForecast.getJSONArray("weather");
  JSONObject jWeatherObj = jWeatherArr.getJSONObject(0);
  df.weather.currentCondition.setWeatherId(getInt("id", jWeatherObj));
  df.weather.currentCondition.setDescr(getString("description", jWeatherObj));
  df.weather.currentCondition.setCondition(getString("main", jWeatherObj));
  df.weather.currentCondition.setIcon(getString("icon", jWeatherObj));
 
  forecast.addForecast(df);
 }
 
 return forecast;
}

public class DailyForecastPageAdapter extends FragmentPagerAdapter {
 
  private int numDays;
  private FragmentManager fm;
  private WeatherForecast forecast;
  private final static SimpleDateFormat sdf = new SimpleDateFormat("E, dd-MM");
 
  public DailyForecastPageAdapter(int numDays, FragmentManager fm, 
                         WeatherForecast forecast) {
   super(fm);
   this.numDays = numDays;
   this.fm = fm;
   this.forecast = forecast;
  }
 
  // Page title
  @Override
  public CharSequence getPageTitle(int position) {
    // We calculate the next days adding position to the current date
    Date d = new Date();
    Calendar gc = new GregorianCalendar();
    gc.setTime(d);
    gc.add(GregorianCalendar.DAY_OF_MONTH, position);
 
    return sdf.format(gc.getTime());
  }
 
  @Override
  public Fragment getItem(int num) {
    DayForecast dayForecast = (DayForecast) forecast.getForecast(num);
    DayForecastFragment f = new DayForecastFragment();
    f.setForecast(dayForecast);
    return f;
  }
 
  /*
   * Number of the days we have the forecast
   */
  @Override
  public int getCount() {
   return numDays;
  }
}

public class DayForecastFragment extends Fragment {
  ...
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
               Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.dayforecast_fragment,
               container, false);
 
     TextView tempView = (TextView) v.findViewById(R.id.tempForecast);
     TextView descView = (TextView) v.findViewById(R.id.skydescForecast);
     tempView.setText( (int) (dayForecast.forecastTemp.min - 275.15) + "-"
            + (int) (dayForecast.forecastTemp.max - 275.15) );
     descView.setText(dayForecast.weather.currentCondition.getDescr());
     iconWeather = (ImageView) v.findViewById(R.id.forCondIcon);
     // Now we retrieve the weather icon
     JSONIconWeatherTask task = new JSONIconWeatherTask();
    task.execute(new String[]{dayForecast.weather.currentCondition.getIcon()});
    return v;
  }
...
}

