#include<iostream>
#include<string.h>
const int maxn = 2e6 + 5;
using namespace std;
int max(int a, int b)
{
	if (a > b)
		return a;
	else
		return b;
}
int main()
{
	char s[maxn] = "", g[maxn] = "";
	int n, k, m, x, u, si = -1, p, i;
	cin >> n;
	while (n--)
	{
		cin >> g;
		cin >> k;
		u = strlen(g);
		p = 0;
		while (k--)
		{
			cin >> x;
			p = max(p, x);
			for ( i = p; i < x + u; i++)
				s[i] = g[i - x];
			p = i - 1;
		}
		if (p > si)
			si = p;
	}
	for (int i = 1; i <= si; i++)
		if (s[i])
			cout << s[i];
		else
			cout << 'a';
}
