package com.algorithms.string.medium;

import com.algorithms.array.Stack;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        int count = n * 2;

        List<String> outputList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();

        List<String> inputValue = asList("(", ")");
        int index = 1;
        while (index <= count) {
            if (outputList.isEmpty()) {
                outputList.add(")");
            } else {
                for (int i = 0; i < 2; i++) {
                    for (String str : outputList) {
                        tempList.add(inputValue.get(i) + str);
                    }
                }
                outputList = new ArrayList<>(tempList);
                tempList.clear();
            }
            index++;
        }

        return filterOutputList(outputList);
    }

    private List<String> filterOutputList(List<String> outputList) {
        List<String> outList = new ArrayList<>();

        for (String str : outputList) {
            Stack stack = new Stack();
            boolean correctStr = true;
            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        correctStr = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty() && correctStr) {
                outList.add(str);
            }
        }
        return outList;
    }

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        gp.generateParenthesis(3);
    }
}
