package aprendizado;
import robocode.*;
import java.awt.Color;


public class DanielaRobot extends Robot {

    public void run() {
      
        setColors(Color.blue, Color.red, Color.white); 

        while (true) {
            
            moveInPattern();
        }
    }
    public void moveInPattern() {
        ahead(400);   
        turnLeft(90); 
        ahead(200);  
        turnRight(90); 
        back(150);   
    }

    public void onScannedRobot(ScannedRobotEvent e) {
       
        fire(2);
    }

    public void onHitByBullet(HitByBulletEvent e) {
    
        back(50); 
    }

    public void onHitWall(HitWallEvent e) {

        turnLeft(90); 
        ahead(100);   
    }
}
