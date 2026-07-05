package br.com.gestao_vagas.gestao_vagas.modules.candidate.execptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String message;
    private String field;
    
}
