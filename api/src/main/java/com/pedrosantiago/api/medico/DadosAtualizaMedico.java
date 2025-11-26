package com.pedrosantiago.api.medico;

import com.pedrosantiago.api.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizaMedico(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {}
