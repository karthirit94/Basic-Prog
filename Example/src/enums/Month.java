package enums;

public enum Month {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),JUL(7),AUG(8),SEP(9),OCT(10),NOV(11),DEC(12),DATA_NOT_FOUND(13);

	private int monthNumber;

	public int getMonthNumber() {
		return monthNumber;
	}

	Month(int i) {
		monthNumber = i;
	}
	
	public static Month value(int monthNumber) {
		Month[] monthData = Month.values();
		for(Month data : monthData) {
			if(data.getMonthNumber() == monthNumber) {
				return data;
			}
		}
		return Month.DATA_NOT_FOUND;
	}
	
	public String test(){
		return "Test";
	}
}
