import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private Object proxied;

	public ProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("准备工作!");
		
		Object object = method.invoke(proxied, args);
		
		System.out.println("工作结束!");
		
		return object;
	}

}
