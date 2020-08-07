package com.undefined.nossocodigo;

public class Usuario {
    
    String listaUsuario(Iterable<Cadastro> lista){
        String html = "";

        for(Cadastro c : lista){
            html = html +
            "<h1>"+c.getNome()+"</h1>"+
            c.getSenha()+"<br>"+
            c.getEmail()+"<br>"+
            "<br>"
            ;
        }
        return html;
    }
}