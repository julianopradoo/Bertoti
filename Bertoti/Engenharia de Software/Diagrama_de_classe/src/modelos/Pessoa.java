/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Juliano
 */
public class Pessoa {
    
    String nome;
    String endereco;
    String bairro;
    int cep;
    String cidade;
    String estado;
    PessoaFisica cpf;
    PessoaJuridica cnpj;
    Contato contato;

    public Pessoa(String nome, String endereco, String bairro, int cep, String cidade, String estado, PessoaFisica cpf, PessoaJuridica cnpj, Contato contato) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PessoaFisica getCpf() {
        return cpf;
    }

    public void setCpf(PessoaFisica cpf) {
        this.cpf = cpf;
    }

    public PessoaJuridica getCnpj() {
        return cnpj;
    }

    public void setCnpj(PessoaJuridica cnpj) {
        this.cnpj = cnpj;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome 
                + ", endereco=" + endereco 
                + ", bairro=" + bairro 
                + ", cep=" + cep 
                + ", cidade=" + cidade 
                + ", estado=" + estado 
                + ", cpf=" + cpf 
                + ", cnpj=" + cnpj 
                + ", contato=" + contato + '}';
    }
    
    
    
    
    
    
    
    
}
