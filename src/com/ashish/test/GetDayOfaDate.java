package com.ashish.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	static Calendar calender = Calendar.getInstance();

	public static String findDay(int month, int day, int year) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "SUNDAY");
		map.put(2, "MONDAY");
		map.put(3, "TUESDAY");
		map.put(4, "WEDNESDAY");
		map.put(5, "THURSDAY");
		map.put(6, "FRIDAY");
		map.put(7, "SATURDAY");


		String input_date = String.valueOf(month) + "/" + String.valueOf(day) + "/" + String.valueOf(year);
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		try {
			date = format.parse(input_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calender.setTime(date);

		int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);

		return map.get(dayOfWeek);

	}

}

public class GetDayOfaDate {
	public static void main(String[] args) throws IOException, ParseException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);
		System.out.println(res);

		// bufferedWriter.write(res);
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
