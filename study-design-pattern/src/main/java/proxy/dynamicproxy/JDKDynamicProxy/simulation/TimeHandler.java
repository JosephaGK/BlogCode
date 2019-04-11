package proxy.dynamicproxy.JDKDynamicProxy.simulation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		this.target = target;
	}

	@Override public void invoke(Object o, Method m) {
		try {
			m.invoke(target);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
