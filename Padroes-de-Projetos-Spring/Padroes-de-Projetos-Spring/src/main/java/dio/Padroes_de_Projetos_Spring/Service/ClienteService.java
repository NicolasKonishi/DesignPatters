package dio.Padroes_de_Projetos_Spring.Service;


import dio.Padroes_de_Projetos_Spring.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}