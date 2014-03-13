package zw.hessian.test;

import zw.hessian.service.Hello;

import com.caucho.hessian.client.HessianProxyFactory;

public class Test {

	public static void main(String[] args) throws Exception{
		String url = "http://localhost:8080/hessian/helloService";
		
		HessianProxyFactory factory = new HessianProxyFactory();
		Hello hello = (Hello)factory.create(url);
		
		System.out.println("远程调用结果：" + hello.sayHello());
	}

}
