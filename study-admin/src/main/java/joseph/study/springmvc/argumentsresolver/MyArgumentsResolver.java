package joseph.study.springmvc.argumentsresolver;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author Joseph
 */
public class MyArgumentsResolver implements HandlerMethodArgumentResolver {
	//解析器是否支持当前参数
	@Override public boolean supportsParameter(MethodParameter methodParameter) {
		// 指定参数如果被应用MyParam注解，则使用该解析器。
		return methodParameter.hasParameterAnnotation(MyParam.class);
		// 如果直接返回true，则代表将此解析器用于所有参数
		//return false;
	}

	@Override public Object resolveArgument(MethodParameter methodParameter,
			ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest,
			WebDataBinderFactory webDataBinderFactory) throws Exception {
		Class<?> parameterType = methodParameter.getParameterType();


		return null;
	}
}
