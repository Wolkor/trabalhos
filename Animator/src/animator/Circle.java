package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

// Uma imagem na animacao.
class Circle {

    Point pos;
    Dimension dim;
    String path;
    MotionPath pathline;
    

    public Circle(Point pos, Dimension dim, String path) {
        this.pos = pos;
        this.dim = dim;
        this.path = path;
        this.pathline = new MotionPath(dim, pos);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(pos.x, pos.y, 50, 50);
    }

    public void move() {
       if (path == "Line"){
           pathline.line();
       }
       if(path == "Mola"){
           pathline.mola(60);
       }
       if(path == "Crazy"){
           pathline.crazy();
       }
    }
}
