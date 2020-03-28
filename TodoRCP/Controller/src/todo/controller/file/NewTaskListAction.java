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
        id = "todo.controller.file.NewTaskListAction"
)
@ActionRegistration(
        displayName = "#CTL_NewTaskListAction"
)
@ActionReference(path = "Menu/File", position = 10)
@Messages("CTL_NewTaskListAction=New Task List...")
public final class NewTaskListAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
