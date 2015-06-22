package animator;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Random;

public class MotionPath {
    
    Dimension dim;
    Point pos;
    Random aleatorio = new Random();
    double angle;
    
    public MotionPath(Dimension dim, Point pos){
        this.dim = dim;
        this.pos = pos;
        angle = 1.4;
    }
    
    public void line(){
        pos.x = pos.x+5;
        if(pos.x > dim.width){
            pos.x = 0;
            pos.y = aleatorio.nextInt(dim.height);
        }
    }
    public void mola(int raio_circulo){
        pos.x = (int) Math.floor(pos.x + Math.cos(angle)*(raio_circulo/15));
        pos.y = (int) Math.floor(pos.y + Math.sin(angle)*(raio_circulo/15));
        angle += 0.1;
        if(pos.x > dim.width || pos.x < 0){
            pos.x = dim.width;

        }
        if(pos.y > dim.height || pos.y < 0){           
            pos.y = dim.height;
        }
    }
    
    public void crazy(){
        pos.x = aleatorio.nextInt(dim.width);
        pos.y = aleatorio.nextInt(dim.height);
    }  
}
