package main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Line implements Comparable<Line> {
	private String[] words;

	private Line(String[] words) {
		this.words = words;
	}
	
	public Line(String line) {
		words = line.split("\\s");
	}
	
	public Line circularShift() {
		String[] shiftedWords = new String[words.length];
		System.arraycopy(words, 1, shiftedWords, 0, words.length - 1);
		shiftedWords[words.length - 1] = words[0];
		return new Line(shiftedWords);
	}
	
	@Override
	public String toString() {
		return Arrays.stream(words).collect(Collectors.joining(" "));
	}

	@Override
	public int compareTo(Line o) {
		int min = Math.min(length(), o.length());
		for(int i = 0; i < min; i++) {
			int cr = words[i].compareToIgnoreCase(o.words[i]);
			if(cr != 0) {
				return cr;
			}
		}
		return length() - o.length();
	}
	
	public int length() {
		return words.length;
	}
}
