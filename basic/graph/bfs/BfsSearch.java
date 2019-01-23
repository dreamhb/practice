public class BfsSearch {

    public void search(int s, int t) {
        if (s == t) {
            return;
        }

        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        Queue<Integer> queue = new LinkedList<>();

        //init
        visited[s] = true;
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        queue.push(s);

        while(queue.size() > 0) {
            int w = queue.poll();

            for (int i = 0; i < graph[w].size; i++) {
                int m = graph[w].get(i);
                if (!visited[m]) {
                    prev[m] = w;
                    if (m == t) {
                        return;
                    }

                    visited[m] = true;
                }

                queue.push(m);
            }
        }
    }
}
