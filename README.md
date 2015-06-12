# DateTimeFormatter

###Formats the time requested based on the provided annotations in the library and Returns the desired output based on the options available.###

###Sample View####

<img src="https://raw.github.com/mike20132013/DateFormatter/master/DateTimeFormatter/sample.png" width="480" height="720" />

###Usage: Simple and Easy###

Import in an eclipse workspace and add this lib to you current project.

Currently for eclipse. Android Studio version will be up soon.

Can be used in simple textviews or also while setting any text value.  Can also be used in the Listviews (Adapters)

**Just add these lines of code where you want to set the date :**

```
DateTimeUtils.formatDate(
sampleDate, 
FormatType.TimeFormats.COMPLETE_TIME_FORMAT_WITH_DAY, 
DateTimeUtils.DateTimeZones.US_Arizona)

```

###Some Description about the code above###

``` sampleDate``` - is a date String : "2015-06-09T19:00:00Z"

``` FormatType.TimeFormats.COMPLETE_TIME_FORMAT_WITH_DAY```  - This returns the complete format of a Date specified. For example : Mon, Jun 08 @ 5:00 PM

``` DateTimeUtils.DateTimeZones.US_Arizona```  -  Specifies the timezone you want your output to be. 
US_Arizona is a default value used in this case. You can output the date in different timezones provided in this library. 

####This is the list of timezones avalilable at the moment :#### 
```
        Pacific_Midway = "Pacific/Midway";
        US_Hawaii = "US/Hawaii";
        US_Alaska = "US/Alaska";
        US_Pacific = "US/Pacific";
        America_Tijuana = "America/Tijuana";
        US_Arizona = "US/Arizona";
        America_Chihuahua = "America/Chihuahua";
        US_Mountain = "US/Mountain";
        America_Guatemala = "America/Guatemala";
        US_Central = "US/Central";
        America_Mexico_City = "America/Mexico_City";
        Canada_Saskatchewan = "Canada/Saskatchewan";
        America_Bogota = "America/Bogota";
        US_Eastern = "US/Eastern";
        US_East_Indiana = "US/East-Indiana";
        Canada_Eastern = "Canada/Eastern";
        America_Caracas = "America/Caracas";
        America_Manaus = "America/Manaus";
        America_Santiago = "America/Santiago";
        Canada_Newfoundland = "Canada/Newfoundland";
        Brazil_East = "Brazil/East";
        America_Buenos_Aires = "America/Buenos_Aires";
        America_Godthab = "America/Godthab";
        America_Montevideo = "America/Montevideo";
        Atlantic_South_Georgia = "Atlantic/South_Georgia";
        Atlantic_Azores = "Atlantic/Azores";
        Atlantic_Cape_Verde = "Atlantic/Cape_Verde";
        Africa_Casablanca = "Africa/Casablanca";
        Europe_London = "Europe/London";
        Europe_Berlin = "Europe/Berlin";
        Europe_Belgrade = "Europe/Belgrade";
        Europe_Brussels = "Europe/Brussels";
        Europe_Warsaw = "Europe/Warsaw";
        Africa_Algiers = "Africa/Algiers";
        Asia_Amman = "Asia/Amman";
        Europe_Athens = "Europe/Athens";
        Asia_Beirut = "Asia/Beirut";
        Africa_Cairo = "Africa/Cairo";
        Africa_Harare = "Africa/Harare";
        Europe_Helsinki = "Europe/Helsinki";
        Asia_Jerusalem = "Asia/Jerusalem";
        Europe_Minsk = "Europe/Minsk";
        Africa_Windhoek = "Africa/Windhoek";
        Asia_Baghdad = "Asia/Baghdad";
        Asia_Kuwait = "Asia/Kuwait";
        Europe_Moscow = "Europe/Moscow";
        Africa_Nairobi = "Africa/Nairobi";
        Asia_Tbilisi = "Asia/Tbilisi";
        Asia_Tehran = "Asia/Tehran";
        Asia_Muscat = "Asia/Muscat";
        Asia_Baku = "Asia/Baku";
        Asia_Yerevan = "Asia/Yerevan";
        Asia_Kabul = "Asia/Kabul";
        Asia_Yekaterinburg = "Asia/Yekaterinburg";
        Asia_Karachi = "Asia/Karachi";
        Asia_Calcutta = "Asia/Calcutta";
        Asia_Colombo = "Asia/Colombo";
        Asia_Katmandu = "Asia/Katmandu";
        Asia_Novosibirsk = "Asia/Novosibirsk";
        Asia_Dhaka = "Asia/Dhaka";
        Asia_Rangoon = "Asia/Rangoon";
        Asia_Bangkok = "Asia/Bangkok";
        Asia_Krasnoyarsk = "Asia/Krasnoyarsk";
        Asia_Hong_Kong = "Asia/Hong_Kong";
        Asia_Irkutsk = "Asia/Irkutsk";
        Asia_Kuala_Lumpur = "Asia/Kuala_Lumpur";
        Australia_Perth = "Australia/Perth";
        Asia_Taipei = "Asia/Taipei";
        Asia_Tokyo = "Asia/Tokyo";
        Asia_Seoul = "Asia/Seoul";
        Asia_Yakutsk = "Asia/Yakutsk";
        Australia_Adelaide = "Australia/Adelaide";
        Australia_Darwin = "Australia/Darwin";
        Australia_Brisbane = "Australia/Brisbane";
        Australia_Sydney = "Australia/Sydney";
        Pacific_Guam = "Pacific/Guam";
        Australia_Hobart = "Australia/Hobart";
        Asia_Vladivostok = "Asia/Vladivostok";
        Asia_Magadan = "Asia/Magadan";
        Pacific_Auckland = "Pacific/Auckland";
        Pacific_Fiji = "Pacific/Fiji";
        Pacific_Tongatapu = "Pacific/Tongatapu";

```

