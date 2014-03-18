package zw.hessian.server;

import zw.hessian.service.Hello;

public class HelloImpl implements Hello {
	@Override
	public String sayHello() {
		return "Hello world!";
	}
}
