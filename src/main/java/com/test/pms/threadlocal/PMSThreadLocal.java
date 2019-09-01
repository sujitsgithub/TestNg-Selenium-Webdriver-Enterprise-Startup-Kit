package com.test.pms.threadlocal;

public class PMSThreadLocal {

	
		public static final ThreadLocal<PMSAppContext> appThreadLocal = new ThreadLocal<PMSAppContext>();

		public static void set(PMSAppContext context) {
			
			
			appThreadLocal.set(context);
		}

		public static void unset() {
			appThreadLocal.remove();
		}

		public static PMSAppContext get() {
			return (PMSAppContext) appThreadLocal.get();
		}
	}

