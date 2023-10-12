package com.java8;
import java.io.*;
import javax.script.*;

public class AllDemos {
	public static void main(String[] args) throws Exception{
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		ee.eval("print('adlsfjfs');");
		
	}
}
