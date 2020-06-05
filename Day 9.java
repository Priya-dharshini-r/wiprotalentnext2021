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
