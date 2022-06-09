/*
al 0 1 2 3 
hm  0 1 2 3

get index

int i = hm.get(val);
int lval = al.get(al.size()-1);

al.set(i,lval);
al.remove(al.size()-1);

hm.remove(val);
*/

class RandomizedSet {
Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
    List<Integer> al = new ArrayList<>(); 
    Random rand = new Random();
    public RandomizedSet() {
        
        
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
            return false;
        
         hm.put(val,al.size());
         al.add(al.size(),val);
                 // System.out.println("insert random : "+al);

        return true;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)) 
            return false;
int i = hm.get(val);
int lval = al.get(al.size()-1);

al.set(i,lval);
        hm.put(lval,i);
al.remove(al.size()-1);

        
hm.remove(val);
                 // System.out.println("remove : "+al);

        // System.out.println("list: "+al);
 return true;       
    }
    
    public int getRandom() {
         // System.out.println("get random : "+al);
      return  al.get(rand.nextInt(al.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */