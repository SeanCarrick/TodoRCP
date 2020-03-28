/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.controller.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "todo.controller.file.OpenTaskListAction"
)
@ActionRegistration(
        displayName = "#CTL_OpenTaskListAction"
)
@ActionReference(path = "Menu/File", position = 20, separatorAfter = 25)
@Messages("CTL_OpenTaskListAction=Open Task List...")
public final class OpenTaskListAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
