package joseph.study.springmvc.argumentsresolver;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Joseph
 */
@Data
public class CustomDataBinding implements Serializable {
	private String name;
	private String age;
}
