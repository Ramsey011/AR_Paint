package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Controller {
    @FXML
    public Pane pane;
    @FXML
    Slider size;
    @FXML
    ColorPicker colorpick;
    @FXML
    Label label1;
    @FXML
    Label label2;
    double x = 0, y = 0;
    Ellipse ellipse = null;
    boolean RectSelected = false;
    boolean ErasserSelected = false;
    boolean LineSelected = false;
    boolean BrushSelected = false;
    boolean CircleSelected = false;
    boolean RRSelected = false;
    boolean EllipseSelected = false;


    public void mousedragged(MouseEvent mouseEvent) {
        double x1 = mouseEvent.getSceneX();
        double y1 = mouseEvent.getSceneY();
        label1.setText(mouseEvent.getSceneX() + "");
        label2.setText(mouseEvent.getSceneX() + "");
        if(RectSelected){

        }
    }

    public void mousereleased(MouseEvent mouseEvent) {
        double x1 = mouseEvent.getSceneX();
        double y1 = mouseEvent.getSceneY();
    }

    public void mousepressed(MouseEvent mouseEvent) {
        x = mouseEvent.getSceneX();
        y = mouseEvent.getSceneY();

    }

    public void mousemoved(MouseEvent mouseEvent) {
        label1.setText(mouseEvent.getSceneX() + "");
        label2.setText(mouseEvent.getSceneX() + "");
    }

    public void onlineclicked(ActionEvent actionEvent) {
        LineSelected ^= true;
        RectSelected = false;
        CircleSelected = false;
        BrushSelected = false;
        ErasserSelected= false;
        RRSelected= false;
    }

    public void oncircleclicked(ActionEvent actionEvent) {
        LineSelected ^= true;
        RectSelected = false;
        CircleSelected = false;
        BrushSelected = false;
        ErasserSelected= false;
        RRSelected= false;
    }

    public void onrectclicked(ActionEvent actionEvent) {
        LineSelected ^= true;
        RectSelected = false;
        CircleSelected = false;
        BrushSelected = false;
        ErasserSelected= false;
        RRSelected= false;
    }

    public void Erassing(ActionEvent actionEvent) {
        LineSelected ^= true;
        RectSelected = false;
        CircleSelected = false;
        BrushSelected = false;
        ErasserSelected= false;
        RRSelected= false;
    }

    public void roundedrect(ActionEvent actionEvent) {
        LineSelected ^= true;
        RectSelected = false;
        CircleSelected = false;
        BrushSelected = false;
        ErasserSelected= false;
        RRSelected= false;

    }
}


