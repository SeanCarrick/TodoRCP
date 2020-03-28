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
        id = "todo.controller.options.SortByPriorityTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/next_nav.gif",
        displayName = "#CTL_SortByPriorityTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 20),
    @ActionReference(path = "Toolbars/Memory", position = 20),
    @ActionReference(path = "Shortcuts", name = "F11")
})
@Messages("CTL_SortByPriorityTaskAction=Sort by Priority")
public final class SortByPriorityTaskAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
