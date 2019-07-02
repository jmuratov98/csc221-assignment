package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Main extends Application {
	
	public final int CANVAS_WIDTH = 400;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		HBox h = addHBox();
		root.setTop(h);
		
		Canvas canvas = addCanvas();
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		root.getChildren().add(canvas);
		
		Circle c = new Circle(canvas.getWidth() - CANVAS_WIDTH, canvas.getHeight() - CANVAS_WIDTH, CANVAS_WIDTH, Color.BLUE);
		Polygon p = new Polygon(5, canvas.getWidth() - CANVAS_WIDTH / 2, canvas.getHeight() - CANVAS_WIDTH / 2, Color.RED);
		
		c.draw(gc);
		p.draw(gc);
		
		primaryStage.setTitle("Assignment #1 ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public HBox addHBox()
	{
		HBox h = new HBox();
		h.setStyle( "-fx-border-color:GREY; -fx-background-color:linear-gradient( to right, white, azure );");
		return h;
	}
	
	public Canvas addCanvas()
	{
		return new Canvas(CANVAS_WIDTH, CANVAS_WIDTH);
	}
	
	public static void main(String[] args) {
		launch(args);
		
		Line l = new Line(0, 0, 100, 100, Color.BLACK);
		System.out.println(l);
	}
}
