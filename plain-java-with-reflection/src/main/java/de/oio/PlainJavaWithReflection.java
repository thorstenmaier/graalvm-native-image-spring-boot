package de.oio;

import java.lang.reflect.Method;

public class PlainJavaWithReflection {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Class<?> class1 = Class.forName("de.oio.MyComponent");
		Object instance = class1.newInstance();
		Method method = class1.getMethod("doIt");
		method.invoke(instance);
	}

}
