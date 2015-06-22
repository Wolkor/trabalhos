package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

// Uma imagem na animacao.
class Square {

    Point pos;
    Dimension dim;
    String path;
    MotionPath motionpath;
   
    
    public Square(Point pos, Dimension dim, String path) {
        this.pos = pos;
        this.dim = dim;
        this.path = path;
        this.motionpath = new MotionPath(dim, pos);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(pos.x, pos.y, 40, 40);
    }
    
    public void move() {
       if (path == "Line"){
           motionpath.line();
       }
       if(path == "Mola"){
           motionpath.mola(50);           
       }
       if(path == "Crazy"){
           motionpath.crazy();
       }
    }
}
