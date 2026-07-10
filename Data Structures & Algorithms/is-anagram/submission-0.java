class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> mapS = new HashMap<>();
        for(char c : s.toCharArray()){
            mapS.put(c,mapS.getOrDefault(c,0)+1);
        }

        HashMap<Character, Integer> mapT = new HashMap<>();
        for(char c : t.toCharArray()){
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }

        for(char c : mapS.keySet()){
            if(!mapT.containsKey(c) || mapT.get(c) != mapS.get(c)){
                return false;
            }
        }

        for(char c : mapT.keySet()){
            if(!mapS.containsKey(c) || mapT.get(c) != mapS.get(c)){
                return false;
            }
        }

        return true;


    }
}
