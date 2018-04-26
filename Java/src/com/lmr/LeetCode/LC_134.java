package com.lmr.LeetCode;

public class LC_134 {
	public int canCompleteCircuit(int[] gas, int[] cost) {

		int count, flag;
		int len = gas.length;
		int[] gc = new int[len];

		for (int i = 0; i < len; i++) {
			gc[i] = gas[i] - cost[i];
		}

		for (int i = 0; i < len; i++) {
			if (gc[i] >= 0) {
				count = gc[i];
				flag = 1;
				for (int j = i + 1; j < len; j++) {
					count += gc[j];
					if (count < 0) {
						flag = 0;
						break;
					}
				}
				if (flag == 1) {
					for (int j = 0; j < i; j++) {
						count += gc[j];
						if (count < 0) {
							flag = 0;
							break;
						}
					}
				}
				if (flag == 1) {
					return i;
				}
			}
		}

		return -1;

	}

	public int canCompleteCircuit1(int[] gas, int[] cost) {

		int start, end, sum;

		start = gas.length - 1;
		end = 0;
		sum = gas[start] - cost[start];

		while (start > end) {
			if (sum >= 0) {
				sum += gas[end] - cost[end];
				end++;
			} else {
				start--;
				sum += gas[start] - cost[start];
			}
		}

		return sum >= 0 ? start : -1;

	}

	public int canCompleteCircuit2(int[] gas, int[] cost) {

		int count;
		int len = gas.length;
		int[] gc = new int[len];

		for (int i = 0; i < len; i++) {
			gc[i] = gas[i] - cost[i];
		}

		for (int i = 0; i < len; i++) {
			if (gc[i] >= 0) {
				count = gc[i];
				for (int j = 1; j < len; j++) {
					count += gc[(i + j) % len];
					if (count < 0) {
						i = i + j;
						break;
					}
				}
				if (count >= 0) {
					return i;
				}
			}
		}

		return -1;

	}
	
	public int canCompleteCircuit3(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            tank = tank + gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                total = total + tank;
                tank = 0;
            }
        }
        return (total + tank < 0) ? -1 : start;
    }


	public static void main(String[] args) {

		LC_134 lc = new LC_134();

		int[] gas = { 6, 1, 5 };
		int[] cost = { 7, 2, 4 };

		System.out.println(lc.canCompleteCircuit2(gas, cost));

	}
}
