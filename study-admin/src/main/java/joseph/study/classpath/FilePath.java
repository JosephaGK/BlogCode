package joseph.study.classpath;

public class FilePath {
	public static void main(String[] arg){
		System.out.println(FilePath.class.getResource(""));
		System.out.println(FilePath.class.getResource("/"));
	}
}
