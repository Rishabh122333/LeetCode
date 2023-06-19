class RandomizedSet {
    
    List<Integer> list;
    HashMap<Integer,Integer> map;
    Random r;

    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
        r=new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int idx=map.get(val);
        map.remove(val);
        if(idx==list.size()-1)
        {
            list.remove(list.size()-1);
            return true;
            
        }
        
        list.set(idx,list.get(list.size()-1));
        list.remove(list.size()-1);
        map.put(list.get(idx),idx);
        return true;
    }
    
    public int getRandom() {
        int idx=r.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */