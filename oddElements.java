    /* Returns a set of the Integers that occurred an odd number of times in the input List */
    public Set<Integer> oddElements(List<Integer> input) {

        HashSet<Integer> set = new HashSet<>();
        
        for (Integer i: input) {
            if(set.contains(i)) {
                set.remove(i);    
            } else {
                set.add(i);
            }        
        }

        return set;
    }
