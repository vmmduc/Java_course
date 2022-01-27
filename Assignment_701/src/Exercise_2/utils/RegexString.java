package Exercise_2.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
	public String checkPhone(String phone) {
		String reg = "^[0-9]$";
		String reg2 = "\\d{7}";
		Pattern pattern = Pattern.compile(reg);
		Matcher m = pattern.matcher(phone);
		
		Pattern pattern2 = Pattern.compile(reg2);
		Matcher m2 = pattern2.matcher(phone);

		return (!m.matches() && !m2.matches()) ? null : phone;

	}

	public String checkEmail(String email) {

		String reg = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(reg);

		Matcher m = pattern.matcher(email);
		return (!m.matches()) ? null : email;
	}
	
	public String checkDate(String date) {
		String reg ="dd/MM/yyyy";
		SimpleDateFormat sDateFormat = new SimpleDateFormat(reg);
		String result = null;
		try {
			result = sDateFormat.format(date);
		} catch (Exception e) {}
		return (!date.matches(reg)) ? null : result;
	}
	

}
