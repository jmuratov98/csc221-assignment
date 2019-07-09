package application;

import application.HW2.Line;
import application.HW2.Oval;
import application.HW2.Rectangle;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

// Client - Main class
public class Main extends Application {
	
	// ResizeableCanvas subclass
	public class ResizeableCanvas extends Canvas {
		
		// Constructor
		public ResizeableCanvas() {
			// draws the shapes whenerver the canvas is resized
			widthProperty().addListener(evt -> draw());
			heightProperty().addListener(evt -> draw());
		}
		
		// draws the shapes
		private void draw() {
			GraphicsContext gc = getGraphicsContext2D();
			
			// sets the fill of the cnavas
			gc.setFill(Color.WHITE);
			gc.fillRect(0, 0, getWidth(), getHeight());
			
			// draws a line around the canvas
			Line top = new Line(0, 0, getWidth(), 0, Color.BLACK);
			Line bottom = new Line(0, getHeight(), getWidth(), getHeight(), Color.BLACK);
			Line left = new Line(0, 0, 0, getHeight(), Color.BLACK);
			Line right = new Line(getWidth(), 0, getWidth(), getHeight(), Color.BLACK);
			
			// Draws the main diagonal line
			Line diagonal = new Line(0, 0, getWidth(), getHeight(), Color.BLACK);
			
			// Draws the different shapes inscribed in an alternating pattern
			Rectangle r1 = new Rectangle(getWidth() / 4, getHeight() / 4, (2 * getWidth())/4, (2 * getHeight())/4, Color.GREEN);
			Oval o1 = new Oval(r1.getX(), r1.getY(), r1.getWidth(), r1.getHeight(), Color.AQUA);
			Rectangle r2 = new Rectangle((13*r1.getX())/10, (13*r1.getY()/10), (7 * getWidth())/20, (7 * getHeight())/20, Color.CRIMSON);
			Oval o2 = new Oval(r2.getX(), r2.getY(), r2.getWidth(), r2.getHeight(), Color.BLUE);
			Rectangle r3 = new Rectangle((23*r2.getX())/20, (23*r2.getY()/20), (10 * getWidth())/40, (10 * getHeight())/40, Color.GOLD);
			Oval o3 = new Oval(r3.getX(), r3.getY(), r3.getWidth(), r3.getHeight(), Color.PURPLE);
			
			// Draws the shapes
			top.draw(gc);
			left.draw(gc);
			bottom.draw(gc);
			right.draw(gc);

			r1.draw(gc);
			o1.draw(gc);
			r2.draw(gc);
			o2.draw(gc);
			r3.draw(gc);
			o3.draw(gc);
			diagonal.draw(gc);
		}
		
		@Override
		public boolean isResizable() {
			return true;
		}
		
		@Override
		public double prefWidth(double height) {
			return getWidth();
		}
		
		@Override
		public double prefHeight(double width) {
			return getHeight();
		}
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ResizeableCanvas canvas = addCanvas();
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(canvas);
		
		canvas.widthProperty().bind(stackPane.widthProperty());
		canvas.heightProperty().bind(stackPane.heightProperty());
		
		primaryStage.setTitle("Assignment #2");
		primaryStage.setResizable(true);
		primaryStage.setScene(new Scene(stackPane));		
		primaryStage.show();
		
	}
	
	public ResizeableCanvas addCanvas()
	{
		return new ResizeableCanvas();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
