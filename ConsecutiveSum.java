package nit;

import java.util.Scanner;

public class ConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner(System.in);
			int tests = scanner.nextInt();
			for(int l = 0; l < tests; l++)
			{
				int n = scanner.nextInt();
				int k = scanner.nextInt();
				long[] numbers = new long[n];

				for(int i = 0; i < n; i++)
				{
					numbers[i] = scanner.nextLong();
				}

				long[] prefixModCount = new long[k];
				for(int i = 0; i < k; i++)
				{
					prefixModCount[i] = 0;
				}
				prefixModCount[0] = 1;

				int prefixSum = 0;
				for(int i = 0; i < numbers.length; i++)
				{
					prefixSum += numbers[i];
					prefixSum %= k;
					prefixModCount[prefixSum] += 1;
				}

				long result = 0;
				for(int mod = 0; mod < k; mod++)
				{
					result += prefixModCount[mod] * (prefixModCount[mod] - 1) / 2;
				}
				System.out.println(result);
			}

			scanner.close();

	}

}
