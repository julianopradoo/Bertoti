/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import modelos.Contato;
import modelos.Pessoa;
import modelos.PessoaFisica;
import modelos.PessoaJuridica;


/**
 *
 * @author Juliano
 */
public class NewMain {

    

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa1 = new Pessoa("Juliano","RuaTeste","BairroTeste",12312312,"Caçapava","SP",null,null,null);
        
        System.out.println(pessoa1.toString());
        
         Contato contato1  = new Contato("julianoprado98@gmail.com", "991264489", 012); 
    
    PessoaFisica pessoafisica1 = new PessoaFisica(389999999, 99999999, "funcionario");
    
    PessoaJuridica pessoajuridica1 = new PessoaJuridica(33333333, "empresa");
    
    Pessoa pessoa2 = new Pessoa("Juliano","RuaTeste","BairroTeste",12312312,"Caçapava","SP",pessoafisica1,pessoajuridica1,contato1);
    
    System.out.println(pessoa2.toString());
    System.out.println(pessoa2.getContato().toString());
    }
    
   
    
    
}
