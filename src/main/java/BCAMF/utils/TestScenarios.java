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
	
	T13("Click training 1"),
	T14("Click training joining benefits 1"),
	T15("Click training course content 1"),	
	T16("Click training batch schedule 1"),
	T17("Click enroll now weekend batch 1"),
	T18("Click enroll now weekday batch 1"),
	T19("Click enroll now fast track 1"),
	T20("Close Ads2"),
	
	T21("Click training 2"),
	T22("Click training joining benefits 2"),
	T23("Click training course content 2"),
	T24("Click training batch schedule 2"),
	T25("Click enroll now weekend batch 2"),
	T26("Click enroll now weekday batch 2"),
	T27("Click enroll now fast track 2"),
	
	T28("Click training 3"),
	T29("Click training joining benefits 3"),
	T30("Click training course content 3"),
	T31("Click training joining benefits 3"),
	T32("Click training course content 3"),
	T33("Click training batch schedule 3"),
	T34("Click enroll now fast track 3"),
	
	T35("Click training 4"),
	T36("Click training joining benefits 4"),
	T37("Click training course content 4"),
	T38("Click training joining benefits 4"),
	T39("Click training course content 4"),
	T40("Click training batch schedule 4"),
	T41("Click enroll now fast track 4"),
	
	T42("Click training 5"),
	T43("Click training joining benefits 5"),
	T44("Click training course content 5"),
	T45("Click training joining benefits 5"),
	T46("Click training course content 5"),
	T47("Click training batch schedule 5"),
	T48("Click enroll now fast track 5"),

//	T49("Click training 6"),
//	T50("Click training joining benefits 6"),
//	T51("Click training course content 6"),
//	T52("Click training joining benefits 6"),
//	T53("Click training course content 6"),
//	T54("Click training batch schedule 6"),
//	T55("Click enroll now fast track 6"),
//	
//	T56("Click training 7"),
//	T57("Click training joining benefits 7"),
//	T58("Click training course content 7"),
//	T59("Click training joining benefits 7"),
//	T60("Click training course content 7"),
//	T61("Click training batch schedule 7"),
//	T62("Click enroll now fast track 7"),
//	
//	T63("Click training 8"),
//	T64("Click training joining benefits 8"),
//	T65("Click training course content 8"),
//	T66("Click training joining benefits 8"),
//	T67("Click training course content 8"),
//	T68("Click training batch schedule 8"),
//	T69("Click enroll now fast track 8"),
//	
//	T70("Click training 9"),
//	T71("Click training joining benefits 9"),
//	T72("Click training course content 9"),
//	T73("Click training joining benefits 9"),
//	T74("Click training course content 9"),
//	T75("Click training batch schedule 9"),
//	T76("Click enroll now fast track 9"),
	
	T77("Show achieve"),
	
	T78(""),
	T79(""),
	T80(""),
	T81(""),
	T82(""),
	T83(""),
	T84(""),;
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
