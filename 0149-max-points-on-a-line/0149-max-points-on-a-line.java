class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3)
            return n;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int max = 0;
            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0 && dy == 0)
                    continue;
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                } else if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }
                String s = dy + "/" + dx;
                map.put(s, map.getOrDefault(s, 0) + 1);
                max = Math.max(map.get(s), max);
            }
            ans = Math.max(ans, max + 1);
        }
        return ans;
    }

    int gcd(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }
}