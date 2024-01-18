import java.text.DecimalFormat;
public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private final double DEFAULT_SIDE_LENGTH = 1.0;
	
	DecimalFormat FORMATTER = new DecimalFormat("#.###");
	
	
	public Triangle(double sideA, double sideB, double sideC) {
		if(isTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else {
			this.sideA = DEFAULT_SIDE_LENGTH;
			this.sideB = DEFAULT_SIDE_LENGTH;
			this.sideC = DEFAULT_SIDE_LENGTH;
		}
	}
	
	public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    private static boolean isTriangle(double sideA, double sideB, double sideC) {
    	if(sideA > 0 && sideB > 0 && sideC > 0) {
    		if(sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    	else {
    		return false;
    	}
    
    }
    //mutator methods
    public boolean setSideA(double sideA) {
        if (!isTriangle(sideA, sideB, sideC)) {
            return false;
        }
        this.sideA = sideA;
        return true;
    }
    public boolean setSideB(double sideB) {
        if (!isTriangle(sideA, sideB, sideC)) {
            return false;
        }
        this.sideB = sideB;
        return true;
    }
    public boolean setSideC(double sideC) {
        if (!isTriangle(sideA, sideB, sideC)) {
            return false;
        }
        this.sideC = sideC;
        return true;
    }
    public String toString(){
    	String result = "Triangle(" + FORMATTER.format(sideA)+ ", " + FORMATTER.format(sideB) + ", " + FORMATTER.format(sideC) + ")";
    	return result;
    }
}
