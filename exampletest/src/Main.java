import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) throws IOException {}
    void printCollection(Collection<? extends MyParent> c) {
        // 컴파일 에러
        for (MyChild e : c) {
            System.out.println(e);
        }

        for (MyParent e : c) {
            System.out.println(e);
        }

        for (MyGrandParent e : c) {
            System.out.println(e);
        }

        for (Object e : c) {
            System.out.println(e);
        }
    }
}class MyGrandParent {

}

class MyParent extends MyGrandParent {

}

class MyChild extends MyParent {

}
