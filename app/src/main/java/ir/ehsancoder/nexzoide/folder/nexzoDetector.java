package ir.ehsancoder.nexzoide.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class nexzoDetector {

    protected static boolean isnexzoFile(String filePath) {
        File file = new File(filePath);
        if (file.isDirectory()) {
            return false;
        }
        String fileName = file.getName();
        return fileName.equals("nexzoThemeapp.nexzo");
    }

    protected static List<File> findnexzoFiles(String directoryPath) {
        File directory = new File(directoryPath);
        List<File> readmeFiles = new ArrayList<>();
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (isnexzoFile(file.getAbsolutePath())) {
                    readmeFiles.add(file);
                }
                if (file.isDirectory()) {
                    readmeFiles.addAll(findnexzoFiles(file.getAbsolutePath()));
                }
            }
        }
        return readmeFiles;
    }

    protected static boolean isAppLoaderTheme(String dirPath) {
        File file = new File(dirPath);
        if (!file.isDirectory()) {
            return false;
        }
        File gitDir = new File(file, "nexzoWebIDE");
        return gitDir.exists() && gitDir.isDirectory();
    }
}
