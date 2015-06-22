package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    Point pos;
    Dimension dim;
    String path;
    MotionPath pathline;
    

    public Image(Point pos, BufferedImage img, Dimension dim, String path) {
        this.pos = pos;
        this.img = img;
        this.dim = dim;
        this.path = path;
        this.pathline = new MotionPath(dim, pos);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    public void move() {
       if (path == "Line"){
           pathline.line();
       }
       if(path == "Mola"){
           pathline.mola(50);
       }
       if(path == "Crazy"){
           pathline.crazy();
       }
    }
}
