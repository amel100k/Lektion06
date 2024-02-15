package rekursion;

public class Opgave04 {
    public static void main(String[] args) {
        System.out.println("ackermannFunktion(1,3) = " + ackermannFunktion(1, 3));
    }
    public static int ackermannFunktion(int x, int y){
        int result;
        if (x == 0){
            result = y + 1;
        }
        else if (y == 0) {
            result = ackermannFunktion(x-1, 1);
        }
        else {
            result = ackermannFunktion(x-1,(ackermannFunktion(x,y-1)));
        }
        return result;
    }
}
