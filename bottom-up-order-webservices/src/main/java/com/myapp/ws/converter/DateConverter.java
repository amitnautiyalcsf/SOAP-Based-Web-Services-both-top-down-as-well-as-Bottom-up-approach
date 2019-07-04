package com.myapp.ws.converter;




import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;


public class DateConverter {

public static LocalDate parse(String rawValue) throws ConverterException{
if(StringUtils.isBlank(rawValue)){
return null;
}
try{
return java.time.LocalDate.parse(rawValue)
; }catch(IllegalArgumentException ex){
throw new ConverterException("Unable to parse date: " + rawValue, ex);
}
}

public static String print(LocalDate date){
if(date == null){
return null;
}
return date.toString();
}

}