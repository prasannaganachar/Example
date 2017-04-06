
class GenricClass<T> implements Comparable<T> {
    
    private T value;
    private GenricClass<T> nextRef;
     
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public GenricClass<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(GenricClass<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}
