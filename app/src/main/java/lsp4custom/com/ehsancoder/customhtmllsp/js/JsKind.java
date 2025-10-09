package lsp4custom.com.ehsancoder.customhtmllsp.js;

public enum JsKind {
  Name("Name"),
  Var("Var"),
  Class("Class"),
  Method("Method"),
  Property("Property"),
  Function("Function");
  private String name;

  public String getName() {
    return name;
  }

  JsKind(String name) {
    this.name = name;
  }
}
