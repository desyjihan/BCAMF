package BCAMF.utils;

public enum TestScenarios {

	T1("User go to Dashboard Home"),
	T2("Click expertise trainings"),
	T3("Click expertise tools"),
	T4("Click company 1"),
	T5("Click company 2"),
	T6("Click company 3"),
	T7("Click company 4"),
	T8("Click company 5"),
	T9("Click company 6"),
	T10("Click company 7"),
	T11("Click company 8"),
	T12("Click company 9"),
	
	T13("Click training1"),
	T14("Click training1 linkedin"),
	T15("Click Home"),
	
	T16("Click training2"),
	T17("Click training slide sebelum"),
	T18("Click training slide sesudah"),
	T19("Click fullscreen"),
	T20("Click share"),
	T21("Click training course content"),
	T22("Click training joining benefits"),
	T23("Click training batch schedule"),
	T24("Click Home"),
	
	T25("Click training3"),
	T26("Click training slide sebelum"),
	T27("Click training slide sesudah"),
	T28("Click fullscreen"),
	T29("Click share"),
	T30("Click training course content"),
	T31("Click training joining benefits"),
	T32("Click training batch schedule"),
	T33("Click Home"),
	
	T34("Click training4"),
	T35("Click training slide sebelum"),
	T36("Click training slide sesudah"),
	T37("Click fullscreen"),
	T38("Click share"),
	T39("Click training course content"),
	T40("Click training joining benefits"),
	T41("Click training batch schedule"),
	T42("Click Home"),;
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
