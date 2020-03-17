package PA03;

import java.util.List;

public class DynamicProgramming implements Algorithm {
    int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public void solution(Knapsack k, List<Item> list) {
        int capacity = (int) k.getCapacity();
        int n = list.size();
        int m[][] = new int[n + 1][capacity + 1];
        int v[] = new int[n];
        int w[] = new int[n];

        for (int i = 0; i < list.size(); i++) {
            v[i] = (int) list.get(i).getValue();
            w[i] = (int) list.get(i).getWeight();
        }

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0)
                    m[i][j] = 0;
                else if (w[i - 1] <= j)
                    m[i][j] = max(v[i - 1] + m[i - 1][j - w[i - 1]], m[i - 1][j]);
                else
                    m[i][j] = m[i - 1][j];
            }
        System.out.println(m[n][capacity]);
    }

}
