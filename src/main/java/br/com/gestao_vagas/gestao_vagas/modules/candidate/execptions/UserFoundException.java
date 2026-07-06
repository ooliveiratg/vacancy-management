package br.com.gestao_vagas.gestao_vagas.modules.candidate.execptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("Usuário já existe");
    }
    
}
