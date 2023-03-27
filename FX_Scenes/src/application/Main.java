package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		
			Group root = new Group();
			Scene scene = new Scene(root,600,600,Color.FORESTGREEN);
			Stage stage = new Stage();
			stage.setTitle("The Philadelphia Eagles");
			
			
			Image icon = new Image("eagles.png");
			stage.getIcons().add(icon);
			stage.setScene(scene);
			stage.show();
			
			Text text = new Text();
			text.setText("Go Eagles!!!");
			text.setX(100);
			text.setY(200);
			text.setFont(Font.font("Verdana",FontWeight.BOLD,60));
			text.setFill(Color.BLACK);
			
			
			Line line = new Line();
			line.setStartX(100);
			line.setStartY(210);
			line.setEndX(500);
			line.setEndY(210);
			line.setStrokeWidth(5);
			line.setStroke(Color.BLACK);
			line.setOpacity(1);
			/*
			Rectangle rectangle = new Rectangle();
			rectangle.setX(400);
			rectangle.setY(250);
			rectangle.setWidth(100);
			rectangle.setHeight(100);
			rectangle.setStrokeWidth(5);
			rectangle.setStroke(Color.RED);
			
			Rectangle rectangle1	 = new Rectangle();
			rectangle1.setX(100);
			rectangle1.setY(250);
			rectangle1.setWidth(100);
			rectangle1.setHeight(100);
			rectangle1.setStrokeWidth(5);
			rectangle1.setStroke(Color.DARKGREY);
			*/
			//root.getChildren().add(rectangle1);
			//root.getChildren().add(rectangle);
			root.getChildren().add(text);
			root.getChildren().add(line);
			stage.setScene(scene);
			stage.show();
			
		}
	}
	
	

