package com.home.library.pages;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    /*
    Open a file present in the code directory, assume file name as “Folk Story”. Create a copy of the file as “Folk Story 2”, and in this file -
    Delete all blank lines

o   Read each line into an array and index each line with a line number

o   Find “and” in each line, print all the line numbers where ”and” is found and the total number of “and”s (Eg: “the word “and” was found in line 3,5,6,9,11, a total of 12 times)

o   Scramble every 3rd word in each line (Eg: the -> eht, child -> ichld, lower -> owler, and -> nad etc)

o   Insert “New Paragraph begins here…” at the end of every 20th line in a file

o   At the end of the original “Folk Story” file, print “Here’s the modified content…” and append all the content from “Folk Story 2”

o   Delete “Folk Story 2” file
     */

    public static void main(String[] args) throws Exception {

        File source = new File("Folk Story.txt");
        File dest = new File("Folk Story 2.txt");

        BufferedReader br = new BufferedReader(new FileReader(source));
        ArrayList<String> originalFile = new ArrayList<>();

        String ln;

        while ((ln = br.readLine()) != null) {
            originalFile.add(ln);
        }
        br.close();

        ArrayList<String> listOfLines = new ArrayList<>();

        copyFileUsingChannel(source, dest);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dest));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            listOfLines.add(line);
        }
        bufferedReader.close();


        //delete all blank lines
        for (int i = 0; i < listOfLines.size(); i++) {
            if (listOfLines.get(i).isEmpty()) {
                listOfLines.remove(i);
                i--;
            }

        }
        System.out.println("listOfLines = " + listOfLines.get(3));
        System.out.println("listOfLines = " + listOfLines.size());
        for (String listOfLine : listOfLines) {
            System.out.println("listOfLine = " + listOfLine);

        }

        // find total number of and and lines
        ArrayList<Integer> andLines = new ArrayList<>();
        int andCounter = 0;
        for (int i = 0; i < listOfLines.size(); i++) {
            if (listOfLines.get(i).contains("and")) {
                andLines.add(i + 1);
                andCounter++;
            }
        }
        System.out.println("the word 'and' was found in line " + andLines.toString() + ", a total of " + andCounter + " times");

        // scramble every thirth in each line
        String[] wordList;
        for (int i = 0; i < listOfLines.size(); i++) {
            wordList = listOfLines.get(i).split(" ");
            String thirthWord = wordList[2];
            System.out.println("thirthWord = " + thirthWord);
            wordList[2] = scrambleWord(thirthWord);
            System.out.println("wordList = " + wordList[2]);
            String str = "";
            for (int j = 0; j < wordList.length; j++) {
                str = str + " " + wordList[j];
            }
            listOfLines.remove(i);
            listOfLines.add(i, str);
        }
        System.out.println("listOfLines = " + listOfLines);

        // add file2 to file1
        source.delete();

        String[] last = new String[22 + listOfLines.size()];

        System.out.println("last.length = " + last.length);
        System.out.println("originalFile = " + originalFile.size());
        System.out.println("listOfLines = " + listOfLines.size());

        for (int i = 0; i < last.length - 1; i++) {
            if (i >= 0 && i < originalFile.size()) {
                last[i] = originalFile.get(i);
            } else if (i >= originalFile.size() && i < 19) {
                last[i] = "";
            } else if (i == 19) {
                last[i] = " New Paragraph begins here...";
            } else if (i > 19 && i < last.length - 2) {

                last[i] = listOfLines.get(i - 20);

            } else {
                last[i] = " Here's the modified content...";
            }
        }


        File newFile = new File("Folk Story.txt");
        FileWriter fileWr = new FileWriter(newFile);
        fileWr.write(last[0]);
        for (int i = 1; i < last.length - 1; i++) {
            fileWr.append("\n" + last[i]);
        }

        fileWr.close();


        // delete file
        dest.delete();


    }

    private static String scrambleWord(String thirthWord) {

        char[] letter = new char[thirthWord.length()];
        for (int i = 0; i < letter.length; i++) {
            letter[i] = thirthWord.charAt(i);
        }
        char c = letter[0];
        System.out.println("letter = " + letter.length);
        if (letter.length > 2) {
            letter[0] = letter[2];
            letter[2] = c;
        } else if (letter.length == 2) {
            letter[0] = letter[1];
            letter[1] = c;
        }
        String newWord = "";
        for (int i = 0; i < letter.length; i++) {
            newWord = newWord + letter[i];
        }
        return newWord;
    }

    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
    }
}