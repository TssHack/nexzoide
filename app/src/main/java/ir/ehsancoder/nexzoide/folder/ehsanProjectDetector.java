package ir.ehsancoder.nexzoide.folder;

import java.io.File;

public class ehsanProjectDetector {

  protected static boolean isehsanLang(String path) {
    var file = new File(path);
    if (!file.isDirectory()) {
      return false;
    }
    var apps = new File(file, "apps");
    var res = new File(apps, "res");
    var ehsans = new File(res, "ehsans");
    var protectedJson = new File(ehsans, "protectedJson.json");
    return protectedJson.exists() && protectedJson.isFile();
  }
}
