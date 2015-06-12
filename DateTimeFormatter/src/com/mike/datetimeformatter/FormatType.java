package com.mike.datetimeformatter;

/**
 * Created by mickey20142014 on 6/9/2015.
 */
public class FormatType {

    /**
     * Time formatter. Select the format you want to display in the view.
     *
     */
    public enum TimeFormats{

        /**
         * Time with day. Eg. Wed, 10:30
         */
        TIME_WITH_DAY("E, h:mm a"),

        /**
         * Complete time format with Month, day and the hours. Eg. Jan 10 @ 10:30
         */
        COMPLETE_TIME_FORMAT("MMM dd @ h:mm a"),

        /**
         * Complete time format with Day, Month, day and the hours. Eg.Tue, Jan 10 @ 10:30
         */
        COMPLETE_TIME_FORMAT_WITH_DAY("E, MMM dd @ h:mm a"),

        /**
         * Time format with day and the hours. Eg. Wed, 10 @ 10:30
         */
        HOUR_MINUTES("E, h:mm a"),

        /**
         * Default Time with Hours and minutes. Eg. 10:30
         */
        DEFAULT("h:mm a");

        private String format_result;

        TimeFormats(String format) {
            this.format_result = format;
        }

        public String getFormat_result(){
            return format_result;
        }

    }

}
