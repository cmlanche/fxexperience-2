/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fxexperience.tools.styler.util;

import java.io.File;
import javafx.stage.FileChooser;

/**
 *
 * @author ericc
 */
public class FileUtils {

    /**
     * Define file extension filters to filtering supported image files, matching files whose
     * extensions are: *.css
     *
     * @param fileChooser
     */
    public static void configure(FileChooser fileChooser) {
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All CSS", "*.css"),
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("CSS", "*.css"));
        // Set "." as default dir
        fileChooser.setInitialDirectory(new File("."));
    }
}
