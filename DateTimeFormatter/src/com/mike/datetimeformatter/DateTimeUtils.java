package com.mike.datetimeformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import android.util.Log;


/**
 * Created by mickey20142014 on 6/8/2015.
 */
public class DateTimeUtils {

    private static final String TODAY = "Today";
    private static final String TONIGHT = "Tonight";
    private static final String TOMORROW = "Tomorrow";
    public String initCommit;

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String TIME_ZONE = "GMT";

    public static boolean isDateToday(){

        return false;
    }

    public static boolean isDateTomorrow(){

        return false;
    }

    public static boolean wasDateYesterday(){

        return false;
    }

    /**
     * Parsing date to the calendar object with the response and timezone.
     */
    private static Calendar parseDate(String rawResponseDate, String timeZone) throws ParseException {

        SimpleDateFormat simpleDateFormat = null;
        String iso_format = null;

        for (String format : ISO) {

            simpleDateFormat = new SimpleDateFormat(format, Locale.US);
            iso_format = format;

        }

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
        Calendar startDate = null;

        try {

            startDate = Calendar.getInstance();
            startDate.setTime(simpleDateFormat.parse(rawResponseDate));
            startDate.setTimeZone(TimeZone.getTimeZone(timeZone));
            return startDate;

        } catch (ParseException e) {
            Log.e(DateTimeUtils.class.getSimpleName(), "Failed to parse response date : "
                    + rawResponseDate + "..." + "with DATE_FORMAT : " + iso_format);
            throw e;
        }

    }

    public static String formatDate(String rawResponseDate, FormatType.TimeFormats formatType, String timeZone){

        String resultDate = null;
        Calendar currentCalInstance = Calendar.getInstance();
        Calendar tomorrowsCalInstance = Calendar.getInstance();
        tomorrowsCalInstance.add(Calendar.DATE,1);

        Calendar startDate = null;
        try {
            startDate = parseDate(rawResponseDate,timeZone);
        } catch (ParseException e) {
            Log.e(DateTimeUtils.class.getSimpleName(), "Failed to parse response date : "
                    + rawResponseDate + "..." + "with DATE_FORMAT : " + DATE_FORMAT);
        }

        boolean isToday = currentCalInstance.get(Calendar.DAY_OF_YEAR) == startDate.get(Calendar.DAY_OF_YEAR);

        boolean isTonight = isToday && startDate.get(Calendar.HOUR_OF_DAY) >= 16;

        boolean isTomorrow = tomorrowsCalInstance.get(Calendar.DAY_OF_YEAR) == startDate.get(Calendar.DAY_OF_YEAR);

        if(!(isToday || isTomorrow)){

            switch (formatType){
                case DEFAULT: formatType = FormatType.TimeFormats.DEFAULT;break;
                case COMPLETE_TIME_FORMAT: formatType = FormatType.TimeFormats.COMPLETE_TIME_FORMAT;break;
                case COMPLETE_TIME_FORMAT_WITH_DAY: formatType = FormatType.TimeFormats.COMPLETE_TIME_FORMAT_WITH_DAY;break;
                case HOUR_MINUTES: formatType = FormatType.TimeFormats.HOUR_MINUTES;break;
                case TIME_WITH_DAY: formatType = FormatType.TimeFormats.TIME_WITH_DAY;break;
            }

        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatType.getFormat_result(), Locale.getDefault());

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));

        resultDate = simpleDateFormat.format(startDate.getTime());

        if(isTonight){
            return TONIGHT + " , " + resultDate;
        }else if (isToday) {
            resultDate = TODAY + ", " + resultDate;
        } else if (isTomorrow) {
            resultDate = TOMORROW + ", " + resultDate;
        }

        return resultDate;
    }

    public static class DateTimeZones{

        public static final String Pacific_Midway = "Pacific/Midway";
        public static final String US_Hawaii = "US/Hawaii";
        public static final String US_Alaska = "US/Alaska";
        public static final String US_Pacific = "US/Pacific";
        public static final String America_Tijuana = "America/Tijuana";
        public static final String US_Arizona = "US/Arizona";
        public static final String America_Chihuahua = "America/Chihuahua";
        public static final String US_Mountain = "US/Mountain";
        public static final String America_Guatemala = "America/Guatemala";
        public static final String US_Central = "US/Central";
        public static final String America_Mexico_City = "America/Mexico_City";
        public static final String Canada_Saskatchewan = "Canada/Saskatchewan";
        public static final String America_Bogota = "America/Bogota";
        public static final String US_Eastern = "US/Eastern";
        public static final String US_East_Indiana = "US/East-Indiana";
        public static final String Canada_Eastern = "Canada/Eastern";
        public static final String America_Caracas = "America/Caracas";
        public static final String America_Manaus = "America/Manaus";
        public static final String America_Santiago = "America/Santiago";
        public static final String Canada_Newfoundland = "Canada/Newfoundland";
        public static final String Brazil_East = "Brazil/East";
        public static final String America_Buenos_Aires = "America/Buenos_Aires";
        public static final String America_Godthab = "America/Godthab";
        public static final String America_Montevideo = "America/Montevideo";
        public static final String Atlantic_South_Georgia = "Atlantic/South_Georgia";
        public static final String Atlantic_Azores = "Atlantic/Azores";
        public static final String Atlantic_Cape_Verde = "Atlantic/Cape_Verde";
        public static final String Africa_Casablanca = "Africa/Casablanca";
        public static final String Europe_London = "Europe/London";
        public static final String Europe_Berlin = "Europe/Berlin";
        public static final String Europe_Belgrade = "Europe/Belgrade";
        public static final String Europe_Brussels = "Europe/Brussels";
        public static final String Europe_Warsaw = "Europe/Warsaw";
        public static final String Africa_Algiers = "Africa/Algiers";
        public static final String Asia_Amman = "Asia/Amman";
        public static final String Europe_Athens = "Europe/Athens";
        public static final String Asia_Beirut = "Asia/Beirut";
        public static final String Africa_Cairo = "Africa/Cairo";
        public static final String Africa_Harare = "Africa/Harare";
        public static final String Europe_Helsinki = "Europe/Helsinki";
        public static final String Asia_Jerusalem = "Asia/Jerusalem";
        public static final String Europe_Minsk = "Europe/Minsk";
        public static final String Africa_Windhoek = "Africa/Windhoek";
        public static final String Asia_Baghdad = "Asia/Baghdad";
        public static final String Asia_Kuwait = "Asia/Kuwait";
        public static final String Europe_Moscow = "Europe/Moscow";
        public static final String Africa_Nairobi = "Africa/Nairobi";
        public static final String Asia_Tbilisi = "Asia/Tbilisi";
        public static final String Asia_Tehran = "Asia/Tehran";
        public static final String Asia_Muscat = "Asia/Muscat";
        public static final String Asia_Baku = "Asia/Baku";
        public static final String Asia_Yerevan = "Asia/Yerevan";
        public static final String Asia_Kabul = "Asia/Kabul";
        public static final String Asia_Yekaterinburg = "Asia/Yekaterinburg";
        public static final String Asia_Karachi = "Asia/Karachi";
        public static final String Asia_Calcutta = "Asia/Calcutta";
        public static final String Asia_Colombo = "Asia/Colombo";
        public static final String Asia_Katmandu = "Asia/Katmandu";
        public static final String Asia_Novosibirsk = "Asia/Novosibirsk";
        public static final String Asia_Dhaka = "Asia/Dhaka";
        public static final String Asia_Rangoon = "Asia/Rangoon";
        public static final String Asia_Bangkok = "Asia/Bangkok";
        public static final String Asia_Krasnoyarsk = "Asia/Krasnoyarsk";
        public static final String Asia_Hong_Kong = "Asia/Hong_Kong";
        public static final String Asia_Irkutsk = "Asia/Irkutsk";
        public static final String Asia_Kuala_Lumpur = "Asia/Kuala_Lumpur";
        public static final String Australia_Perth = "Australia/Perth";
        public static final String Asia_Taipei = "Asia/Taipei";
        public static final String Asia_Tokyo = "Asia/Tokyo";
        public static final String Asia_Seoul = "Asia/Seoul";
        public static final String Asia_Yakutsk = "Asia/Yakutsk";
        public static final String Australia_Adelaide = "Australia/Adelaide";
        public static final String Australia_Darwin = "Australia/Darwin";
        public static final String Australia_Brisbane = "Australia/Brisbane";
        public static final String Australia_Sydney = "Australia/Sydney";
        public static final String Pacific_Guam = "Pacific/Guam";
        public static final String Australia_Hobart = "Australia/Hobart";
        public static final String Asia_Vladivostok = "Asia/Vladivostok";
        public static final String Asia_Magadan = "Asia/Magadan";
        public static final String Pacific_Auckland = "Pacific/Auckland";
        public static final String Pacific_Fiji = "Pacific/Fiji";
        public static final String Pacific_Tongatapu = "Pacific/Tongatapu";

    }

    private static String[] ISO = new String[] {
            "yyyy-MM-dd",
            "yyyy-MM-dd HH:mm",
            "yyyy-MM-dd HH:mmZ",
            "yyyy-MM-dd HH:mm:ss.SSSZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
    };

}
