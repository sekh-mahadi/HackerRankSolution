package Easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DynamicArray {
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		List<List<Integer>> computation = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			computation.add(new ArrayList<>());
			System.out.println("ArrayList: " + computation);
		}

		int lastAnswer = 0;
		for (int i = 0; i < queries.size(); i++) {
			List<Integer> q = queries.get(i);

			if (q.get(0) == 1) {
				computation.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));
			} else {
				List<Integer> seq = computation.get((q.get(1) ^ lastAnswer) % n);
				lastAnswer = seq.get(q.get(2) % seq.size());
				result.add(lastAnswer);
			}
		}

		return result;
	}

	public static List<Integer> dynamicArray_2(int n, List<List<Integer>> queries) {
		// Write your code here
		List<List<Integer>> tempSeq = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			tempSeq.add(new ArrayList<>());
		}

		int lastAnswer = 0;

		for (int i = 0; i < queries.size(); i++) {

			if (queries.get(i).get(0) == 1) {
				tempSeq.get((queries.get(i).get(1) ^ lastAnswer) % n).add(queries.get(i).get(2));
			} else {
				int a = queries.get(i).get(2) % tempSeq.get((queries.get(i).get(1) ^ lastAnswer) % n).size();
				lastAnswer = tempSeq.get((queries.get(i).get(1) ^ lastAnswer) % n).get(a);
				result.add(lastAnswer);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("DYNAMIC_ARRAY")));

		String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");
		int n = Integer.parseInt(firstMultipleInput[0]);
		int q = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<List<Integer>>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		List<Integer> result = DynamicArray.dynamicArray(n, queries);
		System.out.println(result);
		bw.write(result.stream().map(Object::toString).collect(Collectors.joining(", ")));

	}
}
