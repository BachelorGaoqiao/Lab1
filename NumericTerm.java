import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by gaoqiao on 2016/9/19.
 */
public class NumericTerm {
    public NumericTerm(){
        powers = new ArrayList<Integer>();
    }
    public NumericTerm(double coefficient, Collection<Integer> powers) {
        this.coefficient = coefficient;
        this.powers = new ArrayList<Integer>();
        this.powers.addAll(powers);
    }
    public double coefficient;
    public ArrayList<Integer> powers;
}
