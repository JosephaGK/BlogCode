package proxy.staticproxy;

public class StaticProxyTest {
	public static void main(String[] arg){
		Car car = new Car();
		car.move();
		System.out.println("=======================");
		/**
		 * 继承的方式实现的代理，在要扩展的功能存在不同的执行顺序时需要产生大量的子类，
		 */
		ExtendsStaticProxy extendsStaticProxy = new ExtendsStaticProxy();
		extendsStaticProxy.move();
		System.out.println("=======================");
		/**
		 * 聚合的方式实现的代理，可以灵活的修改需要扩展功能的执行顺序
		 */
		AggregationTimeStaticProxy aggregationTimeStaticProxy = new AggregationTimeStaticProxy(car);
		AggregationLogStaticProxy aggregationLogStaticProxy = new AggregationLogStaticProxy(aggregationTimeStaticProxy);
		aggregationLogStaticProxy.move();
		System.out.println("=======================");
		AggregationLogStaticProxy logStaticProxy = new AggregationLogStaticProxy(car);
		AggregationTimeStaticProxy timeStaticProxy = new AggregationTimeStaticProxy(logStaticProxy);
		timeStaticProxy.move();

	}
}
