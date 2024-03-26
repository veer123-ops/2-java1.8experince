package veer.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strawtith1numr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> mpIntegers = Arrays.asList(10,20,1,11,12,999,180,11,1261,121,251);
 List<Integer> nuIntegers=mpIntegers.stream().filter(mpIntegerss -> String.valueOf(mpIntegerss).startsWith("1")).collect(Collectors.toList());
 System.out.println(nuIntegers);
	}

}
