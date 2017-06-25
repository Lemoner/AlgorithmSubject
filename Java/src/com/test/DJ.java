package com.test;

import java.util.Scanner;

public class DJ {

	static int C;//����
	static int F;//·����
	static int CD;//�����С
	static int D[][];//Ȩֵ

	static int dist[];//���·��
	static int prev[];//

	static int MAX = 100001;
	static int mindist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			C = sc.nextInt();
			F = sc.nextInt();

			CD = C + 1;//�������飬��С��һ

			D = new int[CD][CD];

			for (int i = 0; i < CD; i++) {
				for (int j = 0; j < CD; j++) {
					D[i][j] = -1;//��ʼ����ֵΪ-1
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

			System.out.println(dist[C]);//���1����β����̾���

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

			S[i] = 0;//�Ƿ񱻱�������0δ������1�ѱ���
		}

		dist[v0] = 0;
		prev[v0] = v0;
		S[v0] = 1;

		for (int i = 2; i <= C; i++) {
			mindist = MAX;//��С��ֵ

			for (int j = 1; j <= C; j++) {
				if ((S[j] == 0) && dist[j] < mindist) {//���ҵ�ǰ�ٽӵ�֮�������̵ĵ�
					u = j;
					mindist = dist[j];
				}
			}

			S[u] = 1;//��õ��ѷ���

			for (int j = 1; j <= C; j++) {
				if ((S[j] == 0) && dist[u] + D[u][j] < dist[j] && u != j && D[u][j] >= 0) {//����δ���ʽڵ㣬������С���ҵ����֮��Ҫ�бߵĴ���
					dist[j] = dist[u] + D[u][j];//������̾���
					prev[j] = u;
				}
			}

			if (u == C) {//����ֻ������㵽�յ�ľ��룬���е��������յ�ʱ��������ѭ��
				break;
			}

		}

	}

}
