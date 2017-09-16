package main;

public class CircularShift {
	private Line first;
	
	public CircularShift(String first) {
		this.first = new Line(first);
	}
	
	public Line[] generateCircularShifts() {
		Line[] shifts = new Line[] {first};
		for(int i = 1; i < first.length(); i++) {
			Line[] shifts_ext = new Line[shifts.length + 1];
			System.arraycopy(shifts, 0, shifts_ext, 0, shifts.length);
			shifts_ext[shifts.length] = shifts[i - 1].circularShift();
			shifts = shifts_ext;
		}
		return shifts;
	}
}
