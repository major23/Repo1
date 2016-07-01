

package com.nikos.Start;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nikos.Pack1.Test1;
import com.nikos.Pack2.Test2;

/**
 * @author nikos
 */
class Start {

    /**Main class.
     * @param args
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
    	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classLoader.getResourceAsStream("app.properties");
		Properties properties = new Properties();
		properties.load(stream);
		String s = properties.getProperty("var1");
    	System.out.println(s);
    	
    	
    	
    	
    	Test1 a = new Test1();
        a.show();
        Test2 b = new Test2();
        b.show();
    }

}
