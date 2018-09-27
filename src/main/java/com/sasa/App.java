package com.sasa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        InputStream in = null;
        Interpreter interpreter = null;
        try
        {
            //if (args.length == 0) {
            //    System.out.println("Usage: littlebasic <progamfile>.bas");
            //    System.exit(-1);
            //}

            final String path = "C:/dev/__JavaProjects/kbas/src/main/test/";
            String file = "1.bas";
            in = new FileInputStream(path + file);//args[0]);
            interpreter = new Interpreter(System.in, System.out, System.err);
            interpreter.run(in);
            interpreter.clear();

        }
        catch (IOException e)
        {
            System.out.println("Error running program: " + e.getMessage());
            System.exit(-1);
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    System.out.println("main "+e.getMessage());
                }
            }

            if (interpreter != null)
            {
                interpreter.clear();
            }

        }
        System.out.println("game over");
    }
}
