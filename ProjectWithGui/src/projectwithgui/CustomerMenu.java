
package projectwithgui;

import java.io.FileInputStream;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class CustomerMenu extends Scene {
    
    public CustomerMenu(Parent parent,Customer c1,Stage primaryStage, double d, double d1) {
        super(parent, d, d1);
     FileInputStream input=null;
        try{
          
           input=new FileInputStream("luxury-cars-in-monaco-c-drozdin-vladimir_2.jpg");
       }
        catch(Exception e){
            e.printStackTrace();
        }
             HBox v= new HBox();
       Image img= new Image(input);
      ImageView view = new ImageView(img);
      view.setFitHeight(1500);
      view.setFitWidth(1500);
      view.setPreserveRatio(true);
      
      
      //////////////
      StackPane s1= new StackPane();
        
        
      
          primaryStage.setTitle("Main menu");
         Button BookCar= new Button("Book A Car");
          Button BookingStat= new Button("Booking status"); 
          
          Button BookingHist= new Button("Booking History");
          
        Button EditBooking= new Button("Edit Booking");
       Button DeleteBooking= new Button("Delete Booking");
       Button logout= new Button("Log out");
        VBox layout = new VBox();
        layout.getChildren().addAll(BookCar,BookingStat,BookingHist,EditBooking,DeleteBooking,logout);
        layout.setPadding(new Insets(20));
        layout.setSpacing(30);
        
        
//StackPane layout = new StackPane();
layout.getChildren().add(view);

   
        
        Font font = new Font("Arial Black",18);
       BookCar.setFont(font);
       BookingStat.setFont(font);
       BookingHist.setFont(font);
       EditBooking.setFont(font);
       DeleteBooking.setFont(font);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        BookCar.setOnAction((ActionEvent event) -> {
            VBox v1= new VBox();
            BookCarForm b1= new BookCarForm(v1,c1,primaryStage,100,100);
            primaryStage.setScene(b1);
                         primaryStage.show();
        });
        //////////////////////
        BookingHist.setOnAction((ActionEvent event) -> {
             VBox v1= new VBox();
            BookingHistoryForm b1= new BookingHistoryForm(v1,c1,primaryStage,900,600);
            primaryStage.setScene(b1);
                         primaryStage.show();
        });
        DeleteBooking.setOnAction((ActionEvent event) -> {
             VBox v1= new VBox();
            DeleteBookingForm b1= new  DeleteBookingForm(v1,c1,primaryStage,100,100);
            primaryStage.setScene(b1);
                         primaryStage.show();
        });
        EditBooking.setOnAction((ActionEvent event) -> {
             VBox v1= new VBox();
           EditBookingForm b1= new EditBookingForm(v1,c1,primaryStage,100,100);
           primaryStage.setScene(b1);
                         primaryStage.show();
        });
        BookingStat.setOnAction((ActionEvent event) -> {
              VBox v1= new VBox();
           BookingStatusForm b1= new BookingStatusForm(v1,c1,primaryStage,100,100);
           primaryStage.setScene(b1);
                         primaryStage.show();
        });
        logout.setOnAction((ActionEvent event)->{
            VBox v1= new VBox();
           GetStarted b1= new GetStarted(v1,primaryStage,100,100);//900,600
           primaryStage.setScene(b1);
                         primaryStage.show();
        });
        setRoot(layout);
        
        
        ////////////
         s1.setPadding(new Insets(30));
         s1.getChildren().addAll(view,layout);
        setRoot(s1);
    }
    
}
