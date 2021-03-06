// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html


// Key Point's to remember :-

//next() will return the value at current itearator and then increments the iterator (cache the next value)

//hasNext() tells is there any element after the current iterator

//peek() will only return the curr element will not increment the iterator

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr = null ;
    Integer nextVal=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr=iterator;
        if(hasNext())
            nextVal=itr.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
       Integer curr=nextVal;
        if(itr.hasNext())
            nextVal=itr.next();
        else
            nextVal=null;
        return curr;
	    
	}
	
	@Override
	public boolean hasNext() {
	    return nextVal!=null || itr.hasNext();
	}
}