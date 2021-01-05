
package xtext_editor;

import xText_Editor_Forms.MainForm;

/**
 *
 * @author Concepts team
 */
public class MainController {
    public static void main(String[] args) {
        
        // Take object from main form
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        
        // Take object from edit form
        EditController edit = new EditController();
        edit.controller(mainForm);
        
        // Take object from file form
        FileController file = new FileController();
        file.controller(mainForm);
    }
}
