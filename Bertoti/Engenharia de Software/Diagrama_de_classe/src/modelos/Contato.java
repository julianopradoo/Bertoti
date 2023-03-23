/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Juliano
 */
public class Contato {
    
    String email;
    String telefone;
    int ddd;

    public Contato(String email, String telefone, int ddd) {
        this.email = email;
        this.telefone = telefone;
        this.ddd = ddd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Contato{" + "email=" + email + ", telefone=" + telefone + ", ddd=" + ddd + '}';
    }
    
    
    
    
    
    
    
}
