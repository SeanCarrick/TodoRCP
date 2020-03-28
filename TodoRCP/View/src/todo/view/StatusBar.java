/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.view;

import java.awt.Component;
import javax.swing.JLabel;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
@ServiceProvider(service=StatusLineElementProvider.class, position=1)
public class StatusBar implements StatusLineElementProvider{

    @Override
    public Component getStatusLineElement() {
        return new JLabel("There are no task alerts for today.");
    }
    
}
