package com.demo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serializedemo {


        public static void main(String[] args){
            try{

                Employee E1  =new Employee(2000,"Deepak");
                FileOutputStream fout=new FileOutputStream("C:/JAVA IDE/Java IDE/output.txt");
                ObjectOutputStream out=new ObjectOutputStream(fout);
                out.writeObject(E1);
                out.flush();
                out.close();
                System.out.println("success");
            }catch(Exception exe){
                System.out.println(exe.getMessage());}
        }
    }
