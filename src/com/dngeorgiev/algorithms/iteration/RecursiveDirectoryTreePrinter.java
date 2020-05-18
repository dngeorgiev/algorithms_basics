package com.dngeorgiev.algorithms.iteration;

import java.io.File;

public final class RecursiveDirectoryTreePrinter {
    private static final String SPACES = "  ";

    public static void main(String[] args) {
        assert args != null : "args can't be null";

        if (args.length != 1) {
            System.err.println("Usage: RecursiveDirectoryTreePrinter <dir>");
            System.exit(4);
        }

        print(new File(args[0]), "");
    }

    private static void print(File file, String indent) {
        assert file != null : "file can't be null";
        assert indent != null : "indent can't be null";

        System.out.print(indent);
        System.out.println(file.getName());

        if (file.isDirectory()) {
            print(new ArrayIterator(file.listFiles()), indent + SPACES);
        }
    }

    private static void print(Iterator files, String indent) {
        assert files != null : "files can't be null";
        assert indent != null : "indent can't be null";

        for (files.first(); !files.isDone(); files.next()) {
            print((File) files.current(), indent);
        }
    }
}
