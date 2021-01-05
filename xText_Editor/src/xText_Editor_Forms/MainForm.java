
package xText_Editor_Forms;

import java.io.File;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author Concepts team
 */
public class MainForm extends javax.swing.JFrame {
    
    private String textCheckSaved = "";    // to check for saving file
    private boolean saved = true;
    private File file = null;

    public MainForm() {
        initComponents();
        this.setTitle(" xText Editor ");   // title
    }
    
    // Setters and Getters
    
    // the body of the editor
    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }
    
    public JTextArea getTxtArea() {
        return txtArea;
    }

    // copy
    public void setEditCopy(JMenuItem editCopy) {
        this.editCopy = editCopy;
    }
    
    public JMenuItem getEditCopy() {
        return editCopy;
    }

    // cut
    public void setEditCut(JMenuItem editCut) {
        this.editCut = editCut;
    }
    
    public JMenuItem getEditCut() {
        return editCut;
    }

    public void setEditDelete(JMenuItem editDelete) {
        this.editSelectAll = editDelete;
    }
    
    public JMenuItem getEditDelete() {
        return editSelectAll;
    }

    // paste
    public void setEditPaste(JMenuItem editPaste) {
        this.editPaste = editPaste;
    }
    
    public JMenuItem getEditPaste() {
        return editPaste;
    }

    // redo
    public void setEditRedo(JMenuItem editRedo) {
        this.editRedo = editRedo;
    }

    public JMenuItem getEditRedo() {
        return editRedo;
    }

    // undo
    public void setEditUndo(JMenuItem editUndo) {
        this.editUndo = editUndo;
    }

    public JMenuItem getEditUndo() {
        return editUndo;
    }

    // find
    public void setFind(JMenuItem find) {
        this.find = find;
    }

    public JMenuItem getFind() {
        return find;
    }

    // replace
    public void setReplace(JMenuItem replace) {
        this.replace = replace;
    }

    public JMenuItem getReplace() {
        return replace;
    }

    // Exit
    public void setFileExit(JMenuItem fileExit) {
        this.fileExit = fileExit;
    }

    public JMenuItem getFileExit() {
        return fileExit;
    }

    // new
    public void setFileNew(JMenuItem fileNew) {
        this.fileNew = fileNew;
    }

    public JMenuItem getFileNew() {
        return fileNew;
    }

    // open new
    public void setFileOpen(JMenuItem fileOpen) {
        this.fileOpen = fileOpen;
    }

    public JMenuItem getFileOpen() {
        return fileOpen;
    }

    // set as saved
    public void setFileSave(JMenuItem fileSave) {
        this.fileSave = fileSave;
    }

    public JMenuItem getFileSave() {
        return fileSave;
    }

    // save as
    public void setFileSaveAs(JMenuItem fileSaveAs) {
        this.fileSaveAs = fileSaveAs;
    }  

    public JMenuItem getFileSaveAs() {
        return fileSaveAs;
    }

    // save
    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public boolean isSaved() {
        return saved;
    }

    // set file
    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    // check if saved
    public void setTextCheckSaved(String textCheckSaved) {
        this.textCheckSaved = textCheckSaved;
    }

    public String getTextCheckSaved() {
        return textCheckSaved;
    }

    // change font editing
    public void setEditChangeFont(JMenuItem editChangeFont) {
        this.editChangeFont = editChangeFont;
    }

    public JMenuItem getEditChangeFont() {
        return editChangeFont;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fileSave = new javax.swing.JMenuItem();
        fileSaveAs = new javax.swing.JMenuItem();
        fileExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        editUndo = new javax.swing.JMenuItem();
        editRedo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        editCut = new javax.swing.JMenuItem();
        editCopy = new javax.swing.JMenuItem();
        editPaste = new javax.swing.JMenuItem();
        editSelectAll = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        find = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        editChangeFont = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogColorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogColorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        menuFile.setText("File");

        fileNew.setText("New");
        menuFile.add(fileNew);

        fileOpen.setText("Open");
        menuFile.add(fileOpen);
        menuFile.add(jSeparator1);

        fileSave.setText("Save");
        menuFile.add(fileSave);

        fileSaveAs.setText("Save As");
        menuFile.add(fileSaveAs);

        fileExit.setText("Exit ");
        menuFile.add(fileExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        editUndo.setText("Undo");
        menuEdit.add(editUndo);

        editRedo.setText("Redo");
        menuEdit.add(editRedo);
        menuEdit.add(jSeparator2);

        editCut.setText("Cut");
        menuEdit.add(editCut);

        editCopy.setText("Copy");
        menuEdit.add(editCopy);

        editPaste.setText("Paste");
        menuEdit.add(editPaste);

        editSelectAll.setText("SelectAll");
        menuEdit.add(editSelectAll);
        menuEdit.add(jSeparator3);

        find.setText("Find");
        menuEdit.add(find);

        replace.setText("Replace");
        menuEdit.add(replace);

        editChangeFont.setText("Change font");
        menuEdit.add(editChangeFont);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenuItem editChangeFont;
    private javax.swing.JMenuItem editCopy;
    private javax.swing.JMenuItem editCut;
    private javax.swing.JMenuItem editPaste;
    private javax.swing.JMenuItem editRedo;
    private javax.swing.JMenuItem editSelectAll;
    private javax.swing.JMenuItem editUndo;
    public javax.swing.JMenuItem fileExit;
    private javax.swing.JMenuItem fileNew;
    public javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenuItem fileSaveAs;
    private javax.swing.JMenuItem find;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem replace;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}