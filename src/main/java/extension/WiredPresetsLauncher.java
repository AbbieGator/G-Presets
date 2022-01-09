package extension;

import gearth.Main;
import gearth.extensions.ExtensionForm;
import gearth.extensions.ExtensionFormCreator;
import gearth.ui.GEarthController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WiredPresetsLauncher extends ExtensionFormCreator {
    @Override
    protected ExtensionForm createForm(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/wiredpresets.fxml"));
        Parent root = loader.load();

        stage.setTitle("Wired Presets 0.2.1");
        stage.setScene(new Scene(root));
        stage.getScene().getStylesheets().add(GEarthController.class.getResource("/gearth/themes/G-Earth/styling.css").toExternalForm());
        stage.getScene().getStylesheets().add(getClass().getResource("ui/logger.css").toExternalForm());
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/gearth/themes/G-Earth/logoSmall.png")));

        stage.setResizable(false);

        return loader.getController();
    }

    public static void main(String[] args) {
        runExtensionForm(args, WiredPresetsLauncher.class);
    }

}
