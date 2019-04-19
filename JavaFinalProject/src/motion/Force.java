package motion;

import javafx.scene.Node;
import motion.movingobject.MovingObject;

/**
 * Force is a simple Vector2D
 * @author Nguyen Minh Tu
 * x,y is its magnitude in Newton
 * MovingObject is the object to be exerted on
 */
public class Force extends Vector2D {
	Node view; //display force in the pane	
	private MovingObject object;
	
	/**
	 * Init the force, but not start yet
	 * @param x magnitude in x-axis (N)
	 * @param y magnitude in y-axis (N)
	 * @param object the object to be exerted on
	 */
	public Force(double x, double y, MovingObject object) {
		super(x, y);
		this.object = object;
	}
	
	public void start() {
		Vector2D deltaAcceralation = new Vector2D(
				this.getX()/this.object.getMass(),
				this.getY()/this.object.getMass());
		this.object.getAcceleration().add(deltaAcceralation);
	}
	
	public void stop() {
		Vector2D deltaAcceralation = new Vector2D(
				this.getX()/this.object.getMass(),
				this.getY()/this.object.getMass());
		this.object.getAcceleration().substract(deltaAcceralation);
	}

	public MovingObject getObject() {
		return object;
	}

	public void setObject(MovingObject object) {
		this.object = object;
	}
	
	

}
