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

public class HourGlassSum {

	// Hour glass Using 2D array
	public static void hourGlass(int[][] arr) {

		int rows = arr.length;
		int columns = arr[0].length;

		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < rows - 2; i++) {
			for (int j = 0; j < columns - 2; j++) {
				int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1])
						+ (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
				max_sum = Math.max(max_sum, sum);
				// System.out.println("Max Sum:" + max_sum);
			}
		}
		System.out.println("Max Sum: " + max_sum);
	}

	// Hourglass Using ArrayList
	public static int hourGlass(List<List<Integer>> arr) {
		int res = Integer.MIN_VALUE;
		int x[] = new int[] { -1, -1, -1, 0, 1, 1, 1 };
		int y[] = new int[] { -1, 0, 1, 0, -1, 0, 1 };
		for (int i = 1; i < arr.size() - 1; i++) {
			for (int j = 1; j < arr.get(i).size() - 1; j++) {
				int sum = 0;
				for (int k = 0; k < 7; k++) {
					sum += arr.get(i + x[k]).get(j + y[k]);
				}
				res = Math.max(res, sum);
			}
		}
		System.out.println("Max_sum: " + res);
		return res;
	}

	public static int hourGlass_2(List<List<Integer>> arr) {
		int res = Integer.MIN_VALUE;

		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.get(i).size() - 2; j++) {
				int sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2))
						+ (arr.get(i + 1).get(j + 1))
						+ (arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));

				res = Math.max(res, sum);
			}
		}
		System.out.println("Max_sum: " + res);
		 return res;
	}

	public static void main(String[] args) throws IOException {

		// 2D Array
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		HourGlassSum.hourGlass(arr);

		// Hour Glass Using Array List

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<List<Integer>> arrList = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arrList.add(Stream.of(br.readLine().replaceAll("\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		int result = HourGlassSum.hourGlass_2(arrList);
		System.out.println(arrList);

		bw.write(String.valueOf(result));
		bw.newLine();
		br.close();
		bw.close();

	}

}
