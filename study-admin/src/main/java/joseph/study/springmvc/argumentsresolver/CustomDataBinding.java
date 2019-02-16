package joseph.study.springmvc.argumentsresolver;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomDataBinding implements Serializable {
	private String name;
	private String age;
}
