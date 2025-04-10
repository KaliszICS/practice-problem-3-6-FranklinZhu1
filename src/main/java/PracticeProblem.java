public class PracticeProblem {

	public static int dfs(String[][] arr, int r, int c, int moves) {
		if (r < 0 || c > arr[r].length - 1 || arr[r][c].equals("*")) return 999999; // wall or out of bounds
		if (arr[r][c].equals("F")) return moves; // reached finish
		return Math.min(dfs(arr, r - 1, c, moves + 1), dfs(arr, r, c + 1, moves + 1));
	}

	public static int searchMazeMoves(String[][] arr) {
		int ans = dfs(arr, arr.length - 1, 0, 0);
		if (ans == 999999) ans = -1;
		return ans;
	}

	public static int dfsPathCount(String[][] arr, int r, int c) {
		if (r < 0 || c > arr[r].length - 1 || arr[r][c].equals("*")) return 0;
		if (arr[r][c].equals("F")) return 1;
		return dfsPathCount(arr, r - 1, c) + dfsPathCount(arr, r, c + 1);
	}

	public static int noOfPaths(String[][] arr) {
		return dfsPathCount(arr, arr.length - 1, 0);
	}
	
}
