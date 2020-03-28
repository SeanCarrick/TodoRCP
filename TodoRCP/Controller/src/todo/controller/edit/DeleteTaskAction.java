/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.controller.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.cookies.EditCookie;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "todo.controller.edit.DeleteTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/delete_obj.gif",
        displayName = "#CTL_DeleteTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 30),
    @ActionReference(path = "Toolbars/Clipboard", position = 30),
    @ActionReference(path = "Shortcuts", name = "DELETE")
})
@Messages("CTL_DeleteTaskAction=Remove Task")
public final class DeleteTaskAction implements ActionListener {

    private final List<EditCookie> context;

    public DeleteTaskAction(List<EditCookie> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (EditCookie editCookie : context) {
            // TODO use editCookie
        }
    }
}
