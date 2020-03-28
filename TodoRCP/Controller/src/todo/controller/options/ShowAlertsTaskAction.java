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
        id = "todo.controller.options.ShowAlertsTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/showwarn_tsk.gif",
        displayName = "#CTL_ShowAlertsTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 3333),
    @ActionReference(path = "Toolbars/Memory", position = 0),
    @ActionReference(path = "Shortcuts", name = "F9")
})
@Messages("CTL_ShowAlertsTaskAction=Show Alerts...")
public final class ShowAlertsTaskAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
