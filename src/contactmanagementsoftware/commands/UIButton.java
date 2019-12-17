package contactmanagementsoftware.commands;

public class UIButton {

    static Command slot;

    public UIButton(Command command) {
        slot = command;
    }

    public static void setCommand(Command command) {
        slot = command;
    }

    public void execute(java.awt.event.ActionEvent evt) {
        slot.execute(evt);
    }
}
