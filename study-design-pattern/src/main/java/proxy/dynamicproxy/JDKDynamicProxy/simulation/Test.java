package proxy.dynamicproxy.JDKDynamicProxy.simulation;

import proxy.staticproxy.Moveable;

public class Test {
	public static void main(String[] arg) throws Exception {
		Object o = JDKDynamicProxySimulation.newProxyInstance(Moveable.class);
	}
}
