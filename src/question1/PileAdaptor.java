package question1;

public class PileAdaptor implements PileI{

    public StackImpl stack;

    public PileAdaptor(){

    }

    public PileAdaptor(StackImpl p_StackImpl){
        this.stack = p_StackImpl;
    }

    @Override
    public void empiler(Object o) {
        this.stack.push(o);
    }

    @Override
    public Object depiler() {
        return this.stack.pop();
    }

    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
