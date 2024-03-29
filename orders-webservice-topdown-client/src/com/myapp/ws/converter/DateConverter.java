package com.myapp.ws.converter;



import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;



public class DateConverter 
{

	public static LocalDate parse(String rawValue){
		if(StringUtils.isBlank(rawValue)){
		return null;
		}
		try{
		return new LocalDate(rawValue);
		}catch(IllegalArgumentException ex){
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
