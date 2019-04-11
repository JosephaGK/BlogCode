package joseph.study;

public class Test {

	public static void main(String[] args) {
		int icu = stringToAlphabet("AA");
		for (int i = 1; i <= icu; i++) {
			System.out.println(alphabetToString(i));
		}
	}

	/**
	 * 数字转字母字符串
	 * @param i
	 * @return
	 */
	private static String alphabetToString(int i) {
		StringBuffer sb = new StringBuffer();
		int nextBegin = i;
		while (nextBegin>0){
			int j = nextBegin % 26;
			nextBegin = nextBegin/26;
			char s = (char)(j+'A'-1);
			sb.append(s);
		}
		return sb.reverse().toString();
	}

	/**
	 * 字母字符串转数字
	 * @param hex
	 * @return
	 */
	private static int stringToAlphabet(String hex) {
		if(hex.length()==1){
			return hex.charAt(0)-'A'+1;
		}
		int result  = 0;
		//字符串最后一位不使用此计算
		for (int i = 0; i < hex.length()-1; i++) {
			char c = hex.charAt(i);
			result += Math.pow(26,hex.length() - i - 1) * (c - 'A' + 1);
		}
		//计算字符串最后一位
		result+=hex.charAt(hex.length()-1)-'A'+1;
		return result;
	}
}
