package com.sc.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateTools {
	
	/**
	 * 将字符的日期转换成java.util.Date
	 * @param format yyyy-MM-dd HH:mm:ss字符格式的日期
	 * @return
	 */
	public static Date parseDate(String format) {
		try {
			if (format != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				return sdf.parse(format);
			}
		} catch (Exception e) {
		}
		return null;
	}
	/**
	 * 将字符的日期转换成java.util.Date
	 * @param format yyyyMMddHHmmss字符格式的日期
	 * @return
	 */
	public static Date parseDate_yyyyMMddHHmmss(String format) {
		try {
			if (format != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				return sdf.parse(format);
			}
		} catch (Exception e) {
		}
		return null;
	}
	/**
	 * 将字符的日期转换成java.util.Date
	 * @param format yyyy-MM-dd字符格式的日期
	 * @return
	 */
	public static Date parseShotDate(String format) {
		try {
			if (format != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				return sdf.parse(format);
			}
		} catch (Exception e) {
		}
		return null;
	}
	
	/**
	 * 按要求格式转换为字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Date date, String format) {
		String result = "";
		try {
			if (date != null) {
				DateFormat df = new SimpleDateFormat(format);
				result = df.format(date);
			}
		} catch (Exception e) {
		}
		return result;
	}
	
	/**
	 * 返回指导日期的年份
	 * @param date
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);		
	}
	
	/**
	 * 返回指定日期的年月份
	 * @param date
	 * @return
	 */
	public static String getYearMonthStr(Date date){
		String yearStr = String.valueOf(getYear(date));
		String monthStr = getMonthStr(date);
		return yearStr + monthStr;
	}
	
	/**
	 * 返回指定日期的月份
	 * @param date
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * 返回指定日期的月份字符串，返回两位数，如：08,11
	 * @param date
	 * @return
	 */
	public static String getMonthStr(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String str = null;
		int month = calendar.get(Calendar.MONTH) + 1;
		if(month < 10){
			str = String.valueOf("0" + month);
		}else{
			str = String.valueOf(month);
		}
		return str;
	}
	
	/**
	 * 返回指定日期的Day
	 * @param date
	 * @return
	 */
	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 返回小时数
	 * @param date
	 * @return
	 */
	public static int getHour(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	/**
	 * 返回分钟数
	 * @param date
	 * @return
	 */
	public static int getMinute(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}
	
	/**
	 * 返回秒数
	 * @param date
	 * @return
	 */
	public static int getSecond(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}
	
	/**
	 * 返回指定日期的yyyy-MM-dd格式字符串
	 * @param date
	 * @return
	 */
	public static String getDate(Date date) {
		return format(date, "yyyy-MM-dd");
	}

	public static String getSingleDate(Date date) {
		return format(date, "yyyyMMdd");
	}
	
	public static String getSingleDate2(Date date) {
		return format(date, "HHmmss");
	}
	
	public static String getSingleDateTime(Date date) {
		return format(date, "yyyyMMddHHmmss");
	}

	/**
	 * 返回指定日期的HH:mm:ss格式字符串
	 * @param date
	 * @return
	 */
	public static String getTime(Date date) {
		return format(date, "HH:mm:ss");
	}
	
	/**
	 * 返回指定日期的yyyy-MM-dd HH:mm:ss格式字符串
	 * @param date
	 * @return
	 */
	public static String getDateTime(Date date) {
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 在指定日期上加n天得到的日期
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date addDate(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime() + ((long) day) * 24 * 3600 * 1000);
		return calendar.getTime();
	}
	/**
	 * 在指定日期上加n天得到的日期
	 * @param date
	 * @param Hour
	 * @return
	 */
	public static Date addHour(Date date, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY,hour);
		return calendar.getTime();
	}

	
	/**
	 * 返回前者比后者晚N天
	 * @param date
	 * @param date1
	 * @return
	 */
	public static int diffDate(Date date,Date date1) {
		return (int) ((date.getTime() - date1.getTime()) / (24 * 3600 * 1000));
	}
	
	/**
	 * 是否是同一年、同一天
	 * @param date
	 * @param date1
	 * @return
	 */
	public static boolean isSameDay(Date date, Date date1) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(date);
		c2.setTime(date1);
		int c1_day = c1.get(Calendar.DAY_OF_YEAR);
		int c1_y = c1.get(Calendar.YEAR);

		int c2_day = c2.get(Calendar.DAY_OF_YEAR);
		int c2_y = c2.get(Calendar.YEAR);
		
		if(c1_day == c2_day && c1_y == c2_y) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 将给定的字符串转为Date类型,
	 * @param dateStr
	 * @return
	 */
	public static Date getDate(String dateStr) {
		String format="";
		if (format == null || "".equals(format)) {
			if(dateStr.length()<=10) {
				format="yyyy-MM-dd";
			}else {
				format="yyyy-MM-dd HH:mm:ss";
			}
		}
		SimpleDateFormat sd=new SimpleDateFormat(format);
		try {
			Date d = sd.parse(dateStr);
			return d;
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 计算相差月份
	 * @param g1
	 * @param g2
	 * @return
	 */
	public static final int getMonths(GregorianCalendar g1, GregorianCalendar g2) {
		int elapsed = 0;
		GregorianCalendar gc1, gc2;
		if (g2.after(g1)) {
			gc2 = (GregorianCalendar) g2.clone();
			gc1 = (GregorianCalendar) g1.clone();
		} else {
			gc2 = (GregorianCalendar) g1.clone();
			gc1 = (GregorianCalendar) g2.clone();
		}

		gc1.clear(Calendar.MILLISECOND);
		gc1.clear(Calendar.SECOND);
		gc1.clear(Calendar.MINUTE);
		gc1.clear(Calendar.HOUR_OF_DAY);
		gc1.clear(Calendar.DATE);

		gc2.clear(Calendar.MILLISECOND);
		gc2.clear(Calendar.SECOND);
		gc2.clear(Calendar.MINUTE);
		gc2.clear(Calendar.HOUR_OF_DAY);
		gc2.clear(Calendar.DATE);

		while (gc1.before(gc2)) {
			gc1.add(Calendar.MONTH, 1);
			elapsed++;
		}
		return elapsed;
	}
    
    /**
     * 后者比前者晚几分钟
     * @param startDate
     * @param endDate
     * @return
     */
    public static long dffMinute(Date startDate, Date endDate){
		long l = endDate.getTime() - startDate.getTime();
		long min = ((l / (60 * 1000)));
		return min;
    	
    }
    
    /**
     * 后者比前者晚几秒
     * @param startDate
     * @param endDate
     * @return
     */
    public static long dffSecond(Date startDate, Date endDate){
		long l = endDate.getTime() - startDate.getTime();
		long min = ((l /1000));
		return min;
    	
    }
	
	public static int getAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) {
            return 0;
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }
	
	/**
	 * 返回指定日期是那个季度:1/2/3/4
	 * @param date
	 * @return
	 */
	public static int getQuarter(Date date) {
		int month = getMonth(date);
		if (month <= 3) {
			return 1;
		} else if ( month > 3 && month <= 6) {
			return 2;
		} else if ( month > 6 && month <= 9) {
			return 3;
		} else if ( month > 9) {
			return 4;
		}
		return 0;
	}
	
	/**
	 * 获得指定日期为当年的第几天
	 * @param date
	 * @return
	 */
	public static int getDayofYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_YEAR);
	}
	
	/**
	 * 获得指定日期为星期几
	 * @param date
	 * @return
	 */
	public static int getDayofWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int index = calendar.get(Calendar.DAY_OF_WEEK);
		if (index == 1) {
			index = 7;
		} else {
			index--;
		}
		return index;
	}
	
	/**
	 * 获得指定日期为星期几
	 * @param date
	 * @return String
	 */
	public static String getDayofWeekString(Date date) {
		int i=getDayofWeek(date);
		String week=null;
		switch (i) {
			case 1:
				week="星期一";
				break;
			case 2:
				week="星期二";
				break;
			case 3:
				week="星期三";
				break;
			case 4:
				week="星期四";
				break;
			case 5:
				week="星期五";
				break;
			case 6:
				week="星期六";
				break;
			case 7:
				week="星期日";
				break;
			default:
				break;
		}
		return week;
	}
	
	
	public static String getStrDayofWeek(Date date) {
		int week = getDayofWeek(date);
		if (week == 1) {
			return "一";
		} else if (week == 2) {
			return "二";
		} else if (week == 3) {
			return "三";
		} else if (week == 4) {
			return "四";
		} else if (week == 5) {
			return "五";
		} else if (week == 6) {
			return "六";
		} else if (week == 7) {
			return "日";
		}
		return null;
	}
	
	/**
	 * 获得指定日期在这一年中是在第几周
	 * @param date
	 * @return
	 */
	public static int getWeekofYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayofweek = getDayofWeek(date);
		int weekofyear = calendar.get(Calendar.WEEK_OF_YEAR);
		int dayofyear = getDayofYear(date);
		if (dayofyear < 8) { // 年首
			
		} else if (dayofyear > 350) { // 年尾
			
		}
		if (dayofweek == 7) {
			weekofyear--;
		}
		return weekofyear;
	}
	
	/**
	 * 返回指定日期的上周一的日期
	 * @param date
	 * @return
	 */
	public static Date getPreMonday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = -7;
		} else if (dayofweek ==2) {
			dayPlus = -8;
		} else if (dayofweek ==3) {
			dayPlus = -9;
		} else if (dayofweek ==4) {
			dayPlus = -10;
		} else if (dayofweek ==5) {
			dayPlus = -11;
		} else if (dayofweek ==6) {
			dayPlus = -13;
		} else if (dayofweek ==7) {
			dayPlus = -13;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date preMonday = currentDate.getTime();
		return preMonday;
	}
	
	/**
	 * 返回指定日期的上周日的日期
	 * @param date
	 * @return
	 */
	public static Date getPreSunday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = -1;
		} else if (dayofweek ==2) {
			dayPlus = -2;
		} else if (dayofweek ==3) {
			dayPlus = -3;
		} else if (dayofweek ==4) {
			dayPlus = -4;
		} else if (dayofweek ==5) {
			dayPlus = -5;
		} else if (dayofweek ==6) {
			dayPlus = -6;
		} else if (dayofweek ==7) {
			dayPlus = -7;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date preSunday = currentDate.getTime();
		return preSunday;
	}
	
	/**
	 * 返回指定日期所在周内周一的日期
	 * @param date
	 * @return
	 */
	public static Date getThisMonday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = 0;
		} else if (dayofweek ==2) {
			dayPlus = -1;
		} else if (dayofweek ==3) {
			dayPlus = -2;
		} else if (dayofweek ==4) {
			dayPlus = -3;
		} else if (dayofweek ==5) {
			dayPlus = -4;
		} else if (dayofweek ==6) {
			dayPlus = -5;
		} else if (dayofweek ==7) {
			dayPlus = -6;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date thisMonday = currentDate.getTime();
		return thisMonday;
	}
	
	/**
	 * 返回指定日期所在周内周周日的日期
	 * @param date
	 * @return
	 */
	public static Date getThisSunday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = 6;
		} else if (dayofweek ==2) {
			dayPlus = 5;
		} else if (dayofweek ==3) {
			dayPlus = 4;
		} else if (dayofweek ==4) {
			dayPlus = 3;
		} else if (dayofweek ==5) {
			dayPlus = 2;
		} else if (dayofweek ==6) {
			dayPlus = 1;
		} else if (dayofweek ==7) {
			dayPlus = 0;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date thisSunday = currentDate.getTime();
		return thisSunday;
	}
	
	/**
	 * 返回指定日期下周一的日期
	 * @param date
	 * @return
	 */
	public static Date getNextMonday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = 7;
		} else if (dayofweek ==2) {
			dayPlus = 6;
		} else if (dayofweek ==3) {
			dayPlus = 5;
		} else if (dayofweek ==4) {
			dayPlus = 4;
		} else if (dayofweek ==5) {
			dayPlus = 3;
		} else if (dayofweek ==6) {
			dayPlus = 2;
		} else if (dayofweek ==7) {
			dayPlus = 1;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date thisMonday = currentDate.getTime();
		return thisMonday;
	}
	
	/**
	 * 返回指定日期下周日的日期
	 * @param date
	 * @return
	 */
	public static Date getNextSunday(Date date) {
		int dayofweek = getDayofWeek(date);
		int dayPlus = 0;
		if (dayofweek == 1) {
			dayPlus = 13;
		} else if (dayofweek ==2) {
			dayPlus = 12;
		} else if (dayofweek ==3) {
			dayPlus = 11;
		} else if (dayofweek ==4) {
			dayPlus = 10;
		} else if (dayofweek ==5) {
			dayPlus = 9;
		} else if (dayofweek ==6) {
			dayPlus = 8;
		} else if (dayofweek ==7) {
			dayPlus = 7;
		}
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(date);
		currentDate.add(GregorianCalendar.DATE, dayPlus);
		Date thisSunday = currentDate.getTime();
		return thisSunday;
	}
	
	public static int getYearPlus() {
		Calendar cd = Calendar.getInstance();
		int yearOfNumber = cd.get(Calendar.DAY_OF_YEAR);// 获得当天是一年中的第几天
		cd.set(Calendar.DAY_OF_YEAR, 1);// 把日期设为当年第一天
		cd.roll(Calendar.DAY_OF_YEAR, -1);// 把日期回滚一天。
		int MaxYear = cd.get(Calendar.DAY_OF_YEAR);
		if (yearOfNumber == 1) {
			return -MaxYear;
		} else {
			return 1 - yearOfNumber;
		}
	}
	
	/**
	 * 得到本年第一天的日期
	 * @return
	 */
	public static Date getCurrentYearFirstDay() {
		int yearPlus = getYearPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, yearPlus);
		Date yearDay = currentDate.getTime();
		return yearDay;
	}
	
	/**
	 * 传入一个Date的数列，先对其进行排序，组装成yyyy-MM-ddyyyy-MM-dd的字符串
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String getDateString(List list){
		String 	putDate="";
		Date d1;
		Date d2;
		Collections.sort(list);
		putDate=DateTools.format((Date)list.get(0), "yyyy-MM-dd");
		for (int i = 0; i < list.size()-1; i++) {
			d1=(Date) list.get(i);
			d2=(Date) list.get(i+1);
			boolean flag=DateTools.addDate(d1,1).getTime()==d2.getTime();
			if(list.size()-2==i){
				if(flag){
					putDate+="——"+DateTools.format(d2, "yyyy-MM-dd")+"\n";
				}else{
					putDate+="——"+DateTools.format(d1, "yyyy-MM-dd")+"\n";
					putDate+=DateTools.format(d2, "yyyy-MM-dd");
					putDate+="——"+DateTools.format(d2, "yyyy-MM-dd")+"\n";
				}
			}else{
				if(!flag){
					putDate+="——"+DateTools.format(d1, "yyyy-MM-dd")+"\n";
					putDate+=DateTools.format(d2, "yyyy-MM-dd");
				}
			}
		}
		if(list.size()==1){
			putDate+="\n";
		}
		return putDate;
	}
	
	/**
	 * 返回指定两这个时间之间的间隔
	 * @return
	 */
	public static Integer intervalDate(Date sd,Date ed){
		return DateTools.getDay(sd)-DateTools.getDay(ed);
	}
	
	/**
	 * 返回当前日期的0点0分0.000秒时间
	 * @return
	 */
	public static Date nowDateFor000000(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milliSecond = cal.get(Calendar.MILLISECOND);
        //时分秒（毫秒数）
        long millisecond = hour*60*60*1000 + minute*60*1000 + second*1000+milliSecond;
        //凌晨00:00:00
        cal.setTimeInMillis(cal.getTimeInMillis()-millisecond);
        return cal.getTime();

	}
	/**
	 * 返回当前日期的23点59分59.999秒时间
	 * @return
	 */
	public static Date nowDateFor235959(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milliSecond = cal.get(Calendar.MILLISECOND);

        //时分秒（毫秒数）
        long millisecond = hour*60*60*1000 + minute*60*1000 + second*1000+milliSecond;
        //天数+1
        cal.add(Calendar.DAY_OF_MONTH,1);
        cal.setTimeInMillis(cal.getTimeInMillis()-millisecond-1);
        return cal.getTime();

	}
	
    /**
     * 获得指定月的第一天的日期
     * @param date
     * @return
     */
    public static Date getFirstDateOfMonth(Date date){
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.set(Calendar.DAY_OF_MONTH,1); // 把日期设置为当月第一天
		return calendar.getTime();
    }
    
    /**
     * 获得指定月的最后一天的日期
     * @param date
     * @return
     */
    public static Date getLastDateOfMonth(Date date){
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.add(Calendar.MONTH, 1); // 月份加一
    	calendar.set(Calendar.DAY_OF_MONTH, 1); // 把日期设置为当月第一天
    	calendar.add(Calendar.DAY_OF_MONTH, -1); // 日期倒数一日,既得到本月最后一天
		return calendar.getTime();
    }
    /**
     * 
     * @param date
     * @return
     * 获取 最近的整点或者30分 的时间
     * 秒，毫秒会被清0
     */
    public static Date getLastHalfOrHour(Date date){
		Calendar cal=Calendar.getInstance();
        cal.setTime(date);
		cal.set(Calendar.MILLISECOND, 0);
		
		int minute=cal.get(Calendar.MINUTE);
		if(minute>=30){
			if(minute-30<60-minute){
				cal.set(Calendar.MINUTE, 30);
			}else if(minute-30>60-minute){
				cal.set(Calendar.MINUTE, 0);
				cal.add(Calendar.HOUR_OF_DAY, 1);
			}else{
				if(cal.get(Calendar.SECOND)>30){
					cal.set(Calendar.MINUTE, 0);
					cal.add(Calendar.HOUR_OF_DAY, 1);
				}else{
					cal.set(Calendar.MINUTE, 30);
				}
			}
		}else{
			if(30-minute<minute){
				cal.set(Calendar.MINUTE, 30);
			}else if(30-minute>minute){	
				cal.set(Calendar.MINUTE, 0);
			}else{
				if(cal.get(Calendar.SECOND)>30){
					cal.set(Calendar.MINUTE, 30);
				}else{
					cal.set(Calendar.MINUTE, 0);
				}
			}
			
		}
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
    }
}
