package proxy.dynamicproxy;

import proxy.dynamicproxy.CGLIBDynamicProxy.CGLIBProxy;
import proxy.dynamicproxy.CGLIBDynamicProxy.Train;

/**
 * cglib动态代理是针对类实现的代理
 * 实质上是对指定目标类产生一个子类，通过方法拦截所有父类方法的调用
 */
public class CGLIBDynamicProxyTest {
	public static void main(String[] arg){
		CGLIBProxy cglibProxy = new CGLIBProxy();
		Train trainProxy = (Train) cglibProxy.getProxy(Train.class);
		trainProxy.run();
	}
}
