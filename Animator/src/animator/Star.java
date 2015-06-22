package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

// Uma imagem na animacao.
public class Star {
    
    Point pos;
    Dimension dim;
    String path;
    MotionPath motionpath;
    
    public Star (Point pos, Dimension dim, String path) {
        this.pos = pos;
        this.dim = dim;
        this.path = path;
        this.motionpath = new MotionPath(dim, pos);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        double angle = Math.PI / 5;

        GeneralPath gp = new GeneralPath();
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 10; i++){
            double r = (i & 1) == 0 ? 38 : 14;
            Point2D.Double p = new Point2D.Double(this.pos.x + Math.cos(i*angle)*r, this.pos.y + Math.sin(i*angle)*r);
            
            if (i == 0) gp.moveTo(p.getX(), p.getY());
            else gp.lineTo(p.getX(), p.getY());
        }
    
        gp.closePath();
        g2.setColor(Color.white);
        g2.fill(gp); 
    }

    public void move() {
       if (path == "Line"){
           motionpath.line();
       }
       if(path == "Mola"){
           motionpath.mola(70);
       }
       if(path == "Crazy"){
           motionpath.crazy();
       }
    }
}
