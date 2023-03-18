package coe528lab4;

/**
 *
 * @author hsuresh
 */
public abstract class FoodComponent {
    public double price;
    public String food, category;
    public abstract double getPrice();
    public abstract void print(int level);
    
    public abstract void add(FoodComponent c);
    public abstract void remove(FoodComponent c);
    
}