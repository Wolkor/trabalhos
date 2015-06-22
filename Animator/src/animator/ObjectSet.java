package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    private Circle[] circles;
    private Square[] squares;
    private Triangle[] triangles;
    private Star[] stars;
    Random aleatorio = new Random();
    
    // Adiciona objetos da classe Image ao ObjectSet.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(aleatorio.nextInt(dim.height-image.getHeight()), aleatorio.nextInt(dim.width-image.getWidth()));
            images[i] = new Image(p, image, dim, path);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    void addStars(int n, Dimension dim, String path) {
        stars = new Star[n];
        for (int i = 0; i < stars.length; i++) {
            Point p = new Point(aleatorio.nextInt(dim.width),aleatorio.nextInt(dim.height));
            stars[i] = new Star(p, dim, path);
        };
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    void addSquare(int n, Dimension dim, String path) {
        squares = new Square[n];
        for (int i = 0; i < squares.length; i++) {
            Point p = new Point(aleatorio.nextInt(dim.width),aleatorio.nextInt(dim.height));
            squares[i] = new Square(p, dim, path);
        }   
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    void addCircles(int n, Dimension dim, String path) {
        circles = new Circle[n];
        for (int i = 0; i < circles.length; i++) {
            Point p = new Point(aleatorio.nextInt(dim.width),aleatorio.nextInt(dim.height));
            circles[i] = new Circle(p, dim, path);
        }   
    }
    
    // Adiciona objetos da classe Triangle ao ObjectSet.
    void addTriangles(int n, Dimension dim, String path) {
        triangles = new Triangle[n];
        for (int i = 0; i < triangles.length; i++) {
            Point p = new Point(aleatorio.nextInt(dim.width),aleatorio.nextInt(dim.height));
            triangles[i] = new Triangle(p, dim, path);
        }   
    }
    
    // Desenha cada um dos objetos da animacao.
    void drawAll(Graphics g) {
        if(images != null){
            for (Image image : images) {
                image.draw(g);
            }
        }
        if(stars != null){
            for (Star star : stars) {
                star.draw(g);
            }   
        }
        if (circles != null){
            for (Circle circle : circles) {
                circle.draw(g);
            } 
        }
        if(squares != null){
            for (Square square : squares) {
                square.draw(g);
            }   
        }
        if(triangles != null){
            for (Triangle triangle : triangles) {
                triangle.draw(g);
            }   
        }
    }

    // Move cada um dos objetos da animacao.
    void moveAll() {
        if(images != null){
            for (Image image : images) {
                image.move();
            }
        }
        if (stars != null){
            for (Star star : stars) {
                star.move();
            }
        }
        if (circles != null){
            for (Circle circle : circles) {
                circle.move();
            }
        }
        if(squares != null){
            for (Square square : squares) {
                square.move();
            }
        }
        if(triangles != null){
            for (Triangle triangle : triangles) {
                triangle.move();
            }
        }
    }
}
