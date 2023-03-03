package Client;
import java.io.*;
import java.net.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class client extends Application {
    static Socket socket;
    static DataInputStream in;
    static DataOutputStream out;
    Label label = new Label("");
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 400, 400);

    public void start(Stage stage) throws Exception {
        label.setScaleX(5);
        label.setScaleY(5);
        label.setLayoutX(200);
        label.setLayoutY(200);
        pane.getChildren().add(label);
        scene.setOnKeyPressed(event -> {
            label.setText(event.getCode().getName());
        });
        scene.setOnKeyReleased(event->{
            label.setText("");
        });

        new Thread(() -> {
            do {

                if (label.getText( ).equals("A")) {
                    try {
                        out.writeUTF("A");
                    } catch (IOException e) {
                    }
                } else {
                    if (label.getText( ).equals("D")) {
                        try {
                            out.writeUTF("D");
                        } catch (IOException e) {
                        }
                    } else if (label.getText( ).equals("W")) {
                        try {
                            out.writeUTF("W");
                        } catch (IOException e) {
                        }
                    } else if (label.getText( ).equals("S")) {
                        try {
                            out.writeUTF("S");
                        } catch (IOException e) {
                        }
                    } else if (label.getText( ).equals("Space")) {
                        try {
                            out.writeUTF("Space");
                        } catch (IOException e) {
                        }
                    } else {
                        try {
                            out.writeUTF("Q");
                        } catch (IOException e) {
                        }
                    }
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                }
            } while (true);
        }).start();
        stage.setScene(scene);
        stage.setTitle("WORLD OF TANKS");
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
        try {
        socket=new Socket("localhost", 8000);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
