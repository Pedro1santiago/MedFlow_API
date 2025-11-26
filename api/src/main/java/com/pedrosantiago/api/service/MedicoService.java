package com.pedrosantiago.api.service;

import com.pedrosantiago.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    public void cadastrar(DadosCadastroMedico dados) {
        var medico = new Medico(dados);
        repository.save(medico);
    }

    public Page<DadosListagemMedico> listar(Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao)
                .map(DadosListagemMedico::new);
    }

    @Transactional
    public void atualizar(DadosAtualizaMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @Transactional
    public void excluir(Long id) {
        var medico = repository.getReferenceById(id);
        medico.excluir();
    }
}
