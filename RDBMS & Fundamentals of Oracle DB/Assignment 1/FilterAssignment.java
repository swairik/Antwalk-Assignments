package day7;

import java.util.*;
import java.util.stream.Collectors;

public class FilterAssignment {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Hello", "Peter", "Doctor", "Octopus", "Big Octopus");
		List<String> ans = l.stream().filter(s -> s.length() > 5 && s.length() < 8).collect(Collectors.toList());
		System.out.println(ans);
	}

}
