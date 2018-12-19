package joseph.study.international;

import java.util.Locale;

public class LocaleTest {
	public static void main(String[] arg){
		Locale locale = Locale.getDefault();
		System.out.println(locale.getCountry());
	}

}
