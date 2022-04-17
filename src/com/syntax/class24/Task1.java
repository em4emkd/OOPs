package com.syntax.class24;

public class Task1 {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++ or
    sublime text, to open .doc file we need Microsoft word to be installed etc
     */

    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};

        for(File f : files) {
            f.open();
            f.edit();
            f.close();
        }

        for (int i = 0; i < files.length; i++) {
            files[i].edit();
            files[i].open();
            files[i].close();
        }
        int i=0;
        while(files.length>0){
            files[i].edit();
            files[i].open();
            files[i].close();
            i++;
        }
    }
}
abstract class File{

    abstract void open();

    void edit(){
        System.out.println("File edited");
    }

    void close(){
        System.out.println("File closed");
    }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("to open pdf file you need Acrobat Reader DC");
    }
}



