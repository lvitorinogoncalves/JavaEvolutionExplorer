package com.exemplo.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InferenciaTipoVariavelLocal {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        Stream<String> stream1 = getStream();

        //Nova forma de declaração sem tipagem
        var list2 = new ArrayList<String>();
        var stream2 = getStream();

        System.out.println(list2.getClass());
        System.out.println(stream2.getClass());
    }

    private static Stream<String> getStream() {
        return Stream.of("Exemplo", "de", "Stream");
    }
}