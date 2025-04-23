public class Loja {
    private final int MAX = 100;

    private Funcionario[] funcionarios = new Funcionario[MAX];
    private Cliente[] clientes = new Cliente[MAX];
    private Fornecedor[] fornecedores = new Fornecedor[MAX];

    private int qtdFuncionarios = 0;
    private int qtdClientes = 0;
    private int qtdFornecedores = 0;

    public void empregar(Funcionario f) {
        if (qtdFuncionarios < MAX) {
            funcionarios[qtdFuncionarios++] = f;
            System.out.println("Funcionário contratado: " + f.getNome());
        } else {
            System.out.println("Limite de funcionários atingido.");
        }
    }

    public void demitir(int matricula) {
        boolean encontrado = false;
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i].getMatricula() == matricula) {
                // Remove deslocando os próximos
                for (int j = i; j < qtdFuncionarios - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[--qtdFuncionarios] = null;
                System.out.println("Funcionário de matrícula " + matricula + " foi demitido.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
        }
    }

    public void cadastrarCliente(Cliente c) {
        if (qtdClientes < MAX) {
            clientes[qtdClientes++] = c;
            System.out.println("Cliente cadastrado: " + c.getNome());
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    public void cadastrarFornecedor(Fornecedor f) {
        if (qtdFornecedores < MAX) {
            fornecedores[qtdFornecedores++] = f;
            System.out.println("Fornecedor cadastrado: " + f.getRazaoSocial());
        } else {
            System.out.println("Limite de fornecedores atingido.");
        }
    }

    public void listarFuncionarios() {
        System.out.println("\n--- Funcionários ---");
        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.println(funcionarios[i]);
        }
    }

    public void listarClientes() {
        System.out.println("\n--- Clientes ---");
        for (int i = 0; i < qtdClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    public void listarFornecedores() {
        System.out.println("\n--- Fornecedores ---");
        for (int i = 0; i < qtdFornecedores; i++) {
            System.out.println(fornecedores[i]);
        }
    }
}
