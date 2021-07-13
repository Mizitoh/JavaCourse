package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{
	
	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1);
		//uma caixa sobre a outra
		//vamos alterar com o mouse
		
		setOnMouseClicked(event -> {
			//System.out.println("Click");
			//vamos identificar que posição aconteceu o click
			if(event.getSceneX() > getScene().getWidth()/2) {
				//pegamos a escala x, a cena, dividimos a largura em dois e isso representa o direito
				//System.out.println("direito");
				getChildren().get(0).toFront();//joga o ultimo elemento da fila para frente
			} else {
				//System.out.println("esquerdo");
				getChildren().get(5).toBack();
			}
		});
		
		Thread t = new Thread(()-> {
			//laço infinito com true
			while(true) {
				try {
					Thread.sleep(2000);
					
					Platform.runLater(() -> {
						//classe de java fx que vai fazer funcionar a thread
						//para swing seria outra classe
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}			
		});
		
		t.setDaemon(true);
		t.start();
	}

}
