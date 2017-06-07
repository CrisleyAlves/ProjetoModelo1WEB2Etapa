package br.edu.ifsul.dao;

import br.ifsul.edu.modelo.Instituicao;
import java.io.Serializable;

/**
 *
 * @author crisley
 */
public class InstituicaoDAO<T> extends DAOGenerico<Instituicao> implements Serializable{
 
    public InstituicaoDAO(){
        super();
        super.setClassePersistente(Instituicao.class);
    }
    
    
}
