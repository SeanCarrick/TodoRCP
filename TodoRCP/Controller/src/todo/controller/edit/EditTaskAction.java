/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.controller.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import todo.model.Task;

@ActionID(
        category = "Edit",
        id = "todo.controller.edit.EditTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/configs.gif",
        displayName = "#CTL_EditTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 20),
    @ActionReference(path = "Toolbars/Clipboard", position = 20),
    @ActionReference(path = "Shortcuts", name = "O-ENTER")
})
@Messages("CTL_EditTaskAction=Edit Task...")
public final class EditTaskAction implements ActionListener {

    private final Task context;

    public EditTaskAction(Task context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        // TODO use context
    }
}
