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
        id = "todo.controller.options.SortByDueDateTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/next_nav.gif",
        displayName = "#CTL_SortByDueDateTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 30, separatorAfter = 35),
    @ActionReference(path = "Toolbars/Memory", position = 30),
    @ActionReference(path = "Shortcuts", name = "F12")
})
@Messages("CTL_SortByDueDateTaskAction=Sort by Due Date")
public final class SortByDueDateTaskAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
