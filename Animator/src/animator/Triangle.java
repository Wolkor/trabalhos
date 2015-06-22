package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

// Uma imagem na animacao.
class Triangle {

    Point pos;
    Dimension dim;
    String path;
    MotionPath pathline;
    

    public Triangle(Point pos, Dimension dim, String path) {
        this.pos = pos;
        this.dim = dim;
        this.path = path;
        this.pathline = new MotionPath(dim, pos);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.green);
        int[] x = {pos.x, pos.x+45, pos.x+25};
        int[] y = {pos.y, pos.y, pos.y-45};
        g.fillPolygon(x, y, 3);
    }
    
    public void move() {
       if (path == "Line"){
           pathline.line();
       }
       if(path == "Mola"){
           pathline.mola(55);
       }
       if(path == "Crazy"){
           pathline.crazy();
       }
    }
}