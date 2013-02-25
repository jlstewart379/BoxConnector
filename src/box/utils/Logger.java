package box.utils;

import java.io.IOException;

import box.factories.BaseBoxFactory;

public class Logger {

	public static Logger getLogger(Class<BaseBoxFactory> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void info(String string) {
		// TODO Auto-generated method stub
		
	}

	public void error(String string, InstantiationException e) {
		// TODO Auto-generated method stub
		
	}

	public void error(String string, ClassNotFoundException e) {
		// TODO Auto-generated method stub
		
	}

	public void error(String string, IllegalAccessException e) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String string) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDebugEnabled() {
		System.out.println("isDebugEnabledCalled"); 
		return false;
	}

	public void fatal(String string, IOException e1) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String string) {
		// TODO Auto-generated method stub
		
	}



}
