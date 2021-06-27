package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int numero = 0;
	
	private void atualizarlabelNumero(Label label) {
		label.setText(Integer.toString(numero));
		label.getStyleClass().remove("azul");
		label.getStyleClass().remove("vermelha");
		if (numero > 0) {
			label.getStyleClass().add("azul");
		} else if (numero < 0) {
			label.getStyleClass().add("vermelha");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		labelTitulo.getStyleClass().add("titulo");
		labelNumero.getStyleClass().add("numero");		

		Button botaoIncremento = new Button("+");
		Button botaoDecremento = new Button("-");
		botaoIncremento.getStyleClass().add("botoes");
		botaoDecremento.getStyleClass().add("botoes");

		botaoDecremento.setOnAction(e -> {
			numero--;
			atualizarlabelNumero(labelNumero);
			//if (numero < 0) {
			//	labelNumero.getStyleClass().add("vermelha");
			//}
		});

		botaoIncremento.setOnAction(e -> {
			numero++;
			atualizarlabelNumero(labelNumero);
			//if (numero > 0) {
			//	labelNumero.getStyleClass().add("azul");
			//}
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm();

		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.centerOnScreen();
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args); // é possivel passar uma classe no lugar de args
	}

}
