/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.projeto2;

/**
 *Classe Aluno
 * @author denis
 * @version 2.0
 */
public class Aluno {
    
        
    private String nome;
    private double frequencia;
    private double p1;
    private double trabalho;
    private double projeto;
    private double pf;
    
    /**
     * Construtor Time
    * @param h a hora
    * @param m o minuto
    * @throws Exceção no caso de uma data/hora inválida
     */
    
    public Aluno(String nome ,double frequencia, double p1, double trabalho, double projeto, double pf){
        this.nome = nome;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.trabalho = trabalho;
        this.projeto = projeto;
        this.pf = pf;        
    }
    
    /** Método para retorno do Nome do aluno

     *   @return String - {@link #nome */
    
    public String getNome(){
        return nome;
    }
    
    /** Método para retorno da frequencia do aluno

     *   @return double - {@link #frequencia */
    
    public double getFrequencia(){
        return frequencia;
    }
    
    /** Método para retorno da nota da P1

     *   @return double - {@link #p1 */
    
    public double getP1(){
        return p1;
    }
    
    /** Método para retorno da nota do Trabalho

     *   @return double - {@link #trabalho */
    
    public double getTrabalho(){
        return trabalho;
    }
    
    /** Método para retorno da nota do Projeto

     *   @return double - {@link #projeto */
    
    public double getProjeto(){
        return projeto;
    }
    
    /** Método para retorno da nota da PF

     *   @return double - {@link #pf */
    
    public double getPf(){
        return pf;
    }   
    
    
    /**
     * Metodo para verificar a situação do aluno na disciplina.
  
     * @return String - situação do aluno (Aprovado ou Reprovado).
     */
    
    public String situacao() {

        double m1;
        m1 = (0.7 * ((p1 + trabalho) / 2)) + projeto * 0.3;

        if (frequencia >= 0.75) {
            if (m1 >= 7) {
                return "Aprovado";
            } else if (m1 < 3) {
                return "Reprovado";
            } else {
                if ((pf + m1) / 2 >= 5) {
                    return "Aprovado";
                } else {
                    return "Reprovado";
                }
            }
        } else {
            return "Reprovado";
        }

    }
    
}