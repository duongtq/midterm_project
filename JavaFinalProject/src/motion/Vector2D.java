package motion;

/**
 * A double pair (x,y). Used to represent: location, velocity, acceleration and force
 * @author Nguyen Minh Tu
 *
 */
public class Vector2D {

	private double x = 0f;
    private double y = 0f;    

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double magnitude() {
        return (double) Math.sqrt(x * x + y * y);
    }

    public void add(Vector2D v) {
        x += v.x;
        y += v.y;
    }
    
	public void substract(Vector2D v) {
		this.x -= v.x;
		this.y -= v.y;		
	}

    /**
     * Multiply vector by a scalar amount
     * @param n
     */
    public void multiply(double n) {
        x *= n;
        y *= n;
    }
    
    /**
     * Multiply vector by a scalar amount
     * @param n
     */
    public Vector2D multiplyVector(double n) {
        return new Vector2D(this.getX()*n, this.getY()*n);
    }
    
    /**
     * Divide vector by a scalar amount
     * @param n
     */
    public void divide(double n) {
        x /= n;
        y /= n;
    }

    public void normalize() {
        double m = magnitude();
        if (m != 0 && m != 1) {
            divide(m);
        }
    }

    public void limit(double max) {
        if (magnitude() > max) {
            normalize();
            multiply(max);
        }
    }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
    
	@Override
	public String toString() {
		return String.format("(%.1f,%.1f)", this.getX(), this.getY());
	}    
}
