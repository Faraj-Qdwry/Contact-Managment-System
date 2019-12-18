package contactmanagementsoftware.commands;

public class UIButtonManager {

    static Command slot;

    public UIButtonManager(Command command) {
        slot = command;
    }

    public static void setCommand(Command command) {
        slot = command;
    }

    public void execute(java.awt.event.ActionEvent evt) {
        slot.execute(evt);
    }
}
