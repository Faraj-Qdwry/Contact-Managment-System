package contactmanagementsoftware.commands;

public interface Command {
    public void execute(java.awt.event.ActionEvent evt);
    public void undo(java.awt.event.ActionEvent evt);
}
