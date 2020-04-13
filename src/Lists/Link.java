package Lists;

class Link<S> {
    private S link;
    private Link<S> next;

    public Link(S link){
        this.link = link;
    }

    public Link<S> getNext() {
        return next;
    }


    public void setNext(Link<S> next) {
        this.next = next;
    }

    public S getValue(){
        return link;
    }
}
