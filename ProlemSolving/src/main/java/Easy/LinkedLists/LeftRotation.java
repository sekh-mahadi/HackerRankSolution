package Easy.LinkedLists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {

	public static List<Integer> leftRotation(int d, List<Integer> arr) {

		for (int i = 0; i < d; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr.get(0);
			for (j = 0; j < arr.size() - 1; j++) {
				arr.set(j, arr.get(j + 1));
			}
			// First element of array will be added to the end
			arr.set(j, first);
		}
		return arr;

	}

	public static List<Integer> leftRotation_2nd(int d, List<Integer> arr) {
		int n = arr.size();
		System.out.println(n);
		List<Integer> leftRotation = new ArrayList<Integer>(5);
		
		for(int i =0; i<n;i++) {
			leftRotation.add(0);
		}
		
		System.out.println(leftRotation.size());
		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - d) % n;
			Integer element = arr.get(oldIndex);
			leftRotation.set(newIndex, element);
			System.out.println(element);
		}

		return leftRotation;

	}
	
	public static List<Integer> leftRotation_3rd (int d, List<Integer> arr) {
		int n = arr.size();
        List<Integer> leftRotation = new ArrayList<Integer>(n);
        
        for (int oldIndex = 0; oldIndex < n; oldIndex++) {
            int newIndex = (oldIndex + n + d) % n;
            leftRotation.add(arr.get(newIndex));
        }
        return leftRotation;
		
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("LEFT_ROTATION")));
		String[] firstMultipleInput = br.readLine().replaceAll("\s$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);
		int d = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(br.readLine().replaceAll("\s$", "").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = LeftRotation.leftRotation_3rd(d, arr);

		System.out.println(result);

		bw.write(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

		br.close();
		bw.close();
	}

}
