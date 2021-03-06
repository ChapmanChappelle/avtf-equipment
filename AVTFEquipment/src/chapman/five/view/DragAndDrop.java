package chapman.five.view;

import chapman.five.view.StudentWelcomeScreenController;
import javafx.event.EventHandler;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public abstract class DragAndDrop {
/*

	//source is the menuitem
	source.setOnDragDetected(new EventHandler <MouseEvent>() {
		public void handle(MouseEvent event) {
			// drag was detected, start drag-and-drop gesture//
			System.out.println("onDragDetected");

			// allow any transfer (I think this is how you do it- need to do more research //
			Dragboard db = source.startDragAndDrop(TransferMode.ANY);

			// put a string on dragboard //
			ClipboardContent content = new ClipboardContent();
			content.putString(source.getText());
			db.setContent(content);

			event.consume();
		}
	});

	target.setOnDragOver(new EventHandler <DragEvent>() {
		public void handle(DragEvent event) {
			// test to see if DragOver is working //
			System.out.println("onDragOver");

			// accept it only if it is  not dragged from the same node 
			// and if it has a string data //
			if (event.getGestureSource() != target &&
					event.getDragboard().hasString()) {
				// allow for both copying and moving, whatever user chooses //
				event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
			}

			event.consume();
		}
	});

	target.setOnDragEntered(new EventHandler <DragEvent>() {
		public void handle(DragEvent event) {
			// another println to see if onDragEntered //
			System.out.println("onDragEntered");
			// show to the user that it is an actual gesture target //
			if (event.getGestureSource() != target &&
					event.getDragboard().hasString()) {
				target.setFill(Color.GREEN);
			}

			event.consume();
		}
	});

	target.setOnDragExited(new EventHandler <DragEvent>() {
		public void handle(DragEvent event) {
			// mouse moved away, remove the graphical cues //
			target.setFill(Color.BLACK);

			event.consume();
		}
	});

	target.setOnDragDropped(new EventHandler <DragEvent>() {
		public void handle(DragEvent event) {
			// data dropped //
			System.out.println("onDragDropped");
			// if there is a string data on dragboard, read it and use it //
			Dragboard db = event.getDragboard();
			boolean success = false;
			if (db.hasString()) {
				target.setText(db.getString());
				success = true;
			}
			// let the source know whether the string was successfully 
			// transferred and used //
			event.setDropCompleted(success);

			event.consume();
		}
	});

	source.setOnDragDone(new EventHandler <DragEvent>() {
		public void handle(DragEvent event) {
			// the drag-and-drop gesture ended //
			System.out.println("onDragDone");
			// if the data was successfully moved, clear it //
			if (event.getTransferMode() == TransferMode.MOVE) {
				source.setText("");
			}

			event.consume();
		}
	});


}

*/
}

