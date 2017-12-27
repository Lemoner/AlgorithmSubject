package com.test;

import java.util.Scanner;

public class Dijkstra {

	static int C;//����
	static int F;//·����
	static int CD;//�����С
	static long D[][];//Ȩֵ

	static long dist[];//���·��
	static int prev[];//

	static long MAX = 99999999;
	static long mindist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			C = sc.nextInt();
			F = sc.nextInt();

			CD = C + 1;//�������飬��С��һ

			D = new long[CD][CD];

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
				D[b][a] = c;
			}

			dist = new long[CD];
			prev = new int[CD];

			Dijkstra(1);

//			System.out.println(dist[C]);//���1����β����̾���
//			
//			for(int i=0;i<CD;i++){
//				System.out.print(dist[i]+" ");
//			}
//			System.out.println();
//			for(int i=0;i<CD;i++){
//				System.out.print(prev[i]+" ");
//			}
			
			long max,min;
			max=0;
			min=0;
			for(int i=2;i<=C;i++){
				
				if(max<prev[i]){
					max=prev[i];
					min=dist[i];
				}
				else if(max==prev[i]){
					if(min>dist[i]){
						min=dist[i];
					}
				}
			}
			System.out.println(min);


	}

	private static void Dijkstra(int v0) {
		// TODO Auto-generated method stub

		int S[] = new int[CD];
		int u = v0;

		for (int i = 1; i <= C; i++) {

			if (D[v0][i] >= 0 && i != v0) {
				dist[i] = D[v0][i];
			} else {
				dist[i] = MAX;
			}

			S[i] = 0;//�Ƿ񱻱�������0δ������1�ѱ���
			prev[i] = 1;
		}

		dist[v0] = 0;
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
					prev[j] = prev[u]+1;
//					prev[j] = u;
				}
			}

		}

	}

}
