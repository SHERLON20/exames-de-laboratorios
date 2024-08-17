/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exames;
import javax.swing.JOptionPane;
/**
 *
 * @author sherl
 */
public class Exames {

    public static void main(String[] args) {
        String nome,sang;
        int idade,gl;
        nome = JOptionPane.showInputDialog(null, "digite seu nome:");
        sang= JOptionPane.showInputDialog("qual seu tipo sanguíneo?");
        idade=Integer.parseInt(JOptionPane.showInputDialog("digite o ano q você nasceu:"));
        int opc=Integer.parseInt(JOptionPane.showInputDialog("olá "+nome+" escreva o numero do exame pretendido a baixo: \n 1- glicemia\n 2- colesterol\n3- triglicerideos"));
        switch (opc) {
            case 1 -> {
                gl =Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de glicose por mg/l feito no laboratorio:"));
                if(gl <100){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\n idade = "+(2023-idade)+" anos\ntipo sanguíneo = "+sang+"\nresultado do exame = normoglicemia");
                    
                }
                else if(gl>=100 && gl<126){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\n idade = "+(2023-idade)+" anos\ntipo sanguíneo = "+sang+"\nresultado do exame = pré diabetes");
                }
                else{
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\n idade = "+(2023-idade)+" anos\ntipo sanguíneo = "+sang+"\nresultado do exame = diabetes estabelecido");
                }
            }
            case 2 -> {
                int ldl,hdl;
                String risco;
                ldl=Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de ldl"));
                hdl=Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de hdl"));
                risco=JOptionPane.showInputDialog("em qual risco vc se classifica?\n(B-baixo,M-medio,A-alto)");
                if(((2023-idade)<=19 && hdl>45 || (2023-idade)>20 && hdl>40)&& ( ldl<100 && ldl>70) ){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nrisco = baixo\nhdl = bom\nldl = bom");
                }
                else if(((2023-idade)<=19 && hdl>45 || (2023-idade)>20 && hdl>40)&& (ldl<70 && ldl>50) ){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nrisco = medio\nhdl = bom\nldl = médio");
                }
                else if(((2023-idade)<=19 && hdl>45 || (2023-idade)>20 && hdl>40)&& (ldl<50) ){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nrisco = alto\nhdl = bom\nldl = ruim/alto");
                }
                else {
                    if (ldl<100 && ldl>70){
                        JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nhdl = ruim\nldl = bom");
                    }
                    else if (ldl<70 && ldl>50){
                        JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nhdl = ruim\nldl = médio");
                    }
                    else if (ldl<50){
                        JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nhdl = ruim\nldl = ruim");
                    }
                }
            }
            case 3 -> {
                int trg;
                trg=Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de triglicerídios feita no laboratorio:"));
                if ((2023-idade)<=9 && trg<75){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nclassificação = triglicerídio bom");
                }
                else if (((2023-idade)>9 && (2023-idade)<=19)&& ( trg<90)){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nclassificação = triglicerídio bom");
                }
                else if ((2023-idade)>20 && ( trg<150)){
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nclassificação = triglicerídio bom");
                }
                else{
                    JOptionPane.showMessageDialog(null, "nome = "+nome+"\nidade = "+(2023-idade)+"\nclassificação = triglicerídio ruim");
                }
            }
            default -> JOptionPane.showMessageDialog(null, "erro tente reiniciar o programa novamente\ne pot favor tente fazer da maneira q está no enunciado.\nobrigado!");
        }
        }
    }


