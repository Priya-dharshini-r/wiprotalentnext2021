//

HashMap<Integer,Integer> map = new HashMap<>();
        int pairs = 0;
        for (int i = 0; i < input.length-1; i++) {
            map.put(input[i], input[i]);
        }
        for (int i = 0; i <input.length-1 ; i++) {
            int diff = k - input[i];
            if(map.containsKey(diff)){
                pairs++;
                map.remove(diff);
                map.remove(input[i]);
            }
        }
        return  pairs;
        }

//

int cnt = 0; 
    	int cur_cnt = 0;
    	
    	for(int x=0; x<A.length; x++) {
      	  for(int y=0; y<A[x].length; y++) {
      	     A[x][y] = (int) Math.round(Math.random()); 	  
      	  }
    	}
    	
    	for(int x=0; x<A.length; x++) {
    	  for(int y=0; y<A[x].length; y++) {
    		 if (A[x][y] == 1) {
    			cur_cnt = 0;  
    			cnt = cnt + clean_block(A,x,y, cur_cnt); 	 
    		 }
    	  }
    	}
    	
    	System.out.println(cnt);
    }
   
    public static int clean_block(int[][] A, int x_in, int y_in, int cur_cnt) { 
    	A[x_in][y_in] = 0;
    	if (coordinate_exists(x_in-1,y_in  , A.length, A[0].length) == 1 && A[x_in-1][y_in  ] == 1) {clean_block(A,x_in-1,y_in  ,cur_cnt); cur_cnt = 1;}
    	if (coordinate_exists(x_in+1,y_in  , A.length, A[0].length) == 1 && A[x_in+1][y_in  ] == 1) {clean_block(A,x_in+1,y_in  ,cur_cnt); cur_cnt = 1;}
    	if (coordinate_exists(x_in  ,y_in-1, A.length, A[0].length) == 1 && A[x_in  ][y_in-1] == 1) {clean_block(A,x_in  ,y_in-1,cur_cnt); cur_cnt = 1;}
    	if (coordinate_exists(x_in  ,y_in+1, A.length, A[0].length) == 1 && A[x_in  ][y_in+1] == 1) {clean_block(A,x_in  ,y_in+1,cur_cnt); cur_cnt = 1;}
        
    	return cur_cnt;
    }
    
    public static int coordinate_exists(int x_in, int y_in, int A_x_length, int A_y_length) {
    	if (x_in >= 0 && x_in <= (A_x_length-1) && y_in >= 0 && y_in <= (A_y_length-1)) {
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}
    }

//

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> neigh = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < n; i++)
                neigh.add(new ArrayList<Integer>());
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                neigh.get(u).add(v);
                neigh.get(v).add(u);
            }
            long[] adds = new long[n+1];
            for (int i = 2; i <= n; i++) {
                adds[i] = adds[i-1] + ((long)i)*(i-1);
            }
            ArrayList<Integer> cycles = new ArrayList<Integer>();
            boolean[] vis = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    int clen = 1;
                    vis[i] = true;
                    ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
                    qu.add(i);
                    while (!qu.isEmpty()) {
                        int u = qu.removeFirst();
                        for (int v : neigh.get(u)) {
                            if (!vis[v]) {
                                clen++;
                                qu.add(v);
                                vis[v] = true;
                            }
                        }
                    }
                    cycles.add(clen);
                }
            }
            long ans = 0;
            Collections.sort(cycles);
            int index = 0;
            for (int i = cycles.size()-1; i >= 0; i--) {
                int c = cycles.get(i);
                ans += adds[c];
                index += c-1;
                ans += ((long)c)*(c-1)*(m-index);
            }
            System.out.println(ans);
        }
    }
}
