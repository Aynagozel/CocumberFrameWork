package com.hrms.utils;

public class APIConstants {

	public static final String GENERATE_TOKEN_URI = "http://166.62.36.207/syntaxapi/generateToken.php";
	
	public static final String CREATE_EMPLOYEE_URI = "http://166.62.36.207/syntaxapi/createEmployee.php";
	
	public static final String GET_ONE_EMPLOYEE_URI = "http://166.62.36.207/syntaxapi/getOneEmployee.php";

	public static final String UPDATE_EMPLOYEE_URI = "http://166.62.36.207/syntaxapi/updateEmployee.php";
	
	public static final String CREATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/createEmployee.json";

	public static final String GENERATE_TOKEN_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/generateToken.json";

	public static final String UPDATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/updateEmployee.json";

	public static final String STORE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/store.json";
	
	public static final String TOKEN_TXT = System.getProperty("user.dir") 
			+ "/src/test/resources/JSONFiles/token.txt";

}
