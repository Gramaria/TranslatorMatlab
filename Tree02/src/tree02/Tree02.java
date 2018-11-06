package tree02;

import java.util.*;
import java.lang.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Tree02 {

    public static String read(String fileName) throws FileNotFoundException {
    //Этот спец. объект для построения строки
    StringBuilder sb = new StringBuilder();
    exists(fileName);
    File file = new File(fileName);
    try {
        //Объект для чтения файла в буфер
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        try {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
    //Возвращаем полученный текст с файла
    return sb.toString();
    } 
   
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
    public static void main(String[] args) {
        try{
            // Scanner in = new Scanner(System.in);
            // String inLine = "";
            String name = "multiSmo";
            String fileName = "C:\\Рабочая\\Курсовая_маг2\\"+name+".py";
            String inLine = read("C:\\Рабочая\\Курсовая_маг1\\Тестовые\\"+name+".m");
            ANTLRInputStream input = new ANTLRInputStream(inLine);
            genGrammar2Lexer lexer = 
                    new genGrammar2Lexer((CharStream) input);// Настраиваем лексер на этот поток
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            genGrammar2Parser parser = new genGrammar2Parser(tokens);// Создаем парсер
            ParseTree tree = parser.genGrammar2();
            String a = parser.memory;
            System.out.println(a);
//            System.out.println(tree.toStringTree(parser));
            
            File file = new File(fileName);
            if(file.createNewFile()){
                System.out.println("Файл создан успешно!");
            }else System.out.println("Файл "+name+".py уже существует, он будет обновлен!");
            try(FileWriter writer = new FileWriter(fileName, false))
            {
                writer.write(a);
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            } 
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
}
