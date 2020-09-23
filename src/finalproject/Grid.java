/*
Amy Calvert
CS 202
Purpose - Creates a Tri-Wizard Tournament Game 
Resources Used - Class Examples
               - Java2s.com (Rectangle, Text Area)
 */
package finalproject;

import javafx.scene.control.*;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import static javafx.application.Application.launch;
import javafx.scene.input.MouseEvent;










public class Grid extends Application{

@Override
public void start(Stage stage){
 
    
    
    //draws dice circle
    Circle die = new Circle();
    die.setCenterX(300);
    die.setCenterY(340);
    die.setRadius(40);
    die.setStroke(Color.BLACK);
    
    //draws card deck
    Rectangle deck = new Rectangle();
    deck.setX(650);
    deck.setY(300);
    deck.setWidth(100);
    deck.setHeight(150);
    deck.setStroke(Color.BLACK);
    deck.setFill(Color.DARKGREEN);
    
    
    //draws  blue players' pieces
    Circle bluePlayer1 = new Circle();
    bluePlayer1.setCenterX(950);
    bluePlayer1.setCenterY(150);
    bluePlayer1.setRadius(20);
    bluePlayer1.setStroke(Color.BLACK);
    bluePlayer1.setFill(Color.CADETBLUE);
    
    Circle bluePlayer2 = new Circle();
    bluePlayer2.setCenterX(950);
    bluePlayer2.setCenterY(200);
    bluePlayer2.setRadius(20);
    bluePlayer2.setStroke(Color.BLACK);
    bluePlayer2.setFill(Color.CADETBLUE);
    
    Circle bluePlayer3 = new Circle();
    bluePlayer3.setCenterX(950);
    bluePlayer3.setCenterY(250);
    bluePlayer3.setRadius(20);
    bluePlayer3.setStroke(Color.BLACK);
    bluePlayer3.setFill(Color.CADETBLUE);

    Circle bluePlayer4 = new Circle();
    bluePlayer4.setCenterX(950);
    bluePlayer4.setCenterY(300);
    bluePlayer4.setRadius(20);
    bluePlayer4.setStroke(Color.BLACK);
    bluePlayer4.setFill(Color.CADETBLUE);
    
    
    //draws  gold players' pieces
    Circle yellowPlayer1 = new Circle();
    yellowPlayer1.setCenterX(1000);
    yellowPlayer1.setCenterY(150);
    yellowPlayer1.setRadius(20);
    yellowPlayer1.setStroke(Color.BLACK);
    yellowPlayer1.setFill(Color.GOLD);
    
    Circle yellowPlayer2 = new Circle();
    yellowPlayer2.setCenterX(1000);
    yellowPlayer2.setCenterY(200);
    yellowPlayer2.setRadius(20);
    yellowPlayer2.setStroke(Color.BLACK);
    yellowPlayer2.setFill(Color.GOLD);
    
    Circle yellowPlayer3 = new Circle();
    yellowPlayer3.setCenterX(1000);
    yellowPlayer3.setCenterY(250);
    yellowPlayer3.setRadius(20);
    yellowPlayer3.setStroke(Color.BLACK);
    yellowPlayer3.setFill(Color.GOLD);

    Circle yellowPlayer4 = new Circle();
    yellowPlayer4.setCenterX(1000);
    yellowPlayer4.setCenterY(300);
    yellowPlayer4.setRadius(20);
    yellowPlayer4.setStroke(Color.BLACK);
    yellowPlayer4.setFill(Color.GOLD);
    
    
  //draws black players' pieces
    Circle blackPlayer1 = new Circle();
    blackPlayer1.setCenterX(1050);
    blackPlayer1.setCenterY(150);
    blackPlayer1.setRadius(20);
    blackPlayer1.setStroke(Color.BLACK);
    blackPlayer1.setFill(Color.BLACK);
    
    Circle blackPlayer2 = new Circle();
    blackPlayer2.setCenterX(1050);
    blackPlayer2.setCenterY(200);
    blackPlayer2.setRadius(20);
    blackPlayer2.setStroke(Color.BLACK);
    blackPlayer2.setFill(Color.BLACK);
    
    Circle blackPlayer3 = new Circle();
    blackPlayer3.setCenterX(1050);
    blackPlayer3.setCenterY(250);
    blackPlayer3.setRadius(20);
    blackPlayer3.setStroke(Color.BLACK);
    blackPlayer3.setFill(Color.BLACK);

    Circle blackPlayer4 = new Circle();
    blackPlayer4.setCenterX(1050);
    blackPlayer4.setCenterY(300);
    blackPlayer4.setRadius(20);
    blackPlayer4.setStroke(Color.BLACK);
    blackPlayer4.setFill(Color.BLACK);
   
    
    //draws  red players' pieces
    Circle redPlayer1 = new Circle();
    redPlayer1.setCenterX(900);
    redPlayer1.setCenterY(150);
    redPlayer1.setRadius(20);
    redPlayer1.setStroke(Color.BLACK);
    redPlayer1.setFill(Color.DARKRED);
    
    Circle redPlayer2 = new Circle();
    redPlayer2.setCenterX(900);
    redPlayer2.setCenterY(200);
    redPlayer2.setRadius(20);
    redPlayer2.setStroke(Color.BLACK);
    redPlayer2.setFill(Color.DARKRED);
    
    Circle redPlayer3 = new Circle();
    redPlayer3.setCenterX(900);
    redPlayer3.setCenterY(250);
    redPlayer3.setRadius(20);
    redPlayer3.setStroke(Color.BLACK);
    redPlayer3.setFill(Color.DARKRED);

    Circle redPlayer4 = new Circle();
    redPlayer4.setCenterX(900);
    redPlayer4.setCenterY(300);
    redPlayer4.setRadius(20);
    redPlayer4.setStroke(Color.BLACK);
    redPlayer4.setFill(Color.DARKRED);
    
    //draws blue start spaces
    Circle blueCircle = new Circle();
    blueCircle.setCenterX(100);
    blueCircle.setCenterY(100);
    blueCircle.setRadius(20);
    blueCircle.setStroke(Color.BLACK);
    blueCircle.setFill(Color.LIGHTBLUE); 
    
    Circle blueCircle2 = new Circle();
    blueCircle2.setCenterX(50);
    blueCircle2.setCenterY(100);
    blueCircle2.setRadius(20);
    blueCircle2.setStroke(Color.BLACK);
    blueCircle2.setFill(Color.LIGHTBLUE);
    
    Circle blueCircle3 = new Circle();
    blueCircle3.setCenterX(50);
    blueCircle3.setCenterY(150);
    blueCircle3.setRadius(20);
    blueCircle3.setStroke(Color.BLACK);
    blueCircle3.setFill(Color.LIGHTBLUE);
    
    Circle blueCircle4 = new Circle();
    blueCircle4.setCenterX(50);
    blueCircle4.setCenterY(200);
    blueCircle4.setRadius(20);
    blueCircle4.setStroke(Color.BLACK);
    blueCircle4.setFill(Color.LIGHTBLUE);    
    
    
    //draws yellow start spaces
    Circle yellowCircle = new Circle();
    yellowCircle.setCenterX(500);
    yellowCircle.setCenterY(100);
    yellowCircle.setRadius(20);
    yellowCircle.setStroke(Color.BLACK);
    yellowCircle.setFill(Color.YELLOW);     
    
    Circle yellowCircle2 = new Circle();
    yellowCircle2.setCenterX(550);
    yellowCircle2.setCenterY(100);
    yellowCircle2.setRadius(20);
    yellowCircle2.setStroke(Color.BLACK);
    yellowCircle2.setFill(Color.YELLOW);    
    
    Circle yellowCircle3 = new Circle();
    yellowCircle3.setCenterX(550);
    yellowCircle3.setCenterY(150);
    yellowCircle3.setRadius(20);
    yellowCircle3.setStroke(Color.BLACK);
    yellowCircle3.setFill(Color.YELLOW);
    
    Circle yellowCircle4 = new Circle();
    yellowCircle4.setCenterX(550);
    yellowCircle4.setCenterY(200);
    yellowCircle4.setRadius(20);
    yellowCircle4.setStroke(Color.BLACK);
    yellowCircle4.setFill(Color.YELLOW);  
    
    
    
    //draws red  start spaces
    Circle redCircle = new Circle();
    redCircle.setCenterX(500);
    redCircle.setCenterY(600);
    redCircle.setRadius(20);
    redCircle.setStroke(Color.BLACK);
    redCircle.setFill(Color.RED);
    
    Circle redCircle2 = new Circle();
    redCircle2.setCenterX(550);
    redCircle2.setCenterY(600);
    redCircle2.setRadius(20);
    redCircle2.setStroke(Color.BLACK);
    redCircle2.setFill(Color.RED);
    
    Circle redCircle3 = new Circle();
    redCircle3.setCenterX(550);
    redCircle3.setCenterY(550);
    redCircle3.setRadius(20);
    redCircle3.setStroke(Color.BLACK);
    redCircle3.setFill(Color.RED);
 
    Circle redCircle4 = new Circle();
    redCircle4.setCenterX(550);
    redCircle4.setCenterY(500);
    redCircle4.setRadius(20);
    redCircle4.setStroke(Color.BLACK);
    redCircle4.setFill(Color.RED);
    
    
    //draws black start spaces
    Circle blackCircle = new Circle();
    blackCircle.setCenterX(100);
    blackCircle.setCenterY(600);
    blackCircle.setRadius(20);
    blackCircle.setStroke(Color.BLACK);
    blackCircle.setFill(Color.DARKSLATEGRAY);

    Circle blackCircle2 = new Circle();
    blackCircle2.setCenterX(50);
    blackCircle2.setCenterY(600);
    blackCircle2.setRadius(20);
    blackCircle2.setStroke(Color.BLACK);
    blackCircle2.setFill(Color.DARKSLATEGRAY);

    Circle blackCircle3 = new Circle();
    blackCircle3.setCenterX(50);
    blackCircle3.setCenterY(550);
    blackCircle3.setRadius(20);
    blackCircle3.setStroke(Color.BLACK);
    blackCircle3.setFill(Color.DARKSLATEGRAY);

    Circle blackCircle4 = new Circle();
    blackCircle4.setCenterX(50);
    blackCircle4.setCenterY(500);
    blackCircle4.setRadius(20);
    blackCircle4.setStroke(Color.BLACK);
    blackCircle4.setFill(Color.DARKSLATEGRAY);    
    
    
    //draws blue home spaces
    Circle blueHome1 = new Circle();
    blueHome1.setCenterX(150);
    blueHome1.setCenterY(200);
    blueHome1.setRadius(20);
    blueHome1.setStroke(Color.BLACK);
    blueHome1.setFill(Color.LIGHTBLUE);
    
    Circle blueHome2 = new Circle();
    blueHome2.setCenterX(180);
    blueHome2.setCenterY(230);
    blueHome2.setRadius(20);
    blueHome2.setStroke(Color.BLACK);
    blueHome2.setFill(Color.LIGHTBLUE);
    
    Circle blueHome3 = new Circle();
    blueHome3.setCenterX(215);
    blueHome3.setCenterY(255);
    blueHome3.setRadius(20);
    blueHome3.setStroke(Color.BLACK);
    blueHome3.setFill(Color.LIGHTBLUE);

    Circle blueHome4 = new Circle();
    blueHome4.setCenterX(250);
    blueHome4.setCenterY(280);
    blueHome4.setRadius(20);
    blueHome4.setStroke(Color.BLACK);
    blueHome4.setFill(Color.LIGHTBLUE);
    
    
    //draws yellow home places
    Circle yellowHome1 = new Circle();
    yellowHome1.setCenterX(450);
    yellowHome1.setCenterY(200);
    yellowHome1.setRadius(20);
    yellowHome1.setStroke(Color.BLACK);
    yellowHome1.setFill(Color.YELLOW);     
    
    Circle yellowHome2 = new Circle();
    yellowHome2.setCenterX(420);
    yellowHome2.setCenterY(230);
    yellowHome2.setRadius(20);
    yellowHome2.setStroke(Color.BLACK);
    yellowHome2.setFill(Color.YELLOW);    
    
    Circle yellowHome3 = new Circle();
    yellowHome3.setCenterX(385);
    yellowHome3.setCenterY(260);
    yellowHome3.setRadius(20);
    yellowHome3.setStroke(Color.BLACK);
    yellowHome3.setFill(Color.YELLOW);
    
    Circle yellowHome4 = new Circle();
    yellowHome4.setCenterX(350);
    yellowHome4.setCenterY(285);
    yellowHome4.setRadius(20);
    yellowHome4.setStroke(Color.BLACK);
    yellowHome4.setFill(Color.YELLOW);  

    //draws black home spaces
    Circle blackHome1 = new Circle();
    blackHome1.setCenterX(150);
    blackHome1.setCenterY(500);
    blackHome1.setRadius(20);
    blackHome1.setStroke(Color.BLACK);
    blackHome1.setFill(Color.DARKSLATEGRAY);
    
    Circle blackHome2 = new Circle();
    blackHome2.setCenterX(180);
    blackHome2.setCenterY(470);
    blackHome2.setRadius(20);
    blackHome2.setStroke(Color.BLACK);
    blackHome2.setFill(Color.DARKSLATEGRAY);
    
    Circle blackHome3 = new Circle();
    blackHome3.setCenterX(215);
    blackHome3.setCenterY(440);
    blackHome3.setRadius(20);
    blackHome3.setStroke(Color.BLACK);
    blackHome3.setFill(Color.DARKSLATEGRAY);
 
    Circle blackHome4 = new Circle();
    blackHome4.setCenterX(250);
    blackHome4.setCenterY(405);
    blackHome4.setRadius(20);
    blackHome4.setStroke(Color.BLACK);
    blackHome4.setFill(Color.DARKSLATEGRAY);    
    
    //draws red home spaces
    Circle redHome1 = new Circle();
    redHome1.setCenterX(450);
    redHome1.setCenterY(500);
    redHome1.setRadius(20);
    redHome1.setStroke(Color.BLACK);
    redHome1.setFill(Color.RED);
    
    Circle redHome2 = new Circle();
    redHome2.setCenterX(420);
    redHome2.setCenterY(470);
    redHome2.setRadius(20);
    redHome2.setStroke(Color.BLACK);
    redHome2.setFill(Color.RED);
    
    Circle redHome3 = new Circle();
    redHome3.setCenterX(385);
    redHome3.setCenterY(435);
    redHome3.setRadius(20);
    redHome3.setStroke(Color.BLACK);
    redHome3.setFill(Color.RED);
 
    Circle redHome4 = new Circle();
    redHome4.setCenterX(350);
    redHome4.setCenterY(400);
    redHome4.setRadius(20);
    redHome4.setStroke(Color.BLACK);
    redHome4.setFill(Color.RED);  
    
    
    //sets main board
    Circle space1 = new Circle();
    space1.setCenterX(150);
    space1.setCenterY(150);
    space1.setRadius(20);
    space1.setStroke(Color.BLACK);
    space1.setFill(Color.WHITE);
    
    Circle space2 = new Circle();
    space2.setCenterX(200);
    space2.setCenterY(150);
    space2.setRadius(20);
    space2.setStroke(Color.BLACK);
    space2.setFill(Color.LIGHTGRAY);
    
    Circle space3 = new Circle();
    space3.setCenterX(250);
    space3.setCenterY(150);
    space3.setRadius(20);
    space3.setStroke(Color.BLACK);
    space3.setFill(Color.WHITE);
    
    Circle space4 = new Circle();
    space4.setCenterX(300);
    space4.setCenterY(150);
    space4.setRadius(20);
    space4.setStroke(Color.BLACK);
    space4.setFill(Color.WHITE);
    
    Circle space5 = new Circle();
    space5.setCenterX(350);
    space5.setCenterY(150);
    space5.setRadius(20);
    space5.setStroke(Color.BLACK);
    space5.setFill(Color.LIGHTGRAY);
    
    Circle space6 = new Circle();
    space6.setCenterX(400);
    space6.setCenterY(150);
    space6.setRadius(20);
    space6.setStroke(Color.BLACK);
    space6.setFill(Color.WHITE);
    
    Circle space7 = new Circle();
    space7.setCenterX(450);
    space7.setCenterY(150);
    space7.setRadius(20);
    space7.setStroke(Color.BLACK);
    space7.setFill(Color.WHITE);
    
    Circle space8 = new Circle();
    space8.setCenterX(500);
    space8.setCenterY(200);
    space8.setRadius(20);
    space8.setStroke(Color.BLACK);
    space8.setFill(Color.WHITE);
    
    Circle space9 = new Circle();
    space9.setCenterX(500);
    space9.setCenterY(250);
    space9.setRadius(20);
    space9.setStroke(Color.BLACK);
    space9.setFill(Color.LIGHTGRAY);
    
    Circle space10 = new Circle();
    space10.setCenterX(500);
    space10.setCenterY(300);
    space10.setRadius(20);
    space10.setStroke(Color.BLACK);
    space10.setFill(Color.WHITE);
    
    Circle space11 = new Circle();
    space11.setCenterX(500);
    space11.setCenterY(350);
    space11.setRadius(20);
    space11.setStroke(Color.BLACK);
    space11.setFill(Color.WHITE);
    
    Circle space12 = new Circle();
    space12.setCenterX(500);
    space12.setCenterY(400);
    space12.setRadius(20);
    space12.setStroke(Color.BLACK);
    space12.setFill(Color.LIGHTGRAY);
    
    Circle space13 = new Circle();
    space13.setCenterX(500);
    space13.setCenterY(450);
    space13.setRadius(20);
    space13.setStroke(Color.BLACK);
    space13.setFill(Color.WHITE);
    
    Circle space14 = new Circle();
    space14.setCenterX(500);
    space14.setCenterY(500);
    space14.setRadius(20);
    space14.setStroke(Color.BLACK);
    space14.setFill(Color.WHITE);
    
    Circle space15 = new Circle();
    space15.setCenterX(450);
    space15.setCenterY(550);
    space15.setRadius(20);
    space15.setStroke(Color.BLACK);
    space15.setFill(Color.WHITE);

    Circle space16 = new Circle();
    space16.setCenterX(400);
    space16.setCenterY(550);
    space16.setRadius(20);
    space16.setStroke(Color.BLACK);
    space16.setFill(Color.LIGHTGRAY);

    Circle space17 = new Circle();
    space17.setCenterX(350);
    space17.setCenterY(550);
    space17.setRadius(20);
    space17.setStroke(Color.BLACK);
    space17.setFill(Color.WHITE);

    Circle space18 = new Circle();
    space18.setCenterX(300);
    space18.setCenterY(550);
    space18.setRadius(20);
    space18.setStroke(Color.BLACK);
    space18.setFill(Color.WHITE);

    Circle space19 = new Circle();
    space19.setCenterX(250);
    space19.setCenterY(550);
    space19.setRadius(20);
    space19.setStroke(Color.BLACK);
    space19.setFill(Color.LIGHTGRAY);

    Circle space20 = new Circle();
    space20.setCenterX(200);
    space20.setCenterY(550);
    space20.setRadius(20);
    space20.setStroke(Color.BLACK);
    space20.setFill(Color.WHITE);

    Circle space21 = new Circle();
    space21.setCenterX(150);
    space21.setCenterY(550);
    space21.setRadius(20);
    space21.setStroke(Color.BLACK);
    space21.setFill(Color.WHITE);

    Circle space22 = new Circle();
    space22.setCenterX(100);
    space22.setCenterY(500);
    space22.setRadius(20);
    space22.setStroke(Color.BLACK);
    space22.setFill(Color.WHITE);

    Circle space23 = new Circle();
    space23.setCenterX(100);
    space23.setCenterY(450);
    space23.setRadius(20);
    space23.setStroke(Color.BLACK);
    space23.setFill(Color.LIGHTGRAY);

    Circle space24 = new Circle();
    space24.setCenterX(100);
    space24.setCenterY(400);
    space24.setRadius(20);
    space24.setStroke(Color.BLACK);
    space24.setFill(Color.WHITE);

    Circle space25 = new Circle();
    space25.setCenterX(100);
    space25.setCenterY(350);
    space25.setRadius(20);
    space25.setStroke(Color.BLACK);
    space25.setFill(Color.WHITE);

    Circle space26 = new Circle();
    space26.setCenterX(100);
    space26.setCenterY(300);
    space26.setRadius(20);
    space26.setStroke(Color.BLACK);
    space26.setFill(Color.LIGHTGRAY);
    
    Circle space27 = new Circle();
    space27.setCenterX(100);
    space27.setCenterY(250);
    space27.setRadius(20);
    space27.setStroke(Color.BLACK);
    space27.setFill(Color.WHITE);

    Circle space28 = new Circle();
    space28.setCenterX(100);
    space28.setCenterY(200);
    space28.setRadius(20);
    space28.setStroke(Color.BLACK);
    space28.setFill(Color.WHITE);
    

    //creates a pane and adds spaces
    Pane pane = new Pane();
    pane.getChildren().add(space1);
    pane.getChildren().add(space2);
    pane.getChildren().add(space3);
    pane.getChildren().add(space4);
    pane.getChildren().add(space5);
    pane.getChildren().add(space6);
    pane.getChildren().add(space7);
    pane.getChildren().add(space8);
    pane.getChildren().add(space9);
    pane.getChildren().add(space10);
    pane.getChildren().add(space11);
    pane.getChildren().add(space12);
    pane.getChildren().add(space13);
    pane.getChildren().add(space14);
    pane.getChildren().add(space15);
    pane.getChildren().add(space16);
    pane.getChildren().add(space17);
    pane.getChildren().add(space18);
    pane.getChildren().add(space19);
    pane.getChildren().add(space20);
    pane.getChildren().add(space21); 
    pane.getChildren().add(space22);
    pane.getChildren().add(space23);
    pane.getChildren().add(space24);
    pane.getChildren().add(space25);
    pane.getChildren().add(space26);
    pane.getChildren().add(space27);
    pane.getChildren().add(space28);
    pane.getChildren().add(blueCircle);
    pane.getChildren().add(blueCircle2);
    pane.getChildren().add(blueCircle3);
    pane.getChildren().add(blueCircle4);
    pane.getChildren().add(yellowCircle);
    pane.getChildren().add(yellowCircle2);
    pane.getChildren().add(yellowCircle3);
    pane.getChildren().add(yellowCircle4);
    pane.getChildren().add(redCircle);
    pane.getChildren().add(redCircle2);
    pane.getChildren().add(redCircle3);
    pane.getChildren().add(redCircle4);
    pane.getChildren().add(blackCircle);
    pane.getChildren().add(blackCircle2);
    pane.getChildren().add(blackCircle3);
    pane.getChildren().add(blackCircle4);
    //adds blue home spaces to pane
    pane.getChildren().add(blueHome1);
    pane.getChildren().add(blueHome2);
    pane.getChildren().add(blueHome3);
    pane.getChildren().add(blueHome4);
    //adds yellow home spaces to pane
    pane.getChildren().add(yellowHome1);
    pane.getChildren().add(yellowHome2);
    pane.getChildren().add(yellowHome3);
    pane.getChildren().add(yellowHome4);
    //adds black home spaces to pane 
    pane.getChildren().add(blackHome1);
    pane.getChildren().add(blackHome2);
    pane.getChildren().add(blackHome3);
    pane.getChildren().add(blackHome4);
    //adds red home spaces
    pane.getChildren().add(redHome1);
    pane.getChildren().add(redHome2);
    pane.getChildren().add(redHome3);
    pane.getChildren().add(redHome4);
    

    // Creates a text area that allows players to recieve messages
    TextArea textArea = new TextArea();
    textArea.setText("The Tri-Wizard Tournament Has Begun!");
    textArea.relocate(600,150);
    textArea.setPrefSize(250,100);
    pane.getChildren().add(textArea);
    
    // Creates a text area that displays the directions
    TextArea Directions = new TextArea();
    Directions.setText(">>Directions<< \n Players' Pieces Are In The Right Hand Corner \n"
            + "Each Player Must Choose A Color And Place \n"
            + "Their Pieces At Their Start Postions. \n "
            + "Each Player May Roll The Die By Clicking \n"
            + "The Center Black Circle \n"
            + "Results Will Be Printed In The Display Area \n"
            + "By The Game Board. Whoever Pops The Highest \n"
            + "Number Goes First. Then Play Moves To The Left \n"
            + "Before A Player Can Move Out Of His/Her \n"
            + "Start Position, They Must Roll A 6. \n "
            + "When A Player Rolls A 6, They May Move \n"
            + "A Piece To The Space To The Left Of Their \n"
            + "Start Places. That Player Then Recieves \n"
            + "Another Turn. The Player May Move Any Piece \n"
            + "That Is Already In The Maze. Any 6 May Be \n"
            + "Used To Move A Player Into The Maze Or To \n"
            + "Move An Existing Player.  Every Player Recieves \n"
            + "An Extra Turn When They Roll 6. All Play Moves \n"
            + "Clockwise Unless A Pulled Card Indicates \n"
            + "Otherwise. When A Player Lands On A Grey \n "
            + "Space, They Must Click The Green Rectangle \n"
            + "To Pull A Card. Results Will Be Printed \n"
            + "In The Text Area Beside The Board. Whenever \n"
            + "A Player Lands On An Opponent. Their Opponent \n"
            + "Must Move Their Piece Back To Start. If A Player \n"
            + "Lands On Their Own Piece, They Must Go Back And \n"
            + "Roll Again. Once A Mover Has Went Around The \n"
            + "Board Once, They May Enter Their Home Spaces \n"
            + "A Player Must Roll The Exact Number Needed To \n"
            + "Move Home. The First Player To Get All Their \n"
            + "Pieces Home Wins The Game!");
    Directions.relocate(850,350);
    Directions.setPrefSize(300,100);
    pane.getChildren().add(Directions);
   
    
    //adds die button to screen 
    pane.getChildren().add(die);
        die.setOnMouseClicked((MouseEvent e) -> {
        String NewMessage = writeRollDie();
        textArea.setText(NewMessage);
             
    });
        
    //adds deck of cards to screen
    pane.getChildren().add(deck);
        deck.setOnMouseClicked((MouseEvent e) -> {
        String drawMessage = draw();
        textArea.setText(drawMessage);
        

});
   
    //adds player pieces
    pane.getChildren().addAll(redPlayer1);
    redPlayer1.setOnMouseDragged((MouseEvent e) -> {
        redPlayer1.setCenterX(e.getX());  
        redPlayer1.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(redPlayer2);
    redPlayer2.setOnMouseDragged((MouseEvent e) -> {
        redPlayer2.setCenterX(e.getX());  
        redPlayer2.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(redPlayer3);
    redPlayer3.setOnMouseDragged((MouseEvent e) -> {
        redPlayer3.setCenterX(e.getX());  
        redPlayer3.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(redPlayer4);
    redPlayer4.setOnMouseDragged((MouseEvent e) -> {
        redPlayer4.setCenterX(e.getX());  
        redPlayer4.setCenterY(e.getY());    
    });
    
    
        pane.getChildren().addAll(bluePlayer1);
    bluePlayer1.setOnMouseDragged((MouseEvent e) -> {
        bluePlayer1.setCenterX(e.getX());  
        bluePlayer1.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(bluePlayer2);
    bluePlayer2.setOnMouseDragged((MouseEvent e) -> {
        bluePlayer2.setCenterX(e.getX());  
        bluePlayer2.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(bluePlayer3);
    bluePlayer3.setOnMouseDragged((MouseEvent e) -> {
        bluePlayer3.setCenterX(e.getX());  
        bluePlayer3.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(bluePlayer4);
    bluePlayer4.setOnMouseDragged((MouseEvent e) -> {
        bluePlayer4.setCenterX(e.getX());  
        bluePlayer4.setCenterY(e.getY());    
    });
    
    
    pane.getChildren().addAll(yellowPlayer1);
    yellowPlayer1.setOnMouseDragged((MouseEvent e) -> {
        yellowPlayer1.setCenterX(e.getX());  
        yellowPlayer1.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(yellowPlayer2);
    yellowPlayer2.setOnMouseDragged((MouseEvent e) -> {
        yellowPlayer2.setCenterX(e.getX());  
        yellowPlayer2.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(yellowPlayer3);
    yellowPlayer3.setOnMouseDragged((MouseEvent e) -> {
        yellowPlayer3.setCenterX(e.getX());  
        yellowPlayer3.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(yellowPlayer4);
    yellowPlayer4.setOnMouseDragged((MouseEvent e) -> {
        yellowPlayer4.setCenterX(e.getX());  
        yellowPlayer4.setCenterY(e.getY());    
    });

    
    pane.getChildren().addAll(blackPlayer1);
    blackPlayer1.setOnMouseDragged((MouseEvent e) -> {
        blackPlayer1.setCenterX(e.getX());  
        blackPlayer1.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(blackPlayer2);
    blackPlayer2.setOnMouseDragged((MouseEvent e) -> {
        blackPlayer2.setCenterX(e.getX());  
        blackPlayer2.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(blackPlayer3);
    blackPlayer3.setOnMouseDragged((MouseEvent e) -> {
        blackPlayer3.setCenterX(e.getX());  
        blackPlayer3.setCenterY(e.getY());    
    });
    pane.getChildren().addAll(blackPlayer4);
    blackPlayer4.setOnMouseDragged((MouseEvent e) -> {
        blackPlayer4.setCenterX(e.getX());  
        blackPlayer4.setCenterY(e.getY());    
    });
    
    //sets scene and starts show
    Scene scene = new Scene(pane,600,600);
    stage.setTitle("Welcome to the TriWizard Tournament");
    stage.setScene(scene);
    
    
    stage.show();
    
   

}




public int rollDie(){
    Random r = new Random();
    
    int DieRoll = r.nextInt(6) + 1;
    System.out.print(DieRoll);
    return DieRoll;
}

public String writeRollDie(){
    
    String Message = "You Rolled a " + rollDie();
    return Message;
}


    public String draw(){
        //generate random number
        Random r = new Random();
                  
            int cardNum = r.nextInt(24) + 1;
            
            String Draw;
        
            if(cardNum == 1){
                Draw ="Stupefy! \n Next player loses a turn";
            }
            else if(cardNum == 2){
                Draw = "You Tripped On A Root! \n Move Back 1 Space";
            }
            else if(cardNum == 3){
                Draw = "Polyjuice Potion! \n Switch One of Your Movers With \n An Opponent's Mover On The Game Board";
            }
            else if (cardNum == 4){
                Draw = "Blind A Dragon With \n The Conjunctivitis Curse!\n Move Forward 2 Spaces!";  
            }
            else if (cardNum == 5){
                Draw = "A Blast-Ended Swrewt Attacks! \n Move Back 2 Spaces";
            }
            else if (cardNum == 6){
                Draw = "Patronus Charm : \n Defeat A Dementor!  \n Move Forward 2 Spaces";
            }
            else if (cardNum == 7){
                Draw = "Imperious Curse! \n Move Another Player's \n Mover Anywhere On The Gameboard";
            }
            else if (cardNum == 8){
                Draw = "Hide In The Maze! \n Lose A Turn";
            }
            else if (cardNum == 9){
                Draw = "Find A Shortcut! \n Take Another Turn";
            }
            else if (cardNum == 10){
                Draw = "Find A Portkey! \n Move One of Your Movers To Any \n Open Space On The Game Board";
            }
            else if (cardNum == 11){
                Draw = "Maze Bush Attacks! \n Move Back 1 Space";
            }
            else if (cardNum == 12){
                Draw = "Golden Mist Turns Everything Upside Down \n" +
                      "Remove One Of Your Movers From Start And \n Place On Your Maze Entry Space";
            }
            else if (cardNum == 13){
                Draw = "Maze Changes Formation!  \n Remove One Of Your Movers From Start \n" +
                      "And Place On Your Maze Entry Space";
            }
            else if (cardNum == 14){
                Draw = "Boggart Blocks Your Path! \n Move Back 2 Spaces";
            }
            else if (cardNum == 15){
                Draw = "Maze Changes Formation \n In Your Favor! \n Take Another Turn";
            }
            else if (cardNum == 16){
                Draw = "Make A Wrong Turn! \n Move Back 2 Spaces";
            }
            else if (cardNum == 17){
                Draw = "Mad-Eye Moody's Magical Eye \n Helps You Avoid Obstacles! \n Take Another Turn";
            }
            else if (cardNum == 18){
                Draw = "Accio Broomstick! \n Take Another Turn";
            }
            else if (cardNum == 19){
                Draw = "Lumos! Your Path Is\n  Illuminated!  \nMove Forward 1 Space";
            }
            else if (cardNum == 20){
                Draw = "Defeat An Acromantula! \n Place One Of Your Movers \n On Your Home Row";
            }
            else if (cardNum == 21){
                Draw = "Expelliarmus! \n Move Another Player's Mover \n Anywhere On The Game Board";
            }
            else if (cardNum == 22){
                Draw = "Wind Gust Reveals A Shortcut! \n Move Forward 3 Spaces";
            }
            else if (cardNum == 23){
                Draw = "You Have Solved A Riddle \n From The Sphinx! \n Move Forward 1 Space";
            }
            else if (cardNum == 24){
                Draw = "Cruciatus Curse! \n Move One Of Your Movers \n Back To Start";
            }
            else{
                Draw = "Avada Kedavra! \n There Was An Error! \n Try Again";
            }
       return Draw;
    }
    
public static void main(String[] args) {
    launch (args);
}
    
}
    


    

