package com.lifedev.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.lifedev.erp.model.Empresa;
import com.lifedev.erp.repository.Empresas;
import com.lifedev.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Empresas empresas;

    @Transacional
    public void salvar(Empresa empresa) {
        empresas.guardar(empresa);
    }

    @Transacional
    public void excluir(Empresa empresa) {
        empresas.remover(empresa);
    }

}
