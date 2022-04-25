// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    List<Integer> list;
    int idx;
    
	public PeekingIterator(Iterator<Integer> iterator) {
        
        idx = 0;
        list = new ArrayList<>();
        while(iterator.hasNext())
            list.add(iterator.next());
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(idx);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	   return  list.get(idx++);
	}
	
	@Override
	public boolean hasNext() {
        if(idx >= list.size()) return false;
        
        return list.get(idx) != null;
	}
}