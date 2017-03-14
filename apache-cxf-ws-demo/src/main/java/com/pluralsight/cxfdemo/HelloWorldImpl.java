
package com.pluralsight.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.pluralsight.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sampleMethod(int number) {
		// TODO Auto-generated method stub
		if(number<=20)
		return " Young age";
		else if(number>20 && number<=40)
		return "Middle age";
		else
			return "Old age";
	}
}

