package com.example.operacionesbasicas;

public class FuncionesMatematicas
{
    private Integer num1;
    private Integer num2;
    private Integer suma;
    private Integer resta;
    private Integer multiplicacion;
    private Integer division;

    public FuncionesMatematicas(int i, int parseInt){}//constructor vacio

    public FuncionesMatematicas(Integer a, Integer b, Integer suma, Integer resta, Integer multiplicacion, Integer division){
        this.num1 = a;
        this.num1 = b;
    }

    //get y set
    public Integer getNum1(){
        return num1;
    }

    public void setNum1(Integer num1){
        this.num1 = num1;
    }

    public Integer getNum2(){
        return num2;
    }

    public void setNum2(Integer num2){
        this.num2 = num2;
    }

    //calculos
    public Integer suma (Integer a, Integer b){
        return suma = a + b;
    }

    public Integer resta (Integer a, Integer b){
        return resta = a - b;
    }

    public Integer multiplicacion (Integer a, Integer b){
        return multiplicacion = a * b;
    }

    public Integer division (Integer a, Integer b){
        return division = a / b;
    }
}// FuncionesMatematicas