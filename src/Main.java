import br.com.teste.model.Funcionario;

void main() {
    List<Funcionario> Funcionarios = new ArrayList<>();

    //3.1 Adicionando funcionários manualmente conforme tabela informada

    Funcionarios.add(new Funcionario(
            "Maria",
            LocalDate.of(2000,10,18),
            new BigDecimal("2009.44"),
            "Operador"));
    Funcionarios.add(new Funcionario(
            "João",
            LocalDate.of(1990,05,12),
            new BigDecimal("2284.38"),
            "Operador"));
    Funcionarios.add(new Funcionario(
            "Caio",
            LocalDate.of(1961,5,2),
            new BigDecimal("9836.14"),
            "Coordenador"));
    Funcionarios.add(new Funcionario(
            "Miguel",
            LocalDate.of(1988,5,2),
            new BigDecimal("19119.88"),
            "Diretor"));
    Funcionarios.add(new Funcionario(
            "Alice",
            LocalDate.of(1995,1,5),
            new BigDecimal("2234.68"),
            "Recepcionista"));
    Funcionarios.add(new Funcionario(
            "Heitor",
            LocalDate.of(1999,11,19),
            new BigDecimal("1582.72"),
            "Operador"));
    Funcionarios.add(new Funcionario(
            "Arthur",
            LocalDate.of(1993,3,31),
            new BigDecimal("4071.84"),
            "Contador"));
    Funcionarios.add(new Funcionario(
            "Laura",
            LocalDate.of(1994,7,8),
            new BigDecimal("3017.45"),
            "Gerente"));
    Funcionarios.add(new Funcionario(
            "Heloísa",
            LocalDate.of(2003,5,24),
            new BigDecimal("1606.85"),
            "Eletricista"));
    Funcionarios.add(new Funcionario(
            "Helena",
            LocalDate.of(1996,9,2),
            new BigDecimal("2799.93"),
            "Gerente"));

    //3.2 Removendo funcionário "João" da lista
    Funcionarios.removeIf(f -> f.nome.equals("João"));

    //3.3 Imprimindo todos os funcionários com todas as suas informações
}
