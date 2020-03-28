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
        id = "todo.controller.edit.MarkAsCompletedTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/complete_tsk.gif",
        displayName = "#CTL_MarkAsCompletedTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 40, separatorBefore = 35),
    @ActionReference(path = "Toolbars/File", position = 40),
    @ActionReference(path = "Shortcuts", name = "D-SPACE")
})
@Messages("CTL_MarkAsCompletedTaskAction=Mark as Completed")
public final class MarkAsCompletedTaskAction implements ActionListener {

    private final List<EditCookie> context;

    public MarkAsCompletedTaskAction(List<EditCookie> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (EditCookie editCookie : context) {
            // TODO use editCookie
        }
    }
}
