package io.namoosori.java.travelClub.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
	public static String today(String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format((Calendar.getInstance().getTime()));
	}

	// 정적 메서드 오버로딩
	public static String today() {
		return today("yyyy.MM.dd");
	}
}
