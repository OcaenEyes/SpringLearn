package com.gzy.springtest.loosely_coupled_test01;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutpt(){
        this.outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;

    }
}
