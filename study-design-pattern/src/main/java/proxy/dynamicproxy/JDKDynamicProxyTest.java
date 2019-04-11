package proxy.dynamicproxy;

import proxy.dynamicproxy.JDKDynamicProxy.TimeHandler;
import proxy.staticproxy.Car;
import proxy.staticproxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理只能为实现了接口的类进行代理
 * 没有实现接口的类不能使用jdk动态代理
 */
public class JDKDynamicProxyTest{
	public static void main(String[] arg){
		/**
		 * 使用步骤
		 * 1.创建一个实现InvocationHandler的类，实现invoke方法
		 * 2.创建被代理的类
		 * 3.调用Proxy的静态方法，创建一个代理类
		 * 4.通过代理类类调用方法
		 */
		Car car = new Car();
		TimeHandler timeHandler = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader 类加载器
		 * interfaces 实现的接口
		 * h InvocationHandler
		 *
		 * 动态代理实现的思路(通过proxy的newProxyInstance返回代理对象)
		 * 1、声明一段源码(动态产生代理)
		 * 2.编译源码(JDK Compiler API)，产生新的类(代理类)
		 * 3.将这个类load到内存中，产生一个新的对象(代理对象)
		 * 4.return 代理对象
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), timeHandler);
		System.out.println("代理类名称：" + m.getClass().getName());
		m.move();
	}
}
