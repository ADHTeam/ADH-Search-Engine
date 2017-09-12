package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Driver {
	
	private static Line[] getLines() {
		Line[] lines = new Line[0];
		System.out.println("enter lines one after another; enter \'$\' to end:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String rawLine;
			do {
				rawLine = br.readLine().trim();
				if(!rawLine.isEmpty()) {
					if(!rawLine.equals("$")) {
						Line[] lines_ext = new Line[lines.length + 1];
						System.arraycopy(lines, 0, lines_ext, 0, lines.length);
						lines_ext[lines.length] = new Line(rawLine);
						lines = lines_ext;
					}
				} else {
					System.out.println("\nempty lines are not allowed!");
				}
			} while(!rawLine.equals("$"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static void main(String[] args) {
		Line[] inputLines = getLines();
		int allCount = 0;
		for(Line ln : inputLines) {
			allCount += ln.length();
		}
		Line[] allLines = new Line[allCount];
		int j = 0;
		for(int i = 0; i < inputLines.length; i++) {
			Line currentLine = inputLines[i]; 
			allLines[j++] = currentLine;
			for(int __ = 1; __ < currentLine.length(); __++) {
				allLines[j] = allLines[j - 1].circularShift();
				j++;
			}
		}
		System.out.println("===================================================");
		System.out.println("===================[INPUT LINES]===================");
		System.out.println("===================================================");
		for(Line line : inputLines)
			System.out.println(line);
		System.out.println("===================================================");
		System.out.println("====================[ALL LINES]====================");
		System.out.println("===================================================");
		for(Line line : allLines)
			System.out.println(line);
		System.out.println("===================================================");
		System.out.println("================[ALL LINES SORTED]=================");
		System.out.println("===================================================");
		Arrays.sort(allLines);
		for(Line line : allLines)
			System.out.println(line);
	}

}
