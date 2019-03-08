package com.github.ctjoreilly.module.app;

import com.github.ctjoreilly.module.lib.Lib;

public class App {
  public static void main(String[] args) {
    Lib lib = new Lib();
    System.out.println("module-app: lib call # args: "+lib.doSomething(args.length));
  }
}
