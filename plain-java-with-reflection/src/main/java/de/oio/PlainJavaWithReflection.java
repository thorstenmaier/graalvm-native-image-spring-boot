package de.oio;

import java.lang.reflect.Method;

public class PlainJavaWithReflection {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Class<?> class1 = Class.forName("de.oio.MyComponent");
		Object instance = class1.newInstance();
		Method method = class1.getMethod("doIt");
		method.invoke(instance);
		
		System.out.println("Max memory:   " + formatSize(Runtime.getRuntime().maxMemory()));
		System.out.println("Total memory: " + formatSize(Runtime.getRuntime().totalMemory()));
		System.out.println("Free memory:  " + formatSize(Runtime.getRuntime().freeMemory()));
		System.out.println("Used memory:  " + formatSize(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
	}
	
    public static String formatSize(long v) {
        if (v < 1024) return v + " B";
        int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
        return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
    }

}
