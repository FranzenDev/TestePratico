import br.com.teste.model.Funcionario;

void main() {
    List<Funcionario> funcionarios = new ArrayList<>();

    //3.1 Adicionando funcionários manualmente conforme tabela informada

    funcionarios.add(new Funcionario(
            "Maria",
            LocalDate.of(2000,10,18),
            new BigDecimal("2009.44"),
            "Operador"));
    funcionarios.add(new Funcionario(
            "João",
            LocalDate.of(1990,05,12),
            new BigDecimal("2284.38"),
            "Operador"));
    funcionarios.add(new Funcionario(
            "Caio",
            LocalDate.of(1961,5,2),
            new BigDecimal("9836.14"),
            "Coordenador"));
    funcionarios.add(new Funcionario(
            "Miguel",
            LocalDate.of(1988,10,14),
            new BigDecimal("19119.88"),
            "Diretor"));
    funcionarios.add(new Funcionario(
            "Alice",
            LocalDate.of(1995,1,5),
            new BigDecimal("2234.68"),
            "Recepcionista"));
    funcionarios.add(new Funcionario(
            "Heitor",
            LocalDate.of(1999,11,19),
            new BigDecimal("1582.72"),
            "Operador"));
    funcionarios.add(new Funcionario(
            "Arthur",
            LocalDate.of(1993,3,31),
            new BigDecimal("4071.84"),
            "Contador"));
    funcionarios.add(new Funcionario(
            "Laura",
            LocalDate.of(1994,7,8),
            new BigDecimal("3017.45"),
            "Gerente"));
    funcionarios.add(new Funcionario(
            "Heloísa",
            LocalDate.of(2003,5,24),
            new BigDecimal("1606.85"),
            "Eletricista"));
    funcionarios.add(new Funcionario(
            "Helena",
            LocalDate.of(1996,9,2),
            new BigDecimal("2799.93"),
            "Gerente"));

    //3.2 Removendo funcionário "João" da lista
    funcionarios.removeIf(f -> f.nome.equals("João"));

    //3.3 Imprimindo todos os funcionários com todas as suas informações
    //Formantando data e decimal conforme o solicitado no enunciado
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0.00");

    //Imprimindo funcionários
    for(Funcionario f : funcionarios){
        System.out.println("Nome: " + f.nome);
        System.out.println("Data Nascimento: "+ f.dataNascimento.format(formatoData));
        System.out.println("Salário: " + formatoDecimal.format(f.salario));
        System.out.println("Função: " + f.funcao);
        System.out.println();
    }

    //3.4 aumento de 10% no salário e atualizar a lista com o novo valor
    BigDecimal aumentoSalario = new BigDecimal("1.10");

    for (Funcionario f : funcionarios){
        f.salario = f.salario.multiply(aumentoSalario);
    }

    //3.5 Agrupar os funcionários por função
    Map<String, List<Funcionario>> mapFuncionariosFuncao = new HashMap<>();

    for(Funcionario f: funcionarios){
        if(!mapFuncionariosFuncao.containsKey(f.funcao)){
            mapFuncionariosFuncao.put(f.funcao, new ArrayList<>());
        }
        mapFuncionariosFuncao.get(f.funcao).add(f);
    }

    //3.6 Exibir funcionários agrupados por função
    for(String funcao: mapFuncionariosFuncao.keySet()){
        System.out.println("Função: " + funcao);
        for(Funcionario f: mapFuncionariosFuncao.get(funcao)){
            System.out.println(" -- " + f.nome);
        }
        System.out.println();
    }

   //3.8 Exibir os funcionários que fazem aniversário no mês 10 e 12
    for(Funcionario f: funcionarios){
        int mes = f.dataNascimento.getMonthValue();
        if (mes == 10 || mes == 12){
            System.out.println(f.nome);
        }
    }
    System.out.println();

    //3.9 Exibir funcionário com maior idade, exibir atributos: nome e idade
    Funcionario maiorIdade = Collections.min(funcionarios, Comparator.comparing(f -> f.dataNascimento));
    int idade = Period.between(maiorIdade.dataNascimento,LocalDate.now()).getYears();
    System.out.println("Funcionário com maior idade: " + maiorIdade.nome + " " + idade + " anos.");
    System.out.println();

    //3.10 Exibir funcionários em ordem alfabética
    //ordenando lista
    funcionarios.sort(Comparator.comparing(f -> f.nome));

    System.out.println("Funcionários ordenados por nome em ordem alfabética:");
    for(Funcionario f : funcionarios){
        System.out.println(f.nome);
    }
}
