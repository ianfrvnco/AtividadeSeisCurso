/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        
        System.out.println("Media: "+aluno.calcularMedia());
        aluno.mostrarDados();
        aluno.calcularAprovacao();
        
    }

}
