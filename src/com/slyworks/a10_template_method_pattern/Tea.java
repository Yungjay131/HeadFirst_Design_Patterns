package com.slyworks.a10_template_method_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    //testing the concept of hooks

    @Override
    public boolean shouldCondimentsBeAdded() {
        String answer = getUserInput();

        return answer.startsWith("y");
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)");


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
         answer = br.readLine();
        }catch(IOException ioe){
            System.err.println("IO error trying to read your answer");
        }catch(Exception e){
            System.err.println("an error occurred");
        }

        if(answer == null) return "no";
        return answer.toLowerCase();
    }
}
