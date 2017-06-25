package com.test;

import java.util.Scanner;

public class DJ {

	static int C;//点数
	static int F;//路径数
	static int CD;//数组大小
	static int D[][];//权值

	static int dist[];//最短路径
	static int prev[];//

	static int MAX = 100001;
	static int mindist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			C = sc.nextInt();
			F = sc.nextInt();

			CD = C + 1;//开辟数组，大小加一

			D = new int[CD][CD];

			for (int i = 0; i < CD; i++) {
				for (int j = 0; j < CD; j++) {
					D[i][j] = -1;//初始所有值为-1
				}
			}

			for (int i = 0; i < F; i++) {
				int a, b, c;
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				D[a][b] = c;
			}

			dist = new int[CD];
			prev = new int[CD];

			Dijkstra(1);

			System.out.println(dist[C]);//输出1到结尾的最短距离

		}

	}

	private static void Dijkstra(int v0) {
		// TODO Auto-generated method stub

		int S[] = new int[CD];
		int u = v0;

		for (int i = 1; i <= C; i++) {

			if (D[v0][i] >= 0 && i != v0) {
				dist[i] = D[v0][i];
				prev[i] = v0;
			} else {
				dist[i] = MAX;
				prev[i] = 0;
			}

			S[i] = 0;//是否被遍历过，0未遍历，1已遍历
		}

		dist[v0] = 0;
		prev[v0] = v0;
		S[v0] = 1;

		for (int i = 2; i <= C; i++) {
			mindist = MAX;//最小初值

			for (int j = 1; j <= C; j++) {
				if ((S[j] == 0) && dist[j] < mindist) {//查找当前临接点之间距离最短的点
					u = j;
					mindist = dist[j];
				}
			}

			S[u] = 1;//设该点已访问

			for (int j = 1; j <= C; j++) {
				if ((S[j] == 0) && dist[u] + D[u][j] < dist[j] && u != j && D[u][j] >= 0) {//查找未访问节点，距离最小，且点跟点之间要有边的存在
					dist[j] = dist[u] + D[u][j];//更新最短距离
					prev[j] = u;
				}
			}

			if (u == C) {//由于只是求起点到终点的距离，所有当遍历到终点时，就跳出循环
				break;
			}

		}

	}

}
