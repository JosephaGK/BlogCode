package proxy.dynamicproxy.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		this.target = target;
	}

	/**
	 *
	 * @param proxy 被代理对象
	 * @param method 被代理对象的方法
	 * @param args 方法参数
	 * @return
	 * @throws Throwable
	 */
	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("汽车开始行驶时间:"+ System.currentTimeMillis());
		method.invoke(target);
		System.out.println("汽车结束行驶时间:"+ System.currentTimeMillis());
		return null;
	}
}
