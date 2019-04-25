package com.mikeDev49;

import com.mikeDev49.Commands.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Value.Initialize();

        Debugger.debug = false;

        Lexer lexer = new Lexer();
        Parser parser = new Parser();

        parser.commands.add(new CmdFLUSHSTACK());
        parser.commands.add(new CmdPUSHCHAR());
        parser.commands.add(new CmdINIT());
        parser.commands.add(new CmdPOP());
        parser.commands.add(new CmdPUSHINT());
        parser.commands.add(new CmdADD());
        parser.commands.add(new CmdPOPSTACK());
        parser.commands.add(new CmdCLEARBUFFER());
        parser.commands.add(new CmdCOPY());
        parser.commands.add(new CmdPASTE());
        parser.commands.add(new CmdFLUSH());
        parser.commands.add(new CmdEXIT());
        parser.commands.add(new CmdDIV());
        parser.commands.add(new CmdMUL());
        parser.commands.add(new CmdSUB());

        try {
            if (args[0] != null) {
                try {
                    FileReader fr = new FileReader(args[0]);
                    BufferedReader br = new BufferedReader(fr);

                    String line;
                    List<String> lines = new ArrayList<>();

                    while ((line = br.readLine()) != null) {
                        lines.add(line + "\n");
                        Debugger.s_debug(line);
                    }

                    lexer.Analyze(String.join("\n", lines));

                    parser.Parse(lexer.pairs);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        } catch (Exception e) {
            try {
                FileReader fr = new FileReader("D:\\MIK\\Documents\\JavaProjects\\ProgLangPlease\\src\\com\\mikeDev49\\test.yasl");
                BufferedReader br = new BufferedReader(fr);

                String line;
                List<String> lines = new ArrayList<>();

                while ((line = br.readLine()) != null) {
                    lines.add(line + "\n");
                    Debugger.s_debug(line);
                }

                lexer.Analyze(String.join("\n", lines));

                parser.Parse(lexer.pairs);
            } catch (Exception e1) {
                e.printStackTrace();
            }
        }
    }
}
