public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Funcionario f1 = new Funcionario("João", "Rua A", "9999-1111", "123.456.789-00", 'M', 1,111 ,2500.0 ,"Vendedor");
        Funcionario f2 = new Funcionario("Ana", "Rua B", "9999-2222", "987.654.321-00", 'F', 2,222 ,3000.0 ,"Caixa");

        loja.empregar(f1);
        loja.empregar(f2);

        Cliente c1 = new Cliente("Carlos", "Rua C", "9999-3333", "111.222.333-44", 'M', 1,"Engenheiro" , "Eletrônicos", 5000.0);
        Cliente c2 = new Cliente("Beatriz", "Rua D", "9999-4444", "555.666.777-88", 'F', 2, "Advogada", "Moda",4500.0 );

        loja.cadastrarCliente(c1);
        loja.cadastrarCliente(c2);


        Fornecedor for1 = new Fornecedor("Fornecedor A", "Rua X", "9999-5555", "12.345.678/0001-00","Limpeza" ,"Produtos A");
        Fornecedor for2 = new Fornecedor("Fornecedor B", "Rua Y", "9999-6666", "98.765.432/0001-99", "Entretenimento","Produtos B");

        loja.cadastrarFornecedor(for1);
        loja.cadastrarFornecedor(for2);

        loja.listarFuncionarios();
        loja.listarClientes();
        loja.listarFornecedores();

        loja.demitir(1);

        loja.listarFuncionarios();
    }
}
