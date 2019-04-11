package proxy.dynamicproxy.CGLIBDynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();

	/**
	 * 此方法根据传入参数创建代理类
	 * @param clazz
	 * @return
	 */
	public Object getProxy(Class clazz){
		//设置创建的子类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	/**
	 * 此方法拦截所有目标类方法的调用
	 * @param o 目标类的实例
	 * @param method 目标方法的反射对象
	 * @param objects 方法的参数
	 * @param methodProxy 代理类的实例
	 * @return
	 * @throws Throwable
	 */
	@Override public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
			throws Throwable {
		System.out.println("日志开始.....");
		//代理类调用父类的方法
		methodProxy.invokeSuper(o,objects);
		System.out.println("日志结束.....");
		return null;
	}
}
