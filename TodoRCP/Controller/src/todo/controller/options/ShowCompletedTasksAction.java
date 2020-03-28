/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.controller.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "todo.controller.options.ShowCompletedTasksAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/showtsk_tsk.gif",
        displayName = "#CTL_ShowCompletedTasksAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 10, separatorAfter = 15),
    @ActionReference(path = "Toolbars/Memory", position = 10),
    @ActionReference(path = "Shortcuts", name = "F10")
})
@Messages("CTL_ShowCompletedTasksAction=Show Completed Tasks")
public final class ShowCompletedTasksAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
