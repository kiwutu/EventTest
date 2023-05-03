package ru.kiwutu.eventtest.data.API;


public class APIConfig {

    public static final String HOST_URL = "https://kudago.com/";

    public static final String LOCATION = "ekb";
    public static final String ACTUAL_SINCE = String.valueOf(System.currentTimeMillis()/1000);
    public static final String ACTUAL_UNTIL = String.valueOf(System.currentTimeMillis()/1000 +604800);
    public static final String FIELDS_EVENT = "title,dates,place,location,description,categories,price,images,age_restriction,is_free,participants";
    public static final String FIELDS_PLACE="id,address";
    public static final String PAGE_SIZE = "50";
    public static final String CATEGORIES = "concert,entertainment,party,tour,education,exhibition,festival,kids,quest,theater,yarmarki-razvlecheniya-yarmarki,other,cinema";
    public static final String LANG = "ru";

}
