import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class SetterGetterGenerator {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Usage : java SetterGetterGenerator class_name (without extension)");
            return;
        }
        String className = args[0];
        try {
            Class c = Class.forName(className);
            Field fields[] = c.getDeclaredFields();
            Field field;
            ArrayList<String> AL = new ArrayList<>();
            String setterName;
            String getterName;
            String tmp;
            String fieldName;
            String line;
            Class fieldType;
            for (int e = 0; e < fields.length; e++) {
                field = fields[e];
                fieldType = field.getType();
                fieldName = field.getName();
                if (fieldName.charAt(0) >= 97 && fieldName.charAt(0) <= 122) {
                    tmp = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                } else {
                    tmp = fieldName;
                }
                setterName = "set" + tmp;
                getterName = "get" + tmp;
                line = "public void " + setterName + "(" + fieldType.getName() + " " + fieldName + ")";
                AL.add(line);
                AL.add("{");
                line = "this." + fieldName + " = " + fieldName + ";";
                AL.add(line);
                AL.add("}");
                line = "public " + fieldType.getName() + " " + getterName + "()";
                AL.add(line);
                AL.add("{");
                line = "return this." + fieldName + ";";
                AL.add(line);
                AL.add("}");
            }
            File file = new File("tmp.tmp");
            if (file.exists())
                file.delete();
            RandomAccessFile randomAccessFile;
            randomAccessFile = new RandomAccessFile(file, "rw");
            Iterator<String> iterator = AL.iterator();
            while (iterator.hasNext()) {
                line = iterator.next();
                randomAccessFile.writeBytes(line + "\r\n");
            }
            FileInputStream fin = new FileInputStream("tmp.tmp");
            BufferedInputStream bin = new BufferedInputStream(fin);
            String s = "";
            int i;
            while ((i = bin.read()) != -1) {
                s += (char) i;
            }
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(s);
            clipboard.setContents(selection, null);
            System.out.print("\nSetter/Getters copied to clipboard :)\n");
            randomAccessFile.close();
            bin.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class : " + cnfe.getMessage() + " Not found");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}